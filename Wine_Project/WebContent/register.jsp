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
        System.out.println("회원가입"+ten);
        %>
        <div id="login_box">
            <h1 style="margin-top: 70px;">회원가입</h1>
			<form action="JoinService" method="post">
                    <div id="login_box2">
                    <input type="text" name = "id" class="login" placeholder="아이디"/>
                    <input type="password" name = "pw" class="login" placeholder="비밀번호"/>
                    <input type="password" name = "pw2" class="login" placeholder="비밀번호 확인"/>
                    <input type="text" name = "name" class="login" placeholder="이름"/>
                    </div>
            <div id="login_box3">
                <div style="    background: none;
                                padding: 6px 60px 10px 2px;
                                margin: 10px 0px 15px 50px;
                                
                               " >
                    <input type="radio" name="sex" value= 'M'>남 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <input type="radio" name="sex" value= 'F' >여 
                </div>
                    <input type="date" name="birth" value='1999-01-01' class="login" placeholder="Birth" 
                            style="padding-right: 90px;">
                <input type="text" name="tel" class="login" placeholder="핸드폰번호 ">
                <input type="text" name="mail" class="login" placeholder="이메일">
                <input type = "text" name = "tendency" class="login" value=<%=ten%>>

   </div> 
     
    <input type="submit" class="btn" value="Register"
    style="position:absolute; margin-top: 330px;  margin-left: 310px;"/>  
    </form>
        </div>
        

    </body>
</html>