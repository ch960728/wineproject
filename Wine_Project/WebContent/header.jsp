<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<header id="masthead" class="site-header">
	<div style = "position: absolute">
		<div class="site-branding" style ="float:left; margin-right:550px; padding-bottom:100px" >
			<h1 class="site-title"><a href="main.jsp" rel="home">Dionysus</a></h1>
				<h2 class="site-description">Smart Wine Recommand System </h2>
		</div>
			<div style ="float:left; padding-top:75px;"><!-- 로그인, 회원가입----------------------------------------------------------------------------------------- -->
			<%if(id==null) {%>
			
			<button  style ="float:left;" onclick="location.href='register.jsp'" style = "margin-left: 10%; background-color: #ffffff; border:none;">Register</button>
			<button  style ="float:left;" onclick="location.href='Login.jsp'" style = "margin-left: 10%; margin-bottom:10px; background-color: #ffffff; border:none;">Login</button> <br>
			
			<%}else{%>
				<button  style ="float:left;" onclick="location.href='MyPage.jsp'" style = "margin-left: 10%; background-color: #ffffff; border:none;">Mypage</button>
				<button   style ="float:left;" onclick="location.href='./LogoutService'" style = "margin-left: 10%; margin-bottom:10px; background-color: #ffffff; border:none;">Logout</button> <br>
			<%} %>
			</div>
	</div>
		<nav id="site-navigation" class="main-navigation" style="margin-top:150px">
		<button class="menu-toggle">Menu</button>
		<div class="menu-menu-1-container" >
			<ul id="menu-menu-1" class="menu">
				<li><a href="main.jsp">메인페이지</a></li>
				<li><a href="dic.html">와인 백과사전</a></li>
				<li><a href="board.jsp">게시판</a></li>
				<li><a href="qna.html">Q&A</a></li>
				<li><a href="mypage.jsp">마이페이지</a></li>
			</ul>
		</div>
		</nav>
				<!-----  검색 search창 ------>
		<nav id="site-navigation" class="main-navigation">
			<!-- dropbar +,- 드롭바  -->
			<div class='search'>
				<form method="post" action="#">
					<input type="text" name="search" id="search" placeholder="Search">
					<button href=#>검색</button>
				</form>
			</div>		
			<!-- 상세검색 range -->	
			<div class="wpcmsdev-toggle">
			<h3 class="toggle-title"><a class="menu-menu-1-container" href="#toggle-what-is-lore-ipsum"><i class="fa fa-plus icon-for-inactive"></i><i class="fa fa-minus icon-for-active"></i>상세검색</a></h3>				
		<div id="toggle-what-is-lore-ipsum" class="toggle-content" >	
						<!-- 와인종류  -->
					<div class="row">
			        <div class="col-xs-6">
						<%@include file ="WineSearchForm.jsp" %>
			        </div>
        </div>
        </div>
        	</div>
		
					</nav>
		</header>
