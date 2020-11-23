<%@page import="com.vo.QnAVO"%>
<%@page import="com.dao.QnADAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

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
<!-- timeline -->

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="css/pages/qna.css">

<style>
    .demo{
        margin-top: 10px;
    }
    .main-timeline{
        margin-bottom: 70px;
    }
</style>
</head>
<body class="single single-post">
<div id="page">
	<div class="container">
		<header id="masthead" class="site-header">
		<div class="site-branding">
			<h1 class="site-title"><a href="search.html" rel="Search">Dionysus</a></h1>
			<h2 class="site-description">너 때문에 술이 깨져버렸으니 책임져</h2>

			<button style="float:right;
			margin-top: 15px;
			background-color: #ffffff;
			border:none;
			
">Logout</button>
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
<body>
<%
	String id = (String)session.getAttribute("id");
	System.out.println(id);
%>


<div id="page">
    <div class="demo">
        <div class="container">
            <div class="row text-center">
                <h1 class="heading-title">Q & A</h1>
            </div>

            <div class="row">
                <div class="col-md-12">
                    <div class="main-timeline">
                        
                            <%
										try {
											QnADAO dao = new QnADAO();
											ArrayList<QnAVO> arr = dao.QShow();
											if (arr.isEmpty()) {
											%>질문이 없어용<%
											} else {
													if(id.equals("admin")){
														for (int i = 0; i < arr.size(); i++) {
															%>
											<div class="timeline">
		                            				<div class="timeline-content">
						                                <span class="id"><%=arr.get(i).getId() %></span>
						                                <h4 class="title"><%=arr.get(i).getQ_text()%></h4>
						                                <h4 class="title"><%=arr.get(i).getQ_date()%></h4>
						                            </div>
							    			</div>
										            <div class="timeline">
										                    <div class="timeline-content">
										                    <p class="description"><%=arr.get(i).getA_text()%></p>
										            </div>            
										 <%
												
														%>
														<form action="QnaAService" method="post">
														<input type="hidden" name="q_id" value=<%=arr.get(i).getQ_id() %>> 
														<input type="hidden" name="id" value="admin">
														<input type="text" name="a_text"> 
														<input type="submit" value="답변하기">
														</form>
														 </div> 
														<%
													}
												
													}else{
														for (int j = 0; j < arr.size(); j++) {
															%>
											<div class="timeline">
		                            				<div class="timeline-content">
						                                <span class="id"><%=arr.get(j).getId() %></span>
						                                <h4 class="title"><%=arr.get(j).getQ_text()%></h4>
						                                <h4 class="title"><%=arr.get(j).getQ_date()%></h4>
						                            </div>
							    			</div>
										            <div class="timeline">
										                    <div class="timeline-content">
										                    <p class="description"><%=arr.get(j).getA_text()%></p>
										            </div>            
										 <%
												
													}
														
													}
		
											}
										} catch (Exception e) {
											// TODO Auto-generated catch block
											e.printStackTrace();
										}
									%>                
                        </div>
                    </div>
                </div>
            </div> 


        </div>
    </div>


    
</div>
</body>
</html>
