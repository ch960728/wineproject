<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<body id="page-top">

	<%
		String id = (String)session.getAttribute("id");
	%>

	<p><%=id %></p>


<a href="InputComm.jsp">게시판 글작성으로 이동</a>
</body>
</html>