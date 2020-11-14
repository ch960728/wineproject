package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.ProjectDAO;


@WebServlet("/DeleteService")
public class DeleteService extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 사용자가 어떤 이메일을 삭제하고 싶은지
		String email = request.getParameter("email");
		
		//2.DAO로 연결해서 테이블에 있는 이메일 값 삭제
		ProjectDAO dao = new ProjectDAO();
		int cnt = dao.delete(email);
		
		
		//3.Member.jsp페이지로 이동
		
		if (cnt > 0) {
			
			response.sendRedirect("member.jsp");
		}else {
			System.out.println("확인해주세용");
		}
	}

}
