package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.vo.WineVo;
import com.vo.MyScoreVo;
public class WineDAO {

	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	int cnt = 0;
	int c_count= 0;
	int pagePerList = 40;//한 화면에 보여줄 리스트 갯수
	int pagingCount = 10;//페이징 범위의 갯수

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
	
	//와인 상품 리스트에 출력
		public ArrayList<WineVo> WineList() {
			WineVo vo = null; 
			ArrayList<WineVo> arr = new ArrayList<>();
			try {
				getConn();

				// ---------------------------------------------------------------

				String sql = "select * from wine";

				psmt = conn.prepareStatement(sql);
				rs = psmt.executeQuery();

				while (rs.next()) {
					int wine_id = rs.getInt(1);
					String w_name = rs.getString(2);
					//String w_namee = rs.getString(3);
					//String productk = rs.getString(4);
					//String producte = rs.getString(5);
					//String locationk = rs.getString(6);
					//String locatione = rs.getString(7);
					//String kind = rs.getString(8);
					String kinds = rs.getString(9);
					//String use = rs.getString(10);
					//String alcohol = rs.getString(11);
					//String temper = rs.getString(12);
					//String grade = rs.getString(13);
					//String sugar = rs.getString(14);
					//String acidity = rs.getString(15);
					//String body = rs.getString(16);
					//String tannin = rs.getString(17);
					String price = rs.getString(18);
					//String remark = rs.getString(19);
					//String year = rs.getString(20);
					//String liter = rs.getString(21);
					//String fruit = rs.getString(22);
					//String flower = rs.getString(23);
					//String vegetable = rs.getString(24);
					//String spice = rs.getString(25);
					//String mineral = rs.getString(26);
					//String chemistry = rs.getString(27);
					//String animal = rs.getString(28);
					//String burnt = rs.getString(29);
					//String balsamic = rs.getString(30);
					//String scent = rs.getString(31);
					//String menu = rs.getString(32);
					String img = rs.getString(33);

					vo = new WineVo(wine_id, w_name, kinds, price,img);
					System.out.println("DAO="+w_name+ kinds+ price+img);				
					arr.add(vo);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				close();
			}
			return arr;
		}
		//와인 상세 보기
		public ArrayList<WineVo> SelectWine(int wine_id) {
			WineVo vo = null; 
			ArrayList<WineVo> arr = new ArrayList<>();
			try {
				getConn();

				// ---------------------------------------------------------------
				String sql = "select * from wine where wine_id=?";
				psmt = conn.prepareStatement(sql);
				psmt.setInt(1, wine_id);
				rs = psmt.executeQuery();
				
				if (rs.next()) {
					//int wine_id = rs.getInt(1);
					String w_name = rs.getString(2);
					String w_namee = rs.getString(3);
					//String productk = rs.getString(4);
					String producte = rs.getString(5);
					String locationk = rs.getString(6);
					//String locatione = rs.getString(7);
					String kind = rs.getString(8);
					String kinds = rs.getString(9);
					String use = rs.getString(10);
					String alcohol = rs.getString(11);
					String temper = rs.getString(12);
					String grade = rs.getString(13);
					String sugar = rs.getString(14);
					String acidity = rs.getString(15);
					String body = rs.getString(16);
					String tannin = rs.getString(17);
					String price = rs.getString(18);
					String remark = rs.getString(19);
					String year = rs.getString(20);
					String liter = rs.getString(21);
					String fruit = rs.getString(22);
					String flower = rs.getString(23);
					String vegetable = rs.getString(24);
					String spice = rs.getString(25);
					String mineral = rs.getString(26);
					String chemistry = rs.getString(27);
					String animal = rs.getString(28);
					String burnt = rs.getString(29);
					String balsamic = rs.getString(30);
					String scent = rs.getString(31);
					String menu = rs.getString(32);
					String img = rs.getString(33);
					vo = new WineVo(w_name,w_namee, producte ,locationk, kind, kinds, use, alcohol, temper, grade, sugar, acidity,body,tannin,price,remark, year, liter, fruit, flower, vegetable, spice, mineral, chemistry, animal, burnt, balsamic, scent, menu, img);
					System.out.println(w_name+"\n"+w_namee+"\n"+ producte +"\n"+locationk+"\n"+ kind+"\n"+ kinds+"\n"+ use+ "\n"+alcohol+"\n"+ temper+"\n"+
					grade+ "\n"+sugar+ "\n"+acidity+"\n"+body+"\n"+tannin+"\n"+price+remark+"\n"+ year+"\n"+ liter+ "\n"+fruit+"\n"+ flower+"\n"+ vegetable+ "\n"+spice+"\n"+ mineral+"\n"+
							chemistry+"\n"+ animal+"\n"+ burnt+"\n"+ balsamic+"\n"+ scent+"\n"+ menu+"\n"+ img);
					arr.add(vo);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				close();
			}
			return arr;
		}
		int[] startEnd = new int[2];
		//페이징
			public int[] paging(int page) {
				try {
					getConn();
					String sql = "select count(*) from wine";
					psmt = conn.prepareStatement(sql);
					rs = psmt.executeQuery();
					
					// 전체 게시물 갯수로 총 페이지 수 산출 (하나도 없으면 null 리턴)
					int totalContent = 0;
					int totalPage = 0;
					while (rs.next()) {
						totalContent += rs.getInt(1);
					}
					if (totalContent == 0) {
						return null;
					}
					totalPage = totalContent /pagePerList; // 최종 전체 페이지 갯수
					if (totalContent % pagePerList > 0) {
						totalPage++;	// 나머지가 있다면 1을 더해줌
					}
					int startPage, endPage; // 시작과 끝 페이지
					startPage = ((page - 1) / pagingCount) * pagingCount
							+ 1;
					endPage = startPage + pagingCount - 1;
					if (endPage > totalPage) {
						endPage = totalPage;
					}
					startEnd = new int[2]; // 결과를 전달해줄 배열
					startEnd[0] = startPage;
					startEnd[1] = endPage;
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}finally {
					close();
				}
				return startEnd;
			}
		
		
		//와인 점수 주기
		public int SetScore(String id, int wine_id, int score,String rw_text ) {
			System.out.println("와인 점수 주기 호출");
			try {
				getConn();
				String sql = "insert into wine_score values(wine_score_seq.nextval,?,?,?,?,sysdate)";
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, id);
				psmt.setInt(2, wine_id);
				psmt.setInt(3, score);
				psmt.setString(4, rw_text);
				cnt = psmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				close();
			}
			return cnt;
		}
		//마이페이지에서 점수준 와인 보기
		public ArrayList<MyScoreVo> MyWineScore(String id) {
			MyScoreVo vo = null; 
			ArrayList<MyScoreVo> arr = new ArrayList<>();
			try {
				getConn();

				// ---------------------------------------------------------------
				String sql = "select wine.w_name, wine.img, wine_score.wr_id,"
						+ "wine_score.id, wine_score.wine_id,"
						+ "wine_score.score,wine_score.rw_text,wine_score.rw_date"
						+ " from wine, wine_score where wine.wine_id=wine_score.wine_id and wine_score.id=?";
				psmt = conn.prepareStatement(sql);
				psmt.setString(1, id);
				rs = psmt.executeQuery();
				
				if (rs.next()) {
					String w_name = rs.getString(1);
					String img = rs.getString(2);
					int wr_id  = rs.getInt(3);
					id = rs.getString(4);
					int wine_id = rs.getInt(5);
					int score = rs.getInt(6);
					String rw_text = rs.getString(7);
					String rw_date = rs.getString(8);
					
					vo = new MyScoreVo(w_name,img,wr_id,id, wine_id ,score, rw_text, rw_date);
					System.out.println(w_name+img+wr_id+id+ wine_id +score+ rw_text+ rw_date);
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
