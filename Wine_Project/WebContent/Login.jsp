<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<html>
    <head>
        <title>Login</title>
        <link rel="stylesheet" href="css/login.css">
    </head>
    <body>
        <div class="wrap">
            <div class="form-wrap">
                <div class="button-wrap">
                    <div id="btn"></div>
                    <button type="button" class="togglebtn" onclick="login()">LOG IN</button>
                    <button type="button" class="togglebtn" onclick="register()">REGISTER</button>
                </div>
               
                <form id="login" action="LoginService" class="input-group" method="post">
                    <input type="text"  class="input-field" name = "id" placeholder="���̵�" required>
                    <input type="password" class="input-field" name="pw" placeholder="��й�ȣ" required>
                    <button class="submit">Login</button>
                </form>
                
                <form id="register" action="JoinService" class="input-group" method="post">
                   

                    <input type="text" name="id" class="input-field" placeholder="���̵�">
                    <input type="password" name="pw" class="input-field" placeholder="��й�ȣ">
                    <input type="password" name="pw" class="input-field" placeholder="��й�ȣ Ȯ��">
                    <input type="text" name="name" class="input-field" placeholder="�̸�">
                
                 <div class = "input-field" >
                    <input type="radio" name="sex" value= 'M' class="Sex" style="margin-top: 10px;">���� &nbsp;&nbsp;
                    <input type="radio" name="sex" value= 'F' class="Sex">���� &nbsp;&nbsp;
                 </div>
                    <input type="date" name="birth" value='1999-01-01' class="input-field" placeholder="Birth">
                <input type="text" name="tel" class="input-field" placeholder="��ȭ��ȣ '-'�� �����ϰ� �Է��� �ּ��� ex)01011111111">
                <input type="text" name="mail" class="input-field" placeholder="�̸���">            
                   

                    <button class="submit">REGISTER</button>
                </form>
            </div>
        </div>
        <script>
            var x = document.getElementById("login");
            var y = document.getElementById("register");
            var z = document.getElementById("btn");
            
            
            function login(){
                x.style.left = "50px";
                y.style.left = "450px";
                z.style.left = "0";
            }

            function register(){
                x.style.left = "-400px";
                y.style.left = "50px";
                z.style.left = "110px";
            }
        </script>
    </body>
</html> 