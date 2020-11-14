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
		
		String tel = request.getParameter("pw");
		String pw = request.getParameter("tel");
		
		
		HttpSession session = request.getSession();
		String email = (String)session.getAttribute("email");
		
		ProjectDAO dao = new ProjectDAO();
		//int cnt = dao.Update(pw,tel,email);
		//if (cnt > 0) {
			response.sendRedirect("login.html");
		}
	}
}

	
	

