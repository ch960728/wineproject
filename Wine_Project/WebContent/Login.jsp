<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8"/>
        <meta name="author" content="wasiii"/>
        <title>Login</title>
        <link href="css/pages/login.css" rel="stylesheet" type="text/css"/>

    </head>
    <body>
     <form id="login" action="LoginService" method="post">  
        <div id="login_box">
            <h1 style="margin-top: 70px;">로그인</h1>
		
                    <div id="login_box2" >
                    
                    <input type="text" name="id" class="login" placeholder="아이디를 입력해주세요" required/><br>
                    <input type="password" name="pw" class="login" placeholder="비밀번호를 입력해주세요" required/>
                    
                    </div>

     
    <input type="submit" class="btn" value="Login"style="position:absolute; margin-top: 330px;  margin-left: 310px;"/>  
        </div>
     </form>  

    </body>
</html>