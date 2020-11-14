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
		//1. ����ڰ� � �̸����� �����ϰ� ������
		String email = request.getParameter("email");
		
		//2.DAO�� �����ؼ� ���̺� �ִ� �̸��� �� ����
		ProjectDAO dao = new ProjectDAO();
		int cnt = dao.delete(email);
		
		
		//3.Member.jsp�������� �̵�
		
		if (cnt > 0) {
			
			response.sendRedirect("member.jsp");
		}else {
			System.out.println("Ȯ�����ּ���");
		}
	}

}
