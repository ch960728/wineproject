package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.QnADAO;

@WebServlet("/QnaAService")
public class QnaAService extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		int q_id = Integer.parseInt(request.getParameter("q_id"));
		String a_text = request.getParameter("a_text");
		
		System.out.println("서블릿");
		System.out.println("답변자"+id);
		System.out.println("질문번호"+q_id);
		System.out.println("질문 내용"+a_text);
		System.out.println("------");
		QnADAO dao = new QnADAO();
		int cnt = dao.Awrite(q_id,  a_text);
		
		
		if (cnt > 0) {
			System.out.println("답변 등록 완료");
			HttpSession session = request.getSession();
			session.setAttribute("id", id);
			response.sendRedirect("qna.jsp");
		}
		
	}

}
