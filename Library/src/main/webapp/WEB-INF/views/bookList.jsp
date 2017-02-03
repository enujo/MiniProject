<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<!-- Menu Container -->
	<div class="w3-container">
		<!-- Contact/Area Container -->
		<div class="w3-container" id="where" style="padding-bottom: 32px;">
			<div class="w3-content" style="max-width: 700px">
				<h5 class="w3-center w3-padding-64">
					<span class="w3-tag w3-wide w3-padding-left w3-padding-right">도서 목록</span>
				</h5>
				
				<form class="w3-container w3-card-4" action="<c:url value='/selectcatebook'/>" > 
					<div class="w3-content w3-layout-cell  w3-layout-middle" >
						<select class="w3-select" name="option">
							<option value="" disabled selected>:: 장르 ::</option>
							<c:forEach var="bookCateList" items="${bookCateList}">
								<option value="${bookCateList.bookcategoryNo} ">${bookCateList.bookcategoryName}</option>
							</c:forEach>
						</select>
					</div>
					<!-- <div class="w3-content w3-layout-cell w3-layout-middle" >
						<button class="w3-btn w3-padding" type="submit">검색</button>
					</div> -->
				</form>
				
				<form class="w3-container w3-card-4" action="<c:url value='/adddisbook'/>">	
					<table class="w3-table w3-small w3-striped w3-bordered w3-centered">
						
						<tr>
							<th>도서 번호</th>
							<th>장르</th>
							<th>도서명</th>
							<th>저자</th>
							<th>출판사</th>
							<th>상태</th>
							<th>최초 대여일</th>
							<th>총 빌려간 횟수</th>
							<th>총 빌려간 일</th>
							<th>폐기</th>
						</tr>
						<c:forEach var="bookList" items="${bookList}" >
							<tr>
								<td>${bookList.bookNo}</td>
								<td>${bookList.bookcategory.bookcategoryName}</td>
								<td>${bookList.bookName}</td>
								<td>${bookList.bookWriter}</td>
								<td>${bookList.bookPulisher}</td>
								<td>${bookList.bookState}</td>
								<td>${bookList.bookFirstrent}</td>
								<td>${bookList.bookTotalrent}</td>
								<td>${bookList.bookTotalday}</td>
								<td>
									<input class="w3-check " type="checkbox" name="disbookNo" value="1">
								</td>
							</tr>
						</c:forEach>
						<tr>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td></td>
							<td align="right" colspan="2">
								<button class="w3-btn w3-padding" type="submit">폐기 등록</button>
							</td>
						</tr>
					</table>
				</form>
			</div>

		</div>
	</div>
</body>
</html>
