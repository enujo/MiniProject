<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SMART LIBRARY</title>
</head>
<body>
	<div class="w3-container">
		<div class="w3-container" id="where" style="padding-bottom: 32px;">
			<div class="w3-content" style="max-width: 700px">
				<h5 class="w3-center w3-padding-64">
					<span class="w3-tag w3-wide w3-padding-left w3-padding-right">도서 대여</span>
				</h5>
				
				<form action="<c:url value='/rentbooks'/>" method="post">
					<p>
						회원 일련번호
						<input class="w3-input w3-padding-16 w3-border" type="text" value="${returnMember.libmemberNo }" name="libmemberNo" readonly="readonly">
					</p>
					<p>
						회원 등급
						<input class="w3-input w3-padding-16 w3-border" type="text" value="${returnMember.libmemberState }" name="" readonly="readonly">
					</p>
					<p>
						도서 일련번호
						<input class="w3-input w3-padding-16 w3-border" type="text" value="${returnBook.bookNo }"  name="bookNo" readonly="readonly">
					</p>
					<p>
						결제 금액	<!-- placeholder -->
						<input class="w3-input w3-padding-16 w3-border" type="text" value=""  name="pay.payTotal">
					</p>
					<p>
						<button class="w3-btn w3-padding" type="submit">대여</button>
					</p>
				</form>
			</div>
		</div>
	</div>
</body>
</html>

