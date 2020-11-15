<%@page import="com.vo.CommVo"%>
<%@page import="com.dao.CommunityDAO"%>
<%@page import="com.vo.cReplyVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	int c_id = Integer.parseInt(request.getParameter("c_id"));
	System.out.println(c_id);
%>

	<tr>
	<td>
	
		<%
                  try {
         	         CommunityDAO dao = new CommunityDAO();
         	         ArrayList<cReplyVO> arr= dao.rcommShow(c_id);
					for(int i=0; i<arr.size(); i++){
         	        	 %>
          	        	  <tr>
                          <td><%=arr.get(i).getRc_id() %></td>
                         <td><%=arr.get(i).getId() %></td>
                         <td><%=arr.get(i).getC_id() %></td>
                          <td><%=arr.get(i).getR_text() %></td>
                          <td><%=arr.get(i).getR_date() %></td>
                        </tr>      
                        <%
                      
                        System.out.println(arr.get(i).getRc_id());
                        System.out.println(arr.get(i).getId());
                        System.out.println(arr.get(i).getC_id());
                        System.out.println(arr.get(i).getR_text());
                        System.out.println(arr.get(i).getR_date());
                        
       
                        %>
         	       <%
					}
         	       } catch (Exception e) {
         	         // TODO Auto-generated catch block
         	         e.printStackTrace();
         	      }
                  %> 
                  </td>
	</tr>
	
</body>
</html>