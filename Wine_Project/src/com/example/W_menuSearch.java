package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.WineDAO;

/**
 * Servlet implementation class W_menuSearch
 */
@WebServlet("/W_menuSearch")
public class W_menuSearch extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String menu = request.getParameter("Menu");
		WineDAO dao = new WineDAO();
		
		dao.WMenuSearch(menu);

	}

}
