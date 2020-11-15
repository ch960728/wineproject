<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.vo.ProjectVo"%>
<%@page import="com.dao.ProjectDAO"%>
<%@page import="com.vo.CommVo"%>
<%@page import="com.dao.CommunityDAO"%>
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
	%>

		<%
                  try {
         	         ProjectDAO dao = new ProjectDAO();
         	         ArrayList<ProjectVo> arr= dao.Mypage(id);
         	        	 %>
         	        	  <tr>
                          <td>아이디:<%=arr.get(0).getId() %></td>
                          <td>이름:<%=arr.get(0).getUser_name() %></td>
                          <td>메일:<%=arr.get(0).getMail() %></td>
                          <td>전화:<%=arr.get(0).getTel() %></td>
                          <td>성향:<%=arr.get(0).getTendency() %></td>
                          <td>성별:<%=arr.get(0).getSex() %></td>
                          <td>생일:<%=arr.get(0).getBirth() %></td>
                          <td>가입일:<%=arr.get(0).getJoin_date() %></td>
                        </tr>
         	       <%
					
         	       } catch (Exception e) {
         	         // TODO Auto-generated catch block
         	         e.printStackTrace();
         	      }
                  %>
                  
                  <%
                  try {
          	         CommunityDAO dao = new CommunityDAO();
          	         ArrayList<CommVo> arr= dao.commSelect();
          	         %>
          	         <p>
          	         <tr>작성한 글 보기</tr>
          	         <%
 					for(int i=0; i<arr.size(); i++){
          	        	 %>
          	        	  <ul>
                           <li><a href='Cinfo.jsp?c_id=<%=arr.get(i).getC_id()%>'><%=arr.get(i).getTitle() %></a></li>
                         </ul>      
                         <%
                         System.out.println(arr.get(i).getTitle());
                         %>
          	       <%
 					}
          	       } catch (Exception e) {
          	         // TODO Auto-generated catch block
          	         e.printStackTrace();
          	      }
                  %>
                  
</body>
</html>