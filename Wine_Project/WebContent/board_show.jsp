<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.vo.CommVo"%>
<%@page import="com.dao.CommunityDAO"%>
<%@page import="com.vo.cReplyVO"%>
<%@ page import="java.util.*"%>
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
	int c_id = Integer.parseInt(request.getParameter("c_id"));
	System.out.println(c_id);
	String id = (String)session.getAttribute("id");
	System.out.print("댓글 단 사람 ID"+id);
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
			border:none;">Logout</button>
			
			
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

		
		<!-- 게시판 글씨 -->
		<div id="content" class="site-content">
			<div id="primary" class="content-area column two-thirds"
			style="margin-bottom: 30px;">
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
										<button ref="#" style="width: 70px; height: 30px; font-size: 20%;
										">검색</button>
										 
									</div>
								</form>
							</div>
							<div class="col-md-9">
								<!-- 정말 테이블만 -->
							 <table class="table table-striped" style="text-align: center;">
										<thead>
											<%
							                  try {
							         	         CommunityDAO dao = new CommunityDAO();
							         	          dao.Ccount(c_id);
							         	         ArrayList<CommVo> arr= dao.CommInfo(c_id);
												for(int i=0; i<arr.size(); i++){
							         	        	 %>
							         	        	 
											<tr>
												<th>제목</th>
												<th colspan="2" style="font-weight:normal"><%=arr.get(i).getTitle() %></th>
												<th>조회수</th>
												<th colspan="2" style="font-weight:normal"><%=arr.get(i).getC_count() %></th>
												
                                            </tr>
                                            <tr>
												<th>작성자</th>
												<th colspan="2" style="font-weight:normal"><%=arr.get(i).getId() %></th>
												<th>작성시간</th>
												<th colspan="2" style="font-weight:normal"><%=arr.get(i).getC_date()%></th>	
                                            </tr>
                                            <tr><td style="font-weight:bold;"><img src="upload/<%= arr.get(i).getC_img()%>"/>이미지</td></tr>
                                            <tr><td style="font-weight:bold;"><%=arr.get(i).getC_text() %></td></tr>
							         	       <%
												}
							         	       } catch (Exception e) {
							         	         // TODO Auto-generated catch block
							         	         e.printStackTrace();
							         	      }
							                  %>
								
										</thead>
										
                                    </table>
                                    <hr/>
                                
				<!--댓글 달기 -->
				<form id="inputreply" action="CReplyService" class="input-group" method="post">
    			<textarea name = "creply" rows = "4" cols = "60" width="1000px"></textarea>
    			<input type="hidden" name="id" value=<%=id %>>
    			<input type="hidden" name="c_id" value=<%=c_id %>><!-- 게시글 번호도 보내 줘야 함 -->
    			<button class="submit">댓글 등록</button>
				</form>
				
						<!-- 댓글 보기 -->
		<table class="table table-striped" style="text-align: center;">
			<thead>
			<tr>
				<th width=100 style="word-break:break-all">num</th>
				<th width=100 style="word-break:break-all">작성자</th>
				<th width=1000 style="word-break:break-all">내용</th>
				<th width=400 style="word-break:break-all">날짜</th>
           </tr>	
			</thead>
			<tbody>
					<%
                  try {
         	         CommunityDAO dao = new CommunityDAO();
         	         ArrayList<cReplyVO> arr= dao.rcommShow(c_id);
					 for(int i=0; i<arr.size(); i++){
         	        	 %>
          	        	  <tr>
          	        	  <td><%=i+1 %></td>
                         <td><%=arr.get(i).getId() %></td>
                          <td><%=arr.get(i).getR_text() %></td>
                          <td><%=arr.get(i).getR_date() %></td>
                        </tr>      
                        <p>
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
				
				</article>
				 <a class="btn btn-default pull-center" href="board.jsp">목록으로</a>
				
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
</body>

</html>