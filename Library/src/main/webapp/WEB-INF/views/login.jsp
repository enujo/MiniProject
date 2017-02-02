<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>MAIN</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
<style>
body, h1, h2 {
	font-family: "Raleway", sans-serif
}

body, html {
	height: 100%
}

p {
	line-height: 2
}

.bgimg {
	min-height: 100%;
	background-position: center;
	background-size: cover;
}

.bgimg {
	background-image: url("resources/img/book.jpg")
}
</style>
</head>
<body>
	<!-- Header / Home-->
	<header class="w3-display-container w3-wide bgimg w3-grayscale-min"
		id="home">
	<div class="w3-display-middle w3-text-white w3-center">

		<div class="w3-container" id="menu">
			<div class="w3-content" style="max-width: 700px">
				<h5 class="w3-center w3-padding-48">
					<span class="w3-tag w3-wide w3-padding-left w3-padding-right"></span>
				</h5>
				<div class="w3-row w3-center w3-card-2 w3-padding">
					<div class="w3-col s6 tablink">로그인</div>
				</div>
				<div class="w3-container menu w3-padding-48 w3-card-2">
					<form action="joinmember">
						<p>
							<input class="w3-input w3-padding-16 w3-border" type="text" placeholder="일련번호" 
							required name="libraryNo" style="width: 500px">
						</p>
						<p>
							<input class="w3-input w3-padding-16 w3-border" type="password"
								placeholder="비밀번호" required name="libraryPw">
						</p>
						<p>
							<button class="w3-btn w3-padding" type="submit">로그인</button>
						</p>
					</form>
					<p class="w3-text-grey">Made by HMK</p>
				</div>
			</div>

			<!-- Contact/Area Container -->
			<div class="w3-container" id="where" style="padding-bottom: 32px;">
			</div>

			<!-- End page content -->
		</div>

	</div>
	</header>
</body>
</html>