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
            <h1 style="margin-top: 70px;">�α���</h1>
		
                    <div id="login_box2" >
                    
                    <input type="text" name="id" class="login" placeholder="���̵� �Է����ּ���" required/><br>
                    <input type="password" name="pw" class="login" placeholder="��й�ȣ�� �Է����ּ���" required/>
                    
                    </div>

     
    <input type="submit" class="btn" value="Login"style="position:absolute; margin-top: 330px;  margin-left: 310px;"/>  
        </div>
     </form>  

    </body>
</html>