package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.CommunityDAO;

@WebServlet("/CReplyService")
public class CReplyService extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");


		String id = request.getParameter("id");
		String creply = request.getParameter("creply");
		
		System.out.println("아이디"+id);
		System.out.println("creply"+creply);
		
		CommunityDAO dao = new CommunityDAO();
		dao.creply(id, creply);
		
	}

}
