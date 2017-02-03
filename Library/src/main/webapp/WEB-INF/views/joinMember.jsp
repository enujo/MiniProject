<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SMART LIBRARY</title>
</head>
<body>
<div class="w3-container" id="menu">

	<!-- Contact/Area Container -->
	<div class="w3-container" id="where" style="padding-bottom: 32px;">
		<div class="w3-content" style="max-width: 700px">
			<h5 class="w3-center w3-padding-64">
				<span class="w3-tag w3-wide w3-padding-left w3-padding-right">JOIN</span>
			</h5>
			<form action="joinmember" method="post">
				<input type="hidden" name ="libraryNo" value="1"/>
				<p>
					이름<input class="w3-input w3-padding-16 w3-border" type="text" placeholder="Name" name="libmemberName">
				</p>
				<p>
					전화번호<input class="w3-input w3-padding-16 w3-border" type="text" placeholder="Phone Number" name="libmemberPhone">
				</p>
				<p>
					주소<input class="w3-input w3-padding-16 w3-border" type="text" placeholder="Adress" name="libmemberAdress">
				</p>
				<p>
					<input class="w3-radio" type="radio" name="libmemberState" value="vip" > <label class="w3-validate">회비 납부</label>
					<input class="w3-radio" type="radio" name="libmemberState" value="free" checked> <label class="w3-validate">납부 안함</label>
				</p>
				<p>
					<button class="w3-btn w3-padding" type="submit">회원 가입</button>
				</p>
			</form>
		</div>
	</div>
</div>
</body>
</html>