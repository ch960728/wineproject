<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id = (String)session.getAttribute("id");
	System.out.println(id);
%>
<form action="UpdateService" method="post" >
	<input type="hidden" name="id" value=<%=id %>>
    <input type="password" name="newPw" value="새로운 비밀번호"><!-- 게시글 번호도 보내 줘야 함 -->
	<button class="submit">변경하기</button>
</form>
</body>
</html>