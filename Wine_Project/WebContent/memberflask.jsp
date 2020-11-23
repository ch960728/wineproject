<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import="com.vo.ProjectVo"%>
<%@page import="com.dao.ProjectDAO"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%

	String id = (String)session.getAttribute("id");
	String u_id =(String)session.getAttribute("u_id");
	int cnt = 0;
         	   
%>
         	       
<h1>데이터 전송</h1>
<%=id %><br>
<%=u_id %>  
             <!-- <form action="test" method="GET"> -->
			<form action="http://127.0.0.1:5000/userflask" method="get">
			 <input type = "text" name = "user_id" value ="<%=u_id%>">
			 <input type = "text" name = "id" value ="<%=id%>">
			 <input type="submit" value="전송">
			</form>


</body>
</html>