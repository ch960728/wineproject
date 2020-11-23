package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.CommunityDAO;

@WebServlet("/CReplyService")
public class CReplyService extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");


		String id = request.getParameter("id");
		int c_id = Integer.parseInt(request.getParameter("c_id"));
		String rc_text = request.getParameter("creply");
		
		System.out.println("서블릿");
		System.out.println("댓글 단 사람 아이디 서블렛"+id);
		System.out.println("게시글 번호"+c_id);
		System.out.println("댓글내용"+rc_text);
		System.out.println("------");
		CommunityDAO dao = new CommunityDAO();
		int cnt = dao.creply(id,c_id, rc_text);
		
		if(cnt>0) {
			System.out.println("댓글 등록 완료");
			HttpSession session = request.getSession();
			session.setAttribute("id", id);
			response.sendRedirect("board_show.jsp?c_id="+c_id);
			System.out.println("댓글이후 페이지 새로고침"+c_id+ id);
		}
		
		
	}

}
