<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		String id = (String)session.getAttribute("id");
	%>
 <form id="inputreply" action="CReplyService" class="input-group" method="post">
    <textarea name = "creply" rows = "4" cols = "40"></textarea>
    <input type="hidden" name="id" value=<%=id %> id="comment_post_ID">
    <button class="submit">��� ���</button>
</form>

</body>
</html>