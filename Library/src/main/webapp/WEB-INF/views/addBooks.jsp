<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ADD BOOKS</title>
</head>
<body>

<div class="w3-container">
	<div class="w3-container" id="where" style="padding-bottom: 32px;">
		<div class="w3-content" style="max-width: 700px">
			<h5 class="w3-center w3-padding-64">
				<span class="w3-tag w3-wide w3-padding-left w3-padding-right">도서 등록</span>
			</h5>
			<form action="addbooks" method="post" >
				<!-- 임시로 도서관 번호 들어가게 -->
				<input type="hidden" name ="libraryNo" value="1"/>
				<input type="hidden" name ="bookState" value="itsOk"/>
				<p>
					도서명
					<input class="w3-input w3-padding-16 w3-border" type="text" name="bookName">
				</p>
				<p>
					저자
					<input class="w3-input w3-padding-16 w3-border" type="text" name="bookWriter">
				</p>
				<p>
					출판사
					<input class="w3-input w3-padding-16 w3-border" type="text" name="bookPulisher">
				</p>
				<p>
					카테고리
					<select class="w3-input w3-padding-16 w3-border" name="bookcategory.bookcategoryNo">
						<option value="#">::장르::</option>
						<c:forEach var="bookCateList" items="${bookCateList}">
							<option value="${bookCateList.bookcategoryNo} ">${bookCateList.bookcategoryName}</option>
						</c:forEach>
					</select>
				</p>
				<p>
					<button class="w3-btn w3-padding" type="submit">도서 등록</button>
				</p>
			</form>
		</div>
	</div>
</div>

</body>
</html>