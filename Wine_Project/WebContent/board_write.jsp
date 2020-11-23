<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
<body class="single single-post">

	<%
		String id = (String)session.getAttribute("id");
	%>

<div id="page">
	<div class="container">
		<header id="masthead" class="site-header">
		<div class="site-branding">
			<h1 class="site-title"><a href="search.html" rel="Search">Dionysus</a></h1>
			<h2 class="site-description">너 때문에 흥이 깨져버렸으니 책임져</h2>

			<button style="float:right;
			margin-top: 15px;
			background-color: #ffffff;
			border:none;">Logout</button>
			<button style="float:right;
			margin-top: 15px;
			background-color: #ffffff;
			border:none;
			">My page</button>
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
				
			</ul>
		</div>
		</nav>
		</header>
		
				
				<!-- .nav-links -->
				</nav>
				<!-- .navigation -->
				<div id="comments" class="comments-area">
					<div id="respond" class="comment-respond">
						<h3 id="reply-title" class="comment-reply-title">Q&A <small><a rel="nofollow" id="cancel-comment-reply-link" href="/demo-Dionysus/embed-audio/#respond" style="display:none;">Cancel reply</a></small></h3>
						<form action="CommService" method="post" id="commentform" class="comment-form" enctype="multipart/form-data">
								
								<input type="text"  class="input-field" name = "title" placeholder="제목" required>
								
                            <input type="file" name = "file" class="image_inputType_file">
                    
							<input type="hidden" name="id" value=<%=id %> id="comment_post_ID">
							
							
							<p class="comment-form-comment">
								<textarea name = "content" rows = "15" cols = "40"></textarea>
							</p>
							<p class="form-submit">
                                
                                <input name="submit" type="submit" id="submit" class="submit" value="등록하기" href="blog-single.html">
                                <a href="blog-single.html">게시판으로 돌아가기</a>
                                <input type="hidden" name="comment_post_ID" value="90" id="comment_post_ID">
								<input type="hidden" name="comment_parent" id="comment_parent" value="0">
							</p>
							<noscript>
							</noscript>
						</form>
					</div>
					<!-- #respond -->
				</div>
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
<script src='js/photo.js'></script>
<script src='js/photo_pre.js'></script>

</body>
</html>