package com.ajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ProjectDAO;

/**
 * Servlet implementation class AjaxCall
 */
@WebServlet("/AjaxCall")
public class AjaxCall extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("서버페이지 호출");
		
		String email = request.getParameter("email");
		System.out.println(email);
		
		ProjectDAO dao = new ProjectDAO();
		
		//boolean check = dao.idCheck(email);
		
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();
		//out.print(check);
	}

}
