package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.QnADAO;

@WebServlet("/QnaQService")
public class QnaQService extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String q_text = request.getParameter("q_text");

		if (id.equals("null")) {
			response.sendRedirect("PlzLogin.jsp");
		} else {

			System.out.println("서블릿");
			System.out.println("아이디" + id);
			System.out.println("질문 내용" + q_text);
			System.out.println("------");
			QnADAO dao = new QnADAO();
			int cnt = dao.Qwrite(id, q_text);

			if (cnt > 0) {
				System.out.println("질문 등록 완료");
				HttpSession session = request.getSession();
				session.setAttribute("id", id);
				response.sendRedirect("qna.jsp");
			}
		}
	}
}
