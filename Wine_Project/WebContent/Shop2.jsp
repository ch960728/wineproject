<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.vo.WineVo"%>
<%@page import="com.dao.WineDAO"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Moschino | Minimalist Free HTML Portfolio by WowThemes.net</title>
<link rel='stylesheet' href='css/bootstrap/woocommerce-layout.css' type='text/css' media='all'/>
<link rel='stylesheet' href='css/bootstrap/woocommerce-smallscreen.css' type='text/css' media='only screen and (max-width: 768px)'/>
<link rel='stylesheet' href='css/bootstrap/woocommerce.css' type='text/css' media='all'/>
<link rel='stylesheet' href='css/bootstrap/font-awesome.min.css' type='text/css' media='all'/>
<link rel='stylesheet' href='css/pages/style.css' type='text/css' media='all'/>
<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Oswald:400,500,700%7CRoboto:400,500,700%7CHerr+Von+Muellerhoff:400,500,700%7CQuattrocento+Sans:400,500,700' type='text/css' media='all'/>
<link rel='stylesheet' href='css/bootstrap/easy-responsive-shortcodes.css' type='text/css' media='all'/>
</head>
<body class="archive post-type-archive post-type-archive-product woocommerce woocommerce-page">

<%
	String wineName = request.getParameter("wineName");
	String id = (String)session.getAttribute("id");
	System.out.print("접속한 id"+id);
%>

<div id="page">
	<div class="container">
		<header id="masthead" class="site-header">
		<div class="site-branding">
			<h1 class="site-title"><a href="main.html" rel="home">Moschino</a></h1>
			<h2 class="site-description">Minimalist Portfolio HTML Template</h2>
		</div>
		<nav id="site-navigation" class="main-navigation">
		<button class="menu-toggle">Menu</button>
		<a class="skip-link screen-reader-text" href="#content">Skip to content</a>
		<div class="menu-menu-1-container">
			<ul id="menu-menu-1" class="menu">
				<li><a href="main.html">메인페이지</a></li>
				<li><a href="dic.html">와인 백과사전</a></li>
				<li><a href="shop.html">검색하기</a></li>
				
				<li><a href="#">커뮤니티</a>
				<ul class="sub-menu">
					
					<li><a href="board.html">게시판</a></li>
					<li><a href="qna.html">Q&A</a></li>
					
				</ul>
				</li>
				<li><a href="contact.html">설문조사</a></li>
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
			<label class=""> 와인종류
   			 	<input type="checkbox" class=""><span>화이트와인</span>
   				 <input type="checkbox" class=""><span>레드와인</span>
   				 <input type="checkbox" class=""><span>로제</span>
   				 <input type="checkbox" class=""><span>스파클링</span>
			</label>
						<!-- 당도 -->
		<div class="row">
        <div class="col-xs-6">
        <p>당도</p>
          <div class="range">
            <input type="range" name="range" min="1" max="5" value="3" onchange="range.value=value">
            <output id="range">3</output>
          </div>
        </div>
        				<!-- 산도 -->
        <div class="row">
        <div class="col-xs-6">
        <p>산도</p>
          <div class="range range-primary">
            <input type="range" name="range" min="1" max="5" value="3" onchange="rangePrimary.value=value">
            <output id="rangePrimary">3</output>
          </div>
        </div>
      </div>		
      					<!-- 바디 -->
      	<div class="row">  
        <div class="col-xs-6">
        <p>바디</p>
          <div class="range range-success">
            <input type="range" name="range" min="1" max="5" value="3" onchange="rangeSuccess.value=value">
            <output id="rangeSuccess">3</output>
          </div>
        </div>
     				   <!-- 타닌 -->
     	<div class="row">
        <div class="col-xs-6">
        <p>타닌</p>
          <div class="range range-info">
            <input type="range" name="range" min="1" max="5" value="3" onchange="rangeInfo.value=value">
            <output id="rangeInfo">3</output>
          </div>
        </div>
        
		</div>
		</div>
			</div>
		</nav>
		</header>
		
		
		<!-- #masthead -->
		<div id="content" class="site-content">
			<div id="primary" class="content-area column full">
				<main id="main" class="site-main" role="main">
				<p class="woocommerce-result-count">
					 Showing 1–8 of 12 results
				</p>
				<form class="woocommerce-ordering" method="get">
					<select name="orderby" class="orderby">
						<option value="menu_order" selected="selected">Default sorting</option>
						<option value="popularity">Sort by popularity</option>
						<option value="rating">Sort by average rating</option>
						<option value="date">Sort by newness</option>
						<option value="price">Sort by price: low to high</option>
						<option value="price-desc">Sort by price: high to low</option>
					</select>
				</form>
				
						<%
                  try {
         	         WineDAO dao = new WineDAO();
         	         
         	        ArrayList<WineVo> arr= dao.WNameSearch(wineName);
         	         %>
         	         <ul class="products">
         	         <%
					for(int i=0; i<arr.size(); i++){
                        System.out.println(arr.get(i).getW_name());
                        System.out.println(arr.get(i).getKinds());
                        System.out.println(arr.get(i).getPrice());
                        System.out.println(arr.get(i).getImg());
				%>
					
					<li class="product">
					<a href="shop_detail.html">
              		 <div>
               		<a href='shop_detail.jsp?wine_id=<%=arr.get(i).getWine_id()%>'><img class="aa" src="upload/<%= arr.get(i).getImg()%>"/></a>
               		</div>
              			 <!-- 와인명 -->
					<h3><%=arr.get(i).getW_name() %></h3>
					<!-- 와인 종류  -->
					<span class="#"><span class="amount"><%=arr.get(i).getKinds() %></span></span>
						<!-- 와인가격  -->
					<span class="price"><span class="amount"><%=arr.get(i).getPrice() %></span></span>
						<!--  버튼-->
					</a><a href="shop_detail.html" class="button">상세정보</a>
					</li>
				
				<%
					}
         	       } catch (Exception e) {
         	         // TODO Auto-generated catch block
         	         e.printStackTrace();
         	      }
                 %> 
                 </ul>
				<nav class="woocommerce-pagination">
				<ul class="page-numbers">
					<li><span class="page-numbers current">1</span></li>
					<li><a class="page-numbers" href="#">2</a></li>
					<li><a class="next page-numbers" href="#">→</a></li>
				</ul>
				</nav>
				</main>
				<!-- #main -->
			</div>
			<!-- #primary -->
		</div>
		<!-- #content -->
	</div>
	<!-- .container -->
	<footer id="colophon" class="site-footer">
	<div class="container">
		<div class="site-info">
			<h1 style="font-family: 'Herr Von Muellerhoff';color: #ccc;font-weight:300;text-align: center;margin-bottom:0;margin-top:0;line-height:1.4;font-size: 46px;">Moschino</h1>
			Shared by <i class="fa fa-love"></i><a href="https://bootstrapthemes.co">BootstrapThemes</a>

		</div>
	</div>
	</footer>
	<a href="#top" class="smoothup" title="Back to top"><span class="genericon genericon-collapse"></span></a>
</div>
<!-- #page -->
<script src='js/jquery.js'></script>
<script src='js/plugins.js'></script>
<script src='js/scripts.js'></script>
<script src='js/masonry.pkgd.min.js'></script>
<script src='js/accordion.js'></script>
<script src='js/toggle.js'></script>
<script src='js/masonry.pkgd.min.js'></script>
</body>
</html>