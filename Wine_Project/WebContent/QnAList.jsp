<%@page import="com.vo.QnAVO"%>
<%@page import="com.dao.QnADAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

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
	System.out.println(id);
	%>

	<%
		try {
			QnADAO dao = new QnADAO();
			ArrayList<QnAVO> arr = dao.QShow();
			if (arr.isEmpty()) {
			%>질문이 없어용<%
			} else {
					for (int i = 0; i < arr.size(); i++) {
	%>
	<tr>
		<td><%=arr.get(i).getId()%></a></td>
		<td><%=arr.get(i).getQ_text()%></td>
		<td><%=arr.get(i).getQ_date()%></td>
		<td><%=arr.get(i).getA_text()%></td>
		<%
			if(id.equals("admin")){
				%>
				<form action="QnaAService" method="post">
				<input type="hidden" name="q_id" value=<%=arr.get(i).getQ_id() %>> 
				<input type="hidden" name="id" value="admin">
				<input type="text" name="a_text"> 
				<input type="submit" value="답변하기">
				</form>
				<%
			}
		%>
	</tr>
	<br>
	<%
		}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	%>
	
	
	<form action="QnaQService" method="POST">
		<input type="hidden" name="id" value=<%=id %>> 
		<input type="text" name="q_text"> 
		<input type="submit" value="질문하기">
	</form>

</body>
</html>