<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8"/>
        <meta name="author" content="wasiii"/>
        <title>Register</title>
        <link href="css/pages/register.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>
        <%
        String ten = request.getParameter("ten");
        System.out.println("ȸ������"+ten);
        %>
        <div id="login_box">
            <h1 style="margin-top: 70px;">ȸ������</h1>
			<form action="JoinService" method="post">
                    <div id="login_box2">
                    <input type="text" name = "id" class="login" placeholder="���̵�"/>
                    <input type="password" name = "pw" class="login" placeholder="��й�ȣ"/>
                    <input type="password" name = "pw2" class="login" placeholder="��й�ȣ Ȯ��"/>
                    <input type="text" name = "name" class="login" placeholder="�̸�"/>
                    </div>
            <div id="login_box3">
                <div style="    background: none;
                                padding: 6px 60px 10px 2px;
                                margin: 10px 0px 15px 50px;
                                
                               " >
                    <input type="radio" name="sex" value= 'M'>�� &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <input type="radio" name="sex" value= 'F' >�� 
                </div>
                    <input type="date" name="birth" value='1999-01-01' class="login" placeholder="Birth" 
                            style="padding-right: 90px;">
                <input type="text" name="tel" class="login" placeholder="�ڵ�����ȣ ">
                <input type="text" name="mail" class="login" placeholder="�̸���">
                <input type = "text" name = "tendency" class="login" value=<%=ten%>>

   </div> 
     
    <input type="submit" class="btn" value="Register"
    style="position:absolute; margin-top: 330px;  margin-left: 310px;"/>  
    </form>
        </div>
        

    </body>
</html>