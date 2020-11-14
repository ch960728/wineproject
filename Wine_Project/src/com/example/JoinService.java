package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ProjectDAO;



/**
 * Servlet implementation class JoinService
 */
@WebServlet("/JoinService")
public class JoinService extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String mail = request.getParameter("mail");
		String tel = request.getParameter("tel");
		String tendency = request.getParameter("tendency");
		String sex = request.getParameter("sex");
		String birth = request.getParameter("birth");
		System.out.println(name+ id+  pw+  mail+ tel+ tendency+ sex+  birth);
		
		
		ProjectDAO dao = new ProjectDAO();
		int cnt = dao.Join(name, id,  pw,  mail, tel, tendency, sex,  birth );
		// db conn
		if (cnt > 0) {
			
			response.sendRedirect("Login.jsp");
		}
	}
}
