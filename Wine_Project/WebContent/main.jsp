<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.vo.WineVo"%>
<%@page import="com.dao.WineDAO"%>
<%@page import="com.vo.WineVo"%>
<%@page import="com.dao.WineDAO"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
	
<!-- 추가 -->
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
<meta name="description" content="Simple Multi-Item Slider: Category slider with CSS animations" />
<meta name="keywords" content="jquery plugin, item slider, categories, apple slider, css animation" />
<meta name="author" content="Codrops" />
<link rel="shortcut icon" href="../favicon.ico"> 
<script src="js/js_main/jquery.catslider.js"></script>
<script src="js/js_main/modernizr.custom.63321.js"></script>

<title>Moschino | Minimalist Free HTML Portfolio by WowThemes.net</title>
<link rel='stylesheet' href='css/bootstrap/woocommerce-layout.css' type='text/css' media='all'/>
<link rel='stylesheet' href='css/bootstrap/woocommerce-smallscreen.css' type='text/css' media='only screen and (max-width: 768px)'/>
<link rel='stylesheet' href='css/bootstrap/woocommerce.css' type='text/css' media='all'/>
<link rel='stylesheet' href='css/bootstrap/font-awesome.min.css' type='text/css' media='all'/>
<link rel='stylesheet' href='css/pages/style.css' type='text/css' media='all'/>
<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Oswald:400,500,700%7CRoboto:400,500,700%7CHerr+Von+Muellerhoff:400,500,700%7CQuattrocento+Sans:400,500,700' type='text/css' media='all'/>
<link rel='stylesheet' href='css/bootstrap/easy-responsive-shortcodes.css' type='text/css' media='all'/>
<link rel="stylesheet" href="css/pages/main.css" type='text/css' media='all'/>


</head>
<body class="home page page-template page-template-template-portfolio page-template-template-portfolio-php">

<%
	//사용자 seesion----------------------------------------------------
	String id = (String)session.getAttribute("id");
	String u_id =(String)session.getAttribute("u_id");
	//사용자 seesion----------------------------------------------------
%>


<div id="page">
		
		
	<%@include file ="header.jsp" %>	
	<div class="container2">	
	<header id="masthead" class="site-header" >	
			<!-- 상세검색 -->
		<div style="padding-top:50px">	
		<%@include file ="WineSearchForm.jsp" %>
		</div>
		</header>

		<!-- 슬라이더 -->
		<div class="container3">	
			<div class="main_slider">
				<div id="mi-slider" class="mi-slider">
				
				<!-- 와인 불러오는 묶음1----------------------------- -->
					<%
                  try {
         	         WineDAO dao = new WineDAO();
         	         
         	         ArrayList<WineVo> arr= dao.WineList();
         	         %>
         	         <ul>
         	         <%
					for(int i=0; i<4; i++){
					%>
					<li><a class="woocommerce-main-image zoom" href="#"></a>
               			<a href='shop_detail.jsp?wine_id=<%=arr.get(i).getWine_id()%>'>
               			<img src="upload/<%= arr.get(i).getImg()%>">
					<h3><%=arr.get(i).getW_name() %></h3></a>
					</li>
					<%
					}
         	       } catch (Exception e) {
         	         // TODO Auto-generated catch block
         	         e.printStackTrace();
         	      }
                 	%> 
                 </ul>
                 
                 <!-- 와인 불러오는 묶음1----------------------end------- -->
                 
                 
                 
				<!-- 와인 불러오는 묶음2----------------------------- -->
					<%
                  try {
         	         WineDAO dao = new WineDAO();
         	         
         	         ArrayList<WineVo> arr= dao.wineScore();
         	         %>
         	         <ul>
         	         <%
					for(int i=0; i<arr.size(); i++){
					%>
					<li><a class="woocommerce-main-image zoom" href="#">
               			<a href='shop_detail.jsp?wine_id=<%=arr.get(i).getWine_id()%>'>
               			<img src="upload/<%= arr.get(i).getImg()%>">
					<h3><%=arr.get(i).getW_name() %></h3></a>
					</li>
					<%
					}
         	       } catch (Exception e) {
         	         // TODO Auto-generated catch block
         	         e.printStackTrace();
         	      }
                 	%> 
                 </ul>
                 
                 <!-- 와인 불러오는 묶음2----------------------end------- -->
                 
                 
					<nav>
						<a href="#">오늘의 와인</a>
						<a href="#">추천와인</a><!-- 이건 불러와서 해보자~~~ -->
						<a href="#">평점높은와인</a>
					</nav>
				</div>
			</div>
		</div>
		<!-- /container3 -->

	</div>
	<!-- /container2 -->
	<section id="banner">
	<div class="content">
			<h1>와인 기본 상식!! </h1>
			<p>A free and fully responsive site template</p>
		<p>Aenean ornare velit lacus, ac varius enim ullamcorper eu. Proin aliquam facilisis ante interdum congue. Integer mollis, nisl amet convallis, porttitor magna ullamcorper, amet egestas mauris. Ut magna finibus nisi nec lacinia. Nam maximus erat id euismod egestas. Pellentesque sapien ac quam. Lorem ipsum dolor sit nullam.</p>
		<ul class="actions">
			<li><button class="button_wineN"><a href="dic.html">와인백과사전으로 가기</a></button></li>
		</ul>
	</div>
	<span class="image object">
		<img src="images/shop/2wine.jpg" alt="" />
	</span>
	</section>

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
<script src='js/tabs.js'></script>
<script src='js/accordion.js'></script>
<script src='js/toggle.js'></script>
<script src='js/masonry.pkgd.min.js'></script>

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
<script src="js/js_main/jquery.catslider.js"></script>
<script>
	$(function() {
		$( '#mi-slider' ).catslider();
	});
</script>
</body>
</html>