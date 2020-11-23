<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div class="detail_search">
		<!--이름으로 검색 -->
		<div style="margin:10px">
		<form action="./Shop2.jsp" method="get">
				<input type="text" name="wineName"> 
				<input type="submit" value="이름 검색">
		</form>
		</div>
		<!-- 메뉴로 검색 -->
		<div style="margin:10px">
		<form action="./Shop3.jsp" method="get">
				<input type="text" name="Menu"> 
				<input type="submit" value="메뉴 검색">
		</form>
		</div>
		
		<!-- 옵션으로 검색 -->
		<div style="margin:10px">
		<form action="./Shop4.jsp" method="get">
		    <select name="Kinds">
		      <option value="레드">레드</option>
		      <option value="화이트">화이트</option>
		      <option value="스파클링">스파클링</option>
		      <option value="로제">로제</option>
		      <option value="주정강화">주정강화</option>
		      <option value="고도주">고도주</option>
		      <option value="기타">기타</option>
		    </select>
		    <br>
		    <!-- 다중 선택 multiple 추가 -->
		    <select name="use">
		      <option value="테이블와인">테이블와인</option>
		      <option value="디저트와인">디저트와인</option>
		      <option value="에피타이저와인">에피타이저와인</option>
		      <option value="기타">기타</option>
		    </select>
		    <br>
		        당도<br>
			<div class="range range-dangdo">
			<input type="range" name="sugar" min="1" max="5" value="3" onchange="rangeFirst.value=value">
			<output id="rangeFirst">3</output>
			</div>
		   	산미<br>
		    <div class="range range-sando">
			<input type="range" name="acidity" min="1" max="5" value="3" onchange="rangePrimary.value=value">
			<output id="rangePrimary">3</output>
			</div>
		   	바디<br>
		    <div class="range range-body">
			<input type="range" name="body" min="1" max="5" value="3" onchange="rangeSuccess.value=value">
			<output id="rangeSuccess">3</output>
			</div>
		   	 타닌<br>
		    <div class="range range-tanin">
			<input type="range" name="tannin" min="1" max="5" value="3" onchange="rangeInfo.value=value">
			<output id="rangeInfo">3</output>
			</div>
			<span>최저가격
			<input type="number" name = "minprice" value="10000" min="10000" max="8000000" step="5000"/>	
			최고가격
			<input type="number" name="maxprice" value="100000" min="50000" max="8000000" step="5000"/></span>
		 	향<br>
		     <input type="text" name="scent">
		     
			<input type="submit" value="옵션으로 검색">
		</form>
		</div>
</div>

