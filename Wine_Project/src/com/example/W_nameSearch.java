package com.example;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.WineDAO;
import com.vo.WineVo;


@WebServlet("/W_nameSearch")
public class W_nameSearch extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String wineName = request.getParameter("wineName");
		WineDAO dao = new WineDAO();
		
		dao.WNameSearch(wineName);;
	}
}
