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
<body class="single single-product woocommerce woocommerce-page">

<%
	int wine_id = Integer.parseInt(request.getParameter("wine_id"));
	System.out.println(wine_id);
	String id = (String)session.getAttribute("id");
	String u_id =(String)session.getAttribute("u_id");
	
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
		</header>
		<!-- #masthead -->
		<div id="content" class="site-content">
			<div id="primary" class="content-area column full">
				<main id="main" class="site-main" role="main">
				<div id="container">
					<div id="content" role="main">
						<nav class="woocommerce-breadcrumb" itemprop="breadcrumb"><a href="#">Home</a> / <a href="#">Clothing</a> / Beige Jacket</nav>
						<div itemscope itemtype="http://schema.org/Product" class="product">
								<!-- 개인물품 상품 이미지-->
							<div class="images">
								<a href="" itemprop="image" class="woocommerce-main-image zoom" title="" data-rel="prettyPhoto">									
									<img src="images/shop/wine_y.jpg"></img></a>
							</div>
								<!-- 상세분류-->
							<div class="summary entry-summary">
								<div class = "shop_detail_head">
									<h1 itemprop="name" class="product_title entry-title">와인명(한)</h1>
									<p><sapn>와인명(영)</sapn></p>
								</div>
																
								<div itemprop="offers" itemscope itemtype="http://schema.org/Offer">
									<p class="shop_detail_tag">
										<span class="shop_detail_name">생산자</span>
										<span class="">생산지역</span>
									</p>
									<p class="">
										<span class="amount">품종</span>
										<span class="shop_detail_cont">내용</span>
									</p>
									<p class="#">
										<span class="amount">종류</span>
										<span class="shop_detail_cont">내용</span>
									</p>
									<p class="#">
										<span class="amount">용도</span>
										<span class="shop_detail_cont">내용</span>
									</p>
									<p class="#">
										<span class="amount">알코올도수</span>
										<span class="shop_detail_cont">내용</span>
									</p>
									<p class="#">
										<span class="amount">음용온도</span>
										<span class="shop_detail_cont">내용</span>
									</p>
									<p class="#">
										<span class="amount">추천음식</span>
										<span class="shop_detail_cont">내용</span>
									</p>
									<p class="#">
										<span class="amount">당도</span>
										<span class="amount">산도</span>
										<span class="amount">바디</span>
										<span class="amount">타닌</span>
									</p>
									<p class="price">
										<span class="amount">가격(000,000원)</span>
									</p>
									<p class="#">
										<span class="amount">점수</span>
									</p>
									<meta itemprop="price" content="35"/>
									<meta itemprop="priceCurrency" content="USD"/>
									<link itemprop="availability" href="http://schema.org/InStock"/>
								</div>
							
								<form class="cart" method="post" enctype='multipart/form-data'>								
									<button type="submit" class="single_add_to_cart_button button alt">관심상품등록</button>
								</form>

							</div>
							<!-- .summary -->
							<div class="woocommerce-tabs wc-tabs-wrapper">
									<div class="panel entry-content wc-tab" id="tab-description">
									<h2>상품 상세</h2>
									<p>
									
									
									
									</p>
								</div>
								<div class="panel entry-content wc-tab" id="tab-reviews">
									
							<!-- reviews -->
									<div id="reviews">
										<div id="comments">
											<h2>이 상품에 대한 리뷰</h2>
											<ol class="commentlist">
												<li itemprop="review" itemscope itemtype="http://schema.org/Review" class="comment">
												<div id="comment-3" class="comment_container">
													<div class="comment-text">	
														<p class="meta">
															<strong itemprop="author">Steve</strong> &ndash; <time itemprop="datePublished" datetime="2013-06-07T15:54:25+00:00">June 7, 2013</time>:
														</p>
														<div itemprop="description" class="description">
															<p>
																I like the logo but not the color.
															</p>
														</div>
													</div>
												</div>
											</li>
												<!-- #comment-## -->
											</ol>
										</div>
										
										<form id="inputreply" action="WineScoreService" class="input-group" method="post">
										<label for="rating">Your Rating찬혁 test용</label>
															<select name="score" id="score">
																<option value="">평점</option>
																<option value="5">10점</option>
																<option value="4">9점</option>
																<option value="3">8점</option>
																<option value="2">7점</option>
																<option value="1">6점</option>
																<option value="5">5점</option>
																<option value="4">4점</option>
																<option value="3">3점</option>
																<option value="2">2점</option>
																<option value="1">1점</option>
															</select>
						    			<textarea name = "rw_text" rows = "4" cols = "60" width="1000px"></textarea>
						    			<input type="hidden" name="id" value=<%=id %>>
						    			<input type="hidden" name="u_id" value=<%=u_id %>>
						    			<input type="hidden" name="wine_id" value=<%=wine_id %>><!-- 게시글 번호도 보내 줘야 함 -->
						    			<button class="submit">댓글 등록</button>
										</form>

										<!-- 리뷰 쓰기  -->
										<div id="review_form_wrapper">
											<div id="review_form">
												<div id="respond" class="comment-respond">
													<h3 style="margin-bottom:10px;" id="reply-title" class="comment-reply-title">리뷰 남기기 <small><a rel="nofollow" id="cancel-comment-reply-link" href="/demo-moschino/product/woo-logo-2/#respond" style="display:none;">Cancel reply</a></small></h3>
													<form action="#" method="post" id="commentform" class="comment-form" novalidate>
														<p class="comment-form-rating">
															<label for="rating">Your Rating</label>
															<select name="rating" id="rating">
																<option value="">평점</option>
																<option value="5">10점</option>
																<option value="4">9점</option>
																<option value="3">8점</option>
																<option value="2">7점</option>
																<option value="1">6점</option>
																<option value="5">5점</option>
																<option value="4">4점</option>
																<option value="3">3점</option>
																<option value="2">2점</option>
																<option value="1">1점</option>
															</select>
														</p>
														    <!-- 사진업로드 시도코드 -->
														<input type="file" id="real-input" class="image_inputType_file" accept="img/*" required multiple>
														<button class="browse-btn">사진업로드</button>
														<p></p>

														<p class="comment-form-comment">
															<label for="comment">Your Review</label><textarea id="comment" name="comment" cols="45" rows="8" aria-required="true"></textarea>
														</p>

														<p class="form-submit">
															<input name="submit" type="submit" id="submit" class="submit" value="등록"/><input type='hidden' name='comment_post_ID' value='60' id='comment_post_ID'/>															
														</p>
													</form>
												</div>
									<!-- #respond -->
											</div>
										</div>
										<div class="clear">
										</div>
									</div>
								</div>
							</div>
									
									<!-- 추천 상품나열 -->
							<div class="related products">
								<h2>연관 추천상품</h2>
								<ul class="products">
									<li class="first product">
									<a href="shop_detail.html">
									<span class="onsale">Sale!</span>									
									<img src="images/shop/2wine.jpg" alt=""></img>
								        <!-- 와인명 -->
									<h3>와인 이름</h3>
										<!-- 와인 종류  -->
									<span class="#"><span class="amount">분류(레드,화이트,로제,스파클링)</span></span>
										<!-- 와인가격  -->
									<span class="price"><span class="amount">가격(000,000원)</span></span>
										<!--  버튼-->
									<a href="#" class="button">상세정보</a>
									</li>
									
									<li class="product">
									<a href="shop_detail.html">								
									<img src="http://s3.amazonaws.com/caymandemo/wp-content/uploads/sites/10/2015/09/10175658/j6-520x779-520x600.jpg" alt=""></img>
									<h3>Male Jeans</h3>
									<span class="price"><span class="amount">$35.00</span></span>
									</a>
									<a href="#" class="button">Add to cart</a>
									</li>
									
									<li class="product">
									<a href="shop_detail.html">								
									<img src="http://s3.amazonaws.com/caymandemo/wp-content/uploads/sites/10/2015/09/10175658/j7-520x780-520x600.jpg" alt=""></img>
									<h3>Slim Jeans</h3>
									<span class="price"><span class="amount">$20.00</span></span>
									</a>
									<a href="#" class="button">Add to cart</a>
									</li>	
									<li class="product last">
									<a href="shop_detail.html">									
									<img src="http://s3.amazonaws.com/caymandemo/wp-content/uploads/sites/10/2015/09/10175658/j3-320x320.jpg" alt=""></img>
									<h3>Summer Blouse</h3>
									<span class="price"><span class="amount">$35.00</span></span>
									</a>
									<a href="#" class="button">Add to cart</a>
									</li>
								</ul>
							</div>
							<div>
							
						<%
                  try {
         	         WineDAO dao = new WineDAO();
         	         ArrayList<WineVo> arr= dao.SelectWine(wine_id);
         	         %>
         	         <%
					for(int i=0; i<arr.size(); i++){
                      %>
                        와인이름 :<%=arr.get(i).getW_name() %><br>
			           	와인이름(영):<%=arr.get(i).getW_namee() %><br>
			           	생산자:<%=arr.get(i).getProducte()%><br>
			           	생산지:<%=arr.get(i).getLocationk() %><br>
			           	품종:<%=arr.get(i).getKind() %><br>
			           	종류:<%=arr.get(i).getKinds() %><br>
			           	용도:<%=arr.get(i).getUse() %><br>
			           	도수:<%=arr.get(i).getAlcohol() %><br>
			           	음용 온도:<%=arr.get(i).getTemper() %><br>
			           	등급:<%=arr.get(i).getGrade() %><br>
			           	당도:<%=arr.get(i).getSugar() %><br>
			           	산도:<%=arr.get(i).getAcidity() %><br>
			           	바디:<%=arr.get(i).getBody() %><br>
			           	타닌:<%=arr.get(i).getTannin() %><br>
			           	가격:<%=arr.get(i).getPrice() %><br>
			           	수상내역:<%=arr.get(i).getRemark() %><br>
			           	연도:<%=arr.get(i).getYear()%><br>
			           	용량:<%=arr.get(i).getLiter() %><br>
			           	향기:<%=arr.get(i).getScent() %><br>
			           	과일향:<%=arr.get(i).getFruit() %><br>
			           	꽃향:<%=arr.get(i).getFlower() %><br>
			           	야채향:<%=arr.get(i).getVegetable() %><br>
			           	향신료향:<%=arr.get(i).getSpice() %><br>
			           	미네랄:<%=arr.get(i).getMineral() %><br>
			           	화학향:<%=arr.get(i).getChemistry() %><br>
			           	동물향:<%=arr.get(i).getAnimal() %><br>
			           	탄내:<%=arr.get(i).getBurnt() %><br>
			           	발사믹:<%=arr.get(i).getBalsamic()%><br>
			           	
			           	추천 안주:<%=arr.get(i).getMenu() %><br>
           	
                      <%
					}
         	       } catch (Exception e) {
         	         // TODO Auto-generated catch block
         	         e.printStackTrace();
         	      }
                 %> 
					
				
				
                 </ul>
												
							</div>
							

								<!-- 추천 상품나열 2 -->
									<div class="related products">
										<h2>연관 추천상품2</h2>
										<ul class="products">
											<li class="first product">
											<a href="shop_detail.html">
											<span class="onsale">Sale!</span>									
											<img src="images/shop/2wine.jpg" alt=""></img>
												<!-- 와인명 -->
											<h3>와인 이름</h3>
												<!-- 와인 종류  -->
											<span class="#"><span class="amount">분류(레드,화이트,로제,스파클링)</span></span>
												<!-- 와인가격  -->
											<span class="price"><span class="amount">가격(000,000원)</span></span>
												<!--  버튼-->
											<a href="#" class="button">상세정보</a>
											</li>
											
											<li class="product">
											<a href="shop_detail.html">								
											<img src="http://s3.amazonaws.com/caymandemo/wp-content/uploads/sites/10/2015/09/10175658/j6-520x779-520x600.jpg" alt=""></img>
											<h3>Male Jeans</h3>
											<span class="price"><span class="amount">$35.00</span></span>
											</a>
											<a href="#" class="button">Add to cart</a>
											</li>
											
											<li class="product">
											<a href="shop_detail.html">								
											<img src="http://s3.amazonaws.com/caymandemo/wp-content/uploads/sites/10/2015/09/10175658/j7-520x780-520x600.jpg" alt=""></img>
											<h3>Slim Jeans</h3>
											<span class="price"><span class="amount">$20.00</span></span>
											</a>
											<a href="#" class="button">Add to cart</a>
											</li>											
											
											<li class="product last">
											<a href="shop_detail.html">									
											<img src="http://s3.amazonaws.com/caymandemo/wp-content/uploads/sites/10/2015/09/10175658/j3-320x320.jpg" alt=""></img>
											<h3>Summer Blouse</h3>
											<span class="price"><span class="amount">$35.00</span></span>
											</a>
											<a href="#" class="button">Add to cart</a>
											</li>
										</ul>
									</div>							
						</div>
					</div>
				</div>
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
</body>
</html>