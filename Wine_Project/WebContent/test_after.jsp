<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
		<title>Identity by HTML5 UP</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="css/pages/test_after.css" />
		<noscript><link rel="stylesheet" href="assets/css/noscript.css" /></noscript>
	</head>
	<body class="is-preload">
		<%
		String ten = request.getParameter("ten");
		String ten_img = ten+".png";
		System.out.println(ten);
		%>

		<!-- Wrapper -->
			<div id="wrapper">
				<!-- Main -->
					<section id="main">
						<div class="test_pic"
						style="margin-top:0px;">
						<img src="images/test/<%=ten_img%>" alt="My Image">
						</div>
						
						<div style="margin-top:8px;">
							<button><a href="test_before.html">다시하기</a></button>
						<button><a href="register.jsp?ten=<%=ten%>">회원가입</a></button>
						<button><a href="main.jsp">메인으로</a></button>
						</div>

			</div>

		<!-- Scripts -->
			<script>
				if ('addEventListener' in window) {
					window.addEventListener('load', function() { document.body.className = document.body.className.replace(/\bis-preload\b/, ''); });
					document.body.className += (navigator.userAgent.match(/(MSIE|rv:11\.0)/) ? ' is-ie' : '');
				}
			</script>
			<script src="scroll.js"></script>
			
			
	</body>
</html>