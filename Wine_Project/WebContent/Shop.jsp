<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.vo.WineVo"%>
<%@page import="com.dao.WineDAO"%>
<%@page import="com.vo.WineVo"%>
<%@page import="com.dao.WineDAO"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html lang="UTF-8"">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Dionysus | 너 때문에 술이 깨져버렸으니 책임져</title>
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
	//사용자 seesion----------------------------------------------------
	String id = (String)session.getAttribute("id");
	String u_id =(String)session.getAttribute("u_id");
	//사용자 seesion----------------------------------------------------
%>

<div id="page">
	<div class="container">

	<%@include file ="header.jsp" %>
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
				<ul class="products">
				
					<li class="first product">
					<a href="shop_detail.html">
					<span class="onsale">hit!</span>
					<img src="http://s3.amazonaws.com/caymandemo/wp-content/uploads/sites/10/2015/09/10175658/j4-520x520.jpg" alt="">
						<!-- 사진 -->
              		 <div>
               		<a href="shop_detail.html"><img class="aa" src="images/shop/2wine.jpg" alt=""></a>
               		</div>
              			 <!-- 와인명 -->
					<h3>와인 이름</h3>
					<!-- 와인 종류  -->
					<span class="#"><span class="amount">분류(레드,화이트,로제,스파클링)</span></span>
						<!-- 와인가격  -->
					<span class="price"><span class="amount">가격(000,000원)</span></span>
						<!--  버튼-->
					</a><a href="shop_detail.html" class="button">상세정보</a>
					</li>

					<li class="product">
					<a href="shop_detail.html">
					<img src="http://s3.amazonaws.com/caymandemo/wp-content/uploads/sites/10/2015/09/10175658/j10-520x780-520x600.jpg" alt="">
					<h3>Beige Blouse</h3>
					<span class="price"><span class="amount">$66.00</span></span>
					</a><a href="#" class="button">Add to cart</a>
					</li>
					
					<li class="product">
					<a href="shop_detail.html">
					<img src="http://s3.amazonaws.com/caymandemo/wp-content/uploads/sites/10/2015/09/10175658/j1-520x780-520x600.jpg" alt="">
					<h3>Black Jacket</h3>
					<span class="price"><span class="amount">$125.00</span></span>
					</a><a href="#" class="button">Add to cart</a>
					</li>
					
					<li class="last product">
					<a href="shop_detail.html">
					<img src="http://s3.amazonaws.com/caymandemo/wp-content/uploads/sites/10/2015/09/10175658/j9-520x780-520x600.jpg" alt="">
					<h3>Brown Jacket</h3>
					<span class="price"><span class="amount">$28.00</span></span>
					</a><a href="#" class="button">Add to cart</a>
					</li>
					
					<li class="first product">
					<a href="shop_detail.html">
					<img src="http://s3.amazonaws.com/caymandemo/wp-content/uploads/sites/10/2015/09/10175658/j12-520x668-520x600.jpg" alt="">
					<h3>Gray Blouse</h3>
					<span class="price"><span class="amount">$15.00</span></span>
					</a><a href="#" class="button">Add to cart</a>
					</li>
					
					<li class="product">
					<a href="shop_detail.html">
					<img src="http://s3.amazonaws.com/caymandemo/wp-content/uploads/sites/10/2015/09/10175658/f11-520x755-520x600.jpg" alt="">
					<h3>Male Bag</h3>
					<span class="price"><span class="amount">$16.00</span></span>
					</a><a href="#" class="button">Add to cart</a>
					</li>
					
					<li class="product">
					<a href="shop_detail.html">
					<img src="http://s3.amazonaws.com/caymandemo/wp-content/uploads/sites/10/2015/09/10175658/j6-520x779-520x600.jpg" alt="">
					<h3>Hugo Jeans</h3>
					<span class="price"><span class="amount">$36.00</span></span>
					</a><a href="#" class="button">Add to cart</a>
					</li>
					
					<li class="last product">
					<a href="shop_detail.html">
					<img src="http://s3.amazonaws.com/caymandemo/wp-content/uploads/sites/10/2015/09/10175658/j2-520x780-520x600.jpg" alt="">
					<h3>Male T-Shirt</h3>
					<span class="price"><span class="amount">$49.00</span></span>
					</a><a href="#" class="button">Add to cart</a>
					</li>
					
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
			<h1 style="font-family: 'Herr Von Muellerhoff';color: #ccc;font-weight:300;text-align: center;margin-bottom:0;margin-top:0;line-height:1.4;font-size: 46px;">Dionysus</h1>
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