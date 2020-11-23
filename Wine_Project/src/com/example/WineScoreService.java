package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.WineDAO;

@WebServlet("/WineScoreService")
public class WineScoreService extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		int u_id = Integer.parseInt(request.getParameter("u_id"));
		int wine_id = Integer.parseInt(request.getParameter("wine_id"));
		int score = Integer.parseInt(request.getParameter("score"));
		String rw_text = request.getParameter("rw_text");
		
		System.out.println("서블릿");
		System.out.println("점수 준 사람"+u_id);
		System.out.println("와인 번호"+wine_id);
		System.out.println("점수"+score);
		System.out.println("댓글 내용"+rw_text);
		System.out.println("------");
		WineDAO dao = new WineDAO();
		int cnt = dao.SetScore(u_id,wine_id,score,rw_text);
		
		if(cnt>0) {
			System.out.println("댓글 등록 완료");
			HttpSession session = request.getSession();
			session.setAttribute("id", id);
			response.sendRedirect("shop_detail.jsp?wine_id="+wine_id);
		}
		
		
	}

}
