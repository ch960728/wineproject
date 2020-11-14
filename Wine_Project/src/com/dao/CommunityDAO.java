package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.vo.CommVo;

public class CommunityDAO {
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	int cnt = 0;
	int c_count= 0;

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
	//���ۼ�
	public int CWrite(String c_title, String id, String c_text, 
						String c_img) {
		try {
			getConn();
			String sql = "insert into community values(comm_seq.nextval,?,?,?,?,?,sysdate)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, c_title);
			psmt.setString(2, id);//����� ���̵� ���ǰ����� �޾ƿ;���.... jsp���� �ذ�����
			psmt.setString(3, c_text);
			psmt.setString(4, c_img);
			psmt.setInt(5, c_count);
			cnt = psmt.executeUpdate();
			System.out.println("�� ��� �Լ� ����");
			System.out.println(c_title);
			System.out.println(id);
			System.out.println(c_text);
			System.out.println(c_img);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return cnt;
	}
	
	
	//�Խñ� Ŭ���ϸ� ��ȸ�� ����
	public int Ccount(int c_id) {
		try {
			getConn();
			String sql = "update community set c_count = c_count+1 where c_id=?)";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, c_id);
			cnt = psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return cnt;
	}
	//�Խ��� ��� ���
	public int creply(String id, String r_text) {
		try {
			getConn();
			String sql = "insert into wine_member values(member_seq.nextval,?,?,sysdate)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id); //session���� �޾ƿ;���
			psmt.setString(2, r_text);
			cnt = psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return cnt;

	}
	//��ǰ ����Ʈ ����
	public ArrayList<CommVo> commSelect() {
		CommVo vo = null; // ��ü ����
		ArrayList<CommVo> arr = new ArrayList<>();
		System.out.println("Ŀ�´�Ƽ �Լ� ȣ��");
		try {
			getConn();

			// ---------------------------------------------------------------

			String sql = "select * from community";

			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
				int c_id = rs.getInt(1);
				String title = rs.getString(2);
				String id = rs.getString(3);
				String c_text = rs.getString(4);
				String c_img = rs.getString(5);
				int c_count = rs.getInt(6);
				String c_date = rs.getString(7);

				// VO(DTO) : ��Ⳣ�� �����͸� ��/������ �� ����ϴ� ���ο� ������ Ÿ��

				vo = new CommVo(c_id, title, id, c_text, c_img, c_count, c_date);
				System.out.println(title+id+c_date+c_count);				
				arr.add(vo);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return arr;
	}
	
	//Ŀ�´�Ƽ �󼼺���
		public ArrayList<CommVo> CommInfo(int c_id) {
			CommVo vo = null; // ㅇ??
			ArrayList<CommVo> arr = new ArrayList<>();
			
			System.out.println("Ŀ�´�Ƽ �󼼺��� �Լ� ȣ��");
			try {
				getConn();

				// ---------------------------------------------------------------

				String sql = "select * from community where c_id = ?";

				psmt = conn.prepareStatement(sql);
				psmt.setInt(1, c_id); //session���� �޾ƿ;���
				rs = psmt.executeQuery();

				if(rs.next()) {
					String title = rs.getString(2);
					String id = rs.getString(3);
					String c_text = rs.getString(4);
					String c_img = rs.getString(5);
					int c_count = rs.getInt(6);
					String c_date = rs.getString(7);
					vo = new CommVo(c_id, title, id, c_text, c_img, c_count, c_date);
					System.out.println(title+id+c_date+c_count+c_img);				
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
