package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.vo.CommVo;
import com.vo.cReplyVO;

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
	//게시글 쓰기
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
			//System.out.println("");
			//System.out.println(c_title);
			//System.out.println(id);
			//System.out.println(c_text);
			//System.out.println(c_img);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return cnt;
	}
	
	
	//게시판 조회수 증가
	public int Ccount(int c_id) {
		System.out.println("조회수 증가 함수 호출");
		try {
			getConn();
			String sql = "update community set c_count = c_count+1 where c_id=?";
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
	//게시글 댓글 등록
	public int creply(String id,  int c_id, String rc_text) {
		System.out.println("DAO"+id+c_id+rc_text);
		try {
			getConn();
			String sql = "insert into c_reply values(rcomm_seq.nextval,?,?,?,sysdate)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id); //session에서 받아오자
			psmt.setInt(2,c_id);
			psmt.setString(3, rc_text);
			
			cnt = psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return cnt;

	}
	//게시글 가져오기
	public ArrayList<CommVo> commSelect() {
		CommVo vo = null; 
		ArrayList<CommVo> arr = new ArrayList<>();
		System.out.println("게시글 등록함수 호출");
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
	
	//게시글 상세보기
		public ArrayList<CommVo> CommInfo(int c_id) {
			CommVo vo = null;
			ArrayList<CommVo> arr = new ArrayList<>();
			
			System.out.println("게시글 상세보기");
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
	//댓글 보기
		public ArrayList<cReplyVO> rcommShow(int c_id) {
			cReplyVO vo = null; // 
			ArrayList<cReplyVO> arr = new ArrayList<>();
			System.out.println("게시글 댓글 함수 호출");
			try {
				getConn();

				// ---------------------------------------------------------------

				String sql = "select * from c_reply where c_id=? ";


				psmt = conn.prepareStatement(sql);
				psmt.setInt(1, c_id); //session���� �޾ƿ;���
				rs = psmt.executeQuery();

				while(rs.next()) {
					int rc_id = rs.getInt(1);
					String id = rs.getString(2);
					c_id = rs.getInt(3);
					String rc_text = rs.getString(4);
					String rc_date = rs.getString(5);
					vo = new cReplyVO(rc_id, id, c_id, rc_text, rc_date);
					System.out.println(rc_id+ id+ c_id+ rc_text+ rc_date);				
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
