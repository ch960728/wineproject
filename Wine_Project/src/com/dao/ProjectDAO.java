package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.ArrayList;

import com.vo.ProjectVo;

public class ProjectDAO {

	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	int cnt = 0;

	public void getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "hr";
			String dbpw = "hr";

			conn = DriverManager.getConnection(url, dbid, dbpw);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void close() {
		try {
			if(rs!=null) {
				rs.close();
			}
			if(psmt!=null) {
				psmt.close();
			}
			if(conn!=null) {
				psmt.close();
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
    //ȸ������
	public int Join(String name, String id, String pw, String mail,String tel,String tendency,String sex, String birth ) {
		try {
			getConn();
			String sql = "insert into wine_member values(member_seq.nextval,?,?,?,?,?,?,?,?,sysdate)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			psmt.setString(2, id);
			psmt.setString(3, pw);
			psmt.setString(4, mail);
			psmt.setString(5, tel);
			psmt.setString(6, "none"); //�������縦 ���ϰ� ȸ�������� ���� ��� none�� ����
			psmt.setString(7, sex);
			psmt.setString(8, birth);

			cnt = psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return cnt;

	}
	//�������縦 ���� ȸ�������� �� ���, Session���� tendency�� �޾ƿ;� �ҵ�
	public int Join2(String name, String id, String pw, String mail,String tel,String tendency,String sex, String birth ) {
		try {
			getConn();
			String sql = "insert into wine_member values(member_seq.nextval,?,?,?,?,?,?,?,?,sysdate)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			psmt.setString(2, id);
			psmt.setString(3, pw);
			psmt.setString(4, mail);
			psmt.setString(5, tel);
			psmt.setString(6, tendency);
			psmt.setString(7, sex);
			psmt.setString(8, birth);

			cnt = psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return cnt;

	}
	
	//�α���
	public boolean Login(String id, String pw) {
		boolean check = false;
		try {
			getConn();
			// ---------------------------------------------------------------

			String sql = "select * from wine_member where id =? and pw = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);

			rs = psmt.executeQuery();

			if (rs.next()) {
				check = true;
			} else {
				check = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return check;
	}
	//�������� ���� ���� ������Ʈ
	public int change_ten(String id, String tendency) {
		try {
			getConn();
			String sql = "update wine_member set tendency=? where id=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, tendency);
			psmt.setString(2, id);
			
			cnt = psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return cnt;

	}
	//��� vo�������� id�� ������
	public ArrayList<ProjectVo> memeberSelect() {
		ProjectVo vo = null; // ��ü ����
		ArrayList<ProjectVo> arr = new ArrayList<>();

		try {
			getConn();

			// ---------------------------------------------------------------

			String sql = "select * from project_member";

			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				int u_id  = rs.getInt(1);
				String user_name  = rs.getString(2);
				String id =  rs.getString(3);
				String mail = rs.getString(4);
				String tel = rs.getString(5);
				String tendency = rs.getString(6);
				String sex = rs.getString(7);
				String birth = rs.getString(8);
				String join_date = rs.getString(9);

				// VO(DTO) : ��Ⳣ�� �����͸� ��/������ �� ����ϴ� ���ο� ������ Ÿ��

				vo = new ProjectVo(u_id,user_name,id,mail,tel,tendency,
						sex, birth, join_date);
				arr.add(vo);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return arr;
	}
	
	
}
