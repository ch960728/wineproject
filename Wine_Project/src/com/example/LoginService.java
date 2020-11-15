package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.ProjectDAO;


@WebServlet("/LoginService")
public class LoginService extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
	
		System.out.println("사용자id"+id);
		System.out.println("사용자pw"+pw);
		
		ProjectDAO dao = new ProjectDAO();
		boolean check = dao.Login(id,pw);
		
		//---------------------------------------------------------------------------
		//db conn
		try {
			if(check==true) {
				HttpSession session = request.getSession();
				session.setAttribute("id", id);
				response.sendRedirect("index.jsp");
				System.out.println("로그인성공");
			}else {
				System.out.println("로그인실패");
			}
	         
	       
	      } catch (Exception e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }
	}

}
