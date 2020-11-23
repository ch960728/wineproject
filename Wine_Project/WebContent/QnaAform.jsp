<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<%
	String id = (String)session.getAttribute("id");
	System.out.println(id);
%>
<body>
	<form action="QnaQService" method="POST">
		<input type="hidden" name="id" value=<%=id %>> 
		<input type="text" name="q_text"> 
		<input type="submit" value="등록하기">
	</form>
</body>
</html>