
package com.example;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.WineDAO;
import com.vo.WineVo;

@WebServlet("/W_optionSearch")
public class W_optionSearch extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		
		//kind
		String kinds = request.getParameter("Kinds");
		System.out.println("kinds"+kinds);
		//use
		String use = request.getParameter("use");
		System.out.println("use"+use);
		// 성분 검색
		//sugar
		String sugar = request.getParameter("sugar");
		System.out.println("sugar"+sugar);
		//acidity
		String acidity = request.getParameter("acidity");
		System.out.println("acidity"+acidity);
		//body
		String body = request.getParameter("body");
		System.out.println("body"+body);
		//tannin
		String tannin = request.getParameter("tannin");
		System.out.println("tannin"+tannin);
		//price
		String minprice = request.getParameter("minprice");
		System.out.println("minprice"+minprice);
		String maxprice = request.getParameter("maxprice");
		System.out.println("maxprice"+maxprice);
		//scent
		String scent = request.getParameter("scent");
		System.out.println("scent"+scent);
		
		WineDAO dao = new WineDAO();			
		dao.WtasteSearch(kinds, use, sugar, acidity, body, tannin, minprice,maxprice, scent);

		
	}

}
