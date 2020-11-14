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
    //회원가입
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
			psmt.setString(6, "none"); //설문조사를 안하고 회원가입을 했을 경우 none을 넣음
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
	//설문조사를 통해 회원가입을 할 경우, Session으로 tendency를 받아와야 할듯
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
	
	//로그인
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
	//설문조사 이후 성향 업데이트
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
	//멤버 vo가져오기 id만 가져옴
	public ArrayList<ProjectVo> memeberSelect() {
		ProjectVo vo = null; // 객체 생성
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

				// VO(DTO) : 모듈끼리 데이터를 송/수신할 때 사용하는 새로운 데이터 타입

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
