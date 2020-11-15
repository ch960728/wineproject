package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.ProjectDAO;

@WebServlet("/UpdateService")
public class UpdateService extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int newPw = Integer.parseInt(request.getParameter("newPw"));
		
		
		HttpSession session = request.getSession();
		String id = (String)session.getAttribute("id");
		System.out.println("변경할 id, pw: "+id+ newPw);
		ProjectDAO dao = new ProjectDAO();
		int cnt = dao.Update(id,newPw);
		if (cnt > 0) {
			response.sendRedirect("login.html");
		}
	}
}

	
	

