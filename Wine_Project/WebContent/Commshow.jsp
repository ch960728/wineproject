<%@page import="com.vo.CommVo"%>
<%@page import="com.dao.CommunityDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%@ page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Dionysus | Minimalist Free HTML Portfolio by WowThemes.net</title>
<link rel='stylesheet' href='css/woocommerce-layout.css' type='text/css' media='all'/>
<link rel='stylesheet' href='css/woocommerce-smallscreen.css' type='text/css' media='only screen and (max-width: 768px)'/>
<link rel='stylesheet' href='css/woocommerce.css' type='text/css' media='all'/>
<link rel='stylesheet' href='css/font-awesome.min.css' type='text/css' media='all'/>
<link rel='stylesheet' href='css/style.css' type='text/css' media='all'/>
<link rel='stylesheet' href='https://fonts.googleapis.com/css?family=Oswald:400,500,700%7CRoboto:400,500,700%7CHerr+Von+Muellerhoff:400,500,700%7CQuattrocento+Sans:400,500,700' type='text/css' media='all'/>
<link rel='stylesheet' href='css/easy-responsive-shortcodes.css' type='text/css' media='all'/>
</head>
<body class="single single-post">




<div id="page">
	<div class="container">
		<header id="masthead" class="site-header">
		<div class="site-branding">
			<h1 class="site-title"><a href="index.html" rel="Search">Dionysus</a></h1>
			<h2 class="site-description">Minimalist Portfolio HTML Template</h2>
		</div>
		<nav id="site-navigation" class="main-navigation">
		<button class="menu-toggle">Menu</button>
		<a class="skip-link screen-reader-text" href="#content">Skip to content</a>
		<div class="menu-menu-1-container">
			<ul id="menu-menu-1" class="menu">
				<li><a href="index.html">Search</a></li>
				
				<li><a href="shop.html">Shop</a></li>
				
				<li><a href="#">Pages</a>
				<ul class="sub-menu">
					<li><a href="board.html">게시판</a></li>
					<li><a href="qna.html">Q&A</a></li>
					
				</ul>
				</li>
				<li><a href="contact.html">Contact</a></li>
			</ul>
		</div>
		</nav>
		</header>
		<!-- 게시판 글씨 -->
		<div id="content" class="site-content">
			<div id="primary" class="content-area column two-thirds">
				<main id="main" class="site-main" role="main">
				<article>
				<header class="entry-header">
				<h1 class="entry-title">게시판</h1>
				<div class="entry-meta">
						<span class="posted-on"><time class="entry-date published">여러사람들과 소통해 보세요.</time></span>						
						
					</div>
				<div class="entry-thumbnail">					
					<img src="http://s3.amazonaws.com/caymandemo/wp-content/uploads/sites/10/2015/09/30160348/sep4.jpg" alt="">
				</div>
				</header>
				<!-- .entry-header -->
				<div class="entry-content">
					<!-- 게시판 -->
					<div class="container" style="margin-top:2%">
						
						<div class="row">
							<div class="col-md-3" style="float: right;">
								<form action="#" method="get">
									<div class="input-group">
										<!-- 게시판 검색 -->
										<input class="form-control" id="system-search" name="q" placeholder="Search for" required>
										<!-- 게시판 검색아이콘 -->
										<button type="button" class="searchBtn" id="searchBtn"></button>
									</div>
								</form>
							</div>
							<div class="col-md-9">
								<!-- 정말 테이블만 -->
							 <table class="table table-striped" style="text-align: center;">
										<thead>
											<tr>
												<th width=200 style="word-break:break-all">Title</th>
												<th width=50 style="word-break:break-all">Writer</th>
												<th width=50 style="word-break:break-all">Date</th>
												<th width=50 style="word-break:break-all">View</th>
                                            </tr>
										</thead>
										<tbody>
			 	<%
                  try {
         	         CommunityDAO dao = new CommunityDAO();
         	         ArrayList<CommVo> arr= dao.commSelect();
					for(int i=0; i<arr.size(); i++){
         	        	 %>
         	        	  <tr>
                          <td><a href='Cinfo.jsp?c_id=<%=arr.get(i).getC_id()%>'><%=arr.get(i).getTitle() %></a></td>
                          <td><%=arr.get(i).getId() %></td>
                          <td><%=arr.get(i).getC_date() %></td>
                          <td><%=arr.get(i).getC_count() %></td>
                        </tr>      
                        <%
                        System.out.println(arr.get(i).getTitle());
                        System.out.println(arr.get(i).getId());
                        System.out.println(arr.get(i).getC_date());
                        System.out.println(arr.get(i).getC_count());
                        %>
         	       <%
					}
         	       } catch (Exception e) {
         	         // TODO Auto-generated catch block
         	         e.printStackTrace();
         	      }
                  %> 
										</tbody>
                                    </table>		 
							</div>
						</div>
					</div>
					<!-- 게시판 끝 -->
				</div> 
				<!-- .entry-content -->
				<footer class="entry-footer">
				</footer>
				<!-- .entry-footer -->
				</article>
				<!-- #post-## -->
				<nav class="navigation post-navigation" role="navigation">
				<h1 class="screen-reader-text">Post navigation</h1>
				<!-- .nav-links -->
				</nav>
				
				<!-- #comments -->
				</main>
				<!-- #main -->
			</div>
			
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
</body>
</html>