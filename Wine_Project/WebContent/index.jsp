<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<body id="page-top">
	
	<%
		String id = (String)session.getAttribute("id");
	%>
	
	<p><%=id %></p>

<a href="Login.jsp">로그인으로 이동</a>
<a href="InputComm.jsp">게시판 글작성으로 이동</a>
<a href="Commshow.jsp">게시판 목록으로 이동</a>
<a href="PwChange.jsp">비밀번호 바꾸기</a>
<a href="MyPage.jsp">마이페이지</a>
<a href="LogoutService">로그아웃</a>
<a href="MemberShow.jsp">회원조회</a>
<a href="Shop.jsp">상품보기</a>
</body>
</html>