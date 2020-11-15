<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.vo.ProjectVo"%>
<%@page import="com.dao.ProjectDAO"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String id = (String)session.getAttribute("id");
	
		if(id.equals("admin")){
	%>
		<%
                  try {
         	         ProjectDAO dao = new ProjectDAO();
         	         ArrayList<ProjectVo> arr= dao.memeberSelect();
         	        for(int i=0; i<arr.size(); i++){
         	        	 %>
         	        	  <tr>
                          <td>아이디:<%=arr.get(i).getId() %></td>
                          <td>이름:<%=arr.get(i).getUser_name() %></td>
                          <td>메일:<%=arr.get(i).getMail() %></td>
                          <td>전화:<%=arr.get(i).getTel() %></td>
                          <td>성향:<%=arr.get(i).getTendency() %></td>
                          <td>성별:<%=arr.get(i).getSex() %></td>
                          <td>생일:<%=arr.get(i).getBirth() %></td>
                          <td>가입일:<%=arr.get(i).getJoin_date() %></td>
                        </tr>
                        <p>
         	       <%
         	        }
         	       } catch (Exception e) {
         	         // TODO Auto-generated catch block
         	         e.printStackTrace();
         	      }
                  %>
                  
	
	<%	
	
		}else{
	%>
		페이지를 이용하실 수 없습니다.		
	<%
		}
	%>
	
</body>
</html>