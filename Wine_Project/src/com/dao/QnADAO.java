package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.vo.QnAVO;

public class QnADAO {
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	int cnt = 0;
	int c_count = 0;

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
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				psmt.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int Qwrite(String id, String q_text) {
		try {
			getConn();
			String sql = "insert into qna (q_id,id,q_text,a_text,q_date)values(q_seq.nextval,?,?,?,sysdate)";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, q_text);
			psmt.setString(3, "답변을 기다리고 있어요.");
			cnt = psmt.executeUpdate();
			System.out.println("qna글 작성");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}
	//답변
	public int Awrite(int q_id, String a_text) {
		try {
			getConn();
			String sql = "update qna set a_text=? where q_id=?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, a_text);
			psmt.setInt(2, q_id);
			

			cnt = psmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return cnt;

	}
	
	public ArrayList<QnAVO> QShow() {
		QnAVO vo = null; // 
		ArrayList<QnAVO> arr = new ArrayList<>();
		System.out.println("질문리스트 출력");
		try {
			getConn();

			// ---------------------------------------------------------------

			String sql = "select * from qna";

			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while(rs.next()) {
				int q_id = rs.getInt(1);
				String id = rs.getString(2);
				String q_text = rs.getString(3);
				String a_text = rs.getString(4);
				String q_date = rs.getString(5);
				vo = new QnAVO(q_id, id, q_text, a_text, q_date);
				System.out.println(q_id+ id+ q_text+ a_text+ q_date);				
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