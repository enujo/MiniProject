<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Inconsolata">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body, html {
	height: 100%;
	font-family: "Inconsolata", sans-serif;
}

.bgimg {
	background-position: center;
	background-size: cover;
	/* background-image: url("2222.jpg"); */
	min-height: 75%;
}

.menu {
	display: none;
}
</style>
</head>
<body>

	<!-- Links (sit on top) -->
	<div class="w3-top">
		<div class="w3-row w3-padding w3-black">
			<div class="w3-col s3">
				<a href="<c:url value='/' />" class="w3-btn-block w3-hover-white">HOME</a>
			</div>
			<div class="w3-col s3 w3-dropdown-hover">
				<a href="#about" class="w3-btn-block w3-hover-white">회원관리</a>
				<div class="w3-dropdown-content w3-white w3-card-4 ">
					<a href="<c:url value='/joinmember' />" class="w3-btn-block w3-hover-white">회원등록</a>
					<a href="#" class="w3-btn-block w3-hover-white">회원목록</a>
				</div>
			</div>
			<div class="w3-col s3 w3-dropdown-hover">
				<a href="#menu" class="w3-btn-block w3-hover-white">도서관리</a>
				<div class="w3-dropdown-content w3-white w3-card-4 ">
					<a href="<c:url value='/addbooks' />" class="w3-btn-block w3-hover-white">도서등록</a>
					<a href="<c:url value='booklist' />" class="w3-btn-block w3-hover-white">도서목록</a>
				</div>
			</div>

			<div class="w3-col s3 w3-dropdown-hover">
				<a href="#where" class="w3-btn-block w3-hover-white">대여/반납</a>
				<div class="w3-dropdown-content w3-white w3-card-4 ">
					<a href="/rentbooks" class="w3-btn-block w3-hover-white">대여신청</a>
					<a href="#" class="w3-btn-block w3-hover-white">반납신청</a>
				</div>
			</div>
		</div>
	</div>
		<!-- Add a background color and large text to the whole page -->
	<div class="w3-sand w3-grayscale w3-large">
		<div class="w3-row">
			<div class="w3-col s3 w3-green w3-center">
				<!-- Sidenav/menu -->
				<nav class="w3-sidenav w3-collapse w3-white w3-animate-left" style="z-index:3;width:300px;" id="mySidenav"> <br>
					<div class="w3-container">
						<a href="#" onclick="w3_close()" class="w3-hide-large w3-right w3-jumbo w3-padding"
							title="close menu"> <i class="fa fa-remove"></i>
						</a> 
						<!-- <img src="/w3images/avatar_g2.jpg" style="width: 45%;" class="w3-round"> --><br> <br>
						<h4 class="w3-padding-0">
							<b><a href="<c:url value='/' />">Smart Library</a></b>
						</h4>
						<p class="w3-text-grey"></p>
					</div>
	
					<!-- accordion -->
					<div class="w3-accordion w3-card-4">
						<button onclick="myFunction('Demo1')" class="w3-btn-block w3-white">
							<a href="#about" onclick="w3_close()" class="w3-padding">
							<i	class="fa fa-user fa-fw w3-margin-right"></i>회원관리</a>
						</button>
						<div id="Demo1" class="w3-accordion-content">
							<ul class="w3-ul">
								<li><a href="<c:url value='/joinmember' />">회원등록</a></li>
								<li><a href="#">회원목록</a></li>
							</ul>
						</div>
					</div>
					<div class="w3-accordion w3-card-4">
						<button onclick="myFunction('Demo2')" class="w3-btn-block w3-white">
							<a href="#contact" onclick="w3_close()" class="w3-padding">
							<i class="fa fa-envelope fa-fw w3-margin-right"></i>도서관리</a>
						</button>
						<div id="Demo2" class="w3-accordion-content">
							<ul class="w3-ul">
								<li><a href="<c:url value='/addbooks' />">도서등록</a></li>
								<li><a href="<c:url value='booklist' />">도서목록</a></li>
							</ul>
						</div>
					</div>
					<div class="w3-accordion w3-card-4">
						<button onclick="myFunction('Demo3')" class="w3-btn-block w3-white">
							<a href="#contact" onclick="w3_close()" class="w3-padding">
							<i class="fa fa-envelope fa-fw w3-margin-right"></i>대여/반납</a>
						</button>
						<div id="Demo3" class="w3-accordion-content">
							<ul class="w3-ul">
								<li><a href="/rentbooks">대여신청</a></li>
								<li><a href="#">반납신청</a></li>
							</ul>
						</div>
					</div>
				</nav>
			</div>
	