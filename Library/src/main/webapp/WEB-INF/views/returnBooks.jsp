<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<!-- Menu Container -->
	<div class="w3-container">
		<!-- Contact/Area Container -->
		<div class="w3-container" id="where" style="padding-bottom: 32px;">
			<div class="w3-content" style="max-width: 700px">
				<h5 class="w3-center w3-padding-64">
					<span class="w3-tag w3-wide w3-padding-left w3-padding-right">도서 반납</span>
				</h5>
				<!-- <hr style="width: 50px; border: 5px solid red" class="w3-round"> -->
				<form>
					<div class="w3-row-padding">
						<div class="w3-half w3-margin-bottom">
							<ul class="w3-ul">
								<!-- <li class="w3-dark-grey w3-xlarge w3-padding-32 ">Basic</li> -->
								<li class="w3-padding-8 ">
									<p>
										회원 일련번호 
										<input class="w3-input w3-padding-16 w3-border" type="text" value="일련번호" required name="Name" readonly="readonly">
									</p>
								</li>
								<li class="w3-padding-8">
									<p>
										회원 등급
										<input class="w3-input w3-padding-16 w3-border" type="text" placeholder="회원 이름" required name="PNumber" readonly="readonly">
									</p>
								</li>
								<li class="w3-padding-8">
									<h2>$ 249</h2> 
									<span class="w3-opacity">total price</span>
								</li>
								<li class="w3-padding-24">
									<button type="submit" class="w3-btn w3-red w3-padding-large w3-hover-black">
										반납 완료
									</button>
								</li>
							</ul>
						</div>

						<div class="w3-half">
							<ul class="w3-ul">
								<!-- <li class="w3-red w3-xlarge w3-padding-32">Pro</li> -->
								<li class="w3-padding-8 ">
									<p>
										도서 일련번호
										<input class="w3-input w3-padding-16 w3-border" type="text" placeholder="일련번호" required name="Name" readonly="readonly">
									</p>
								</li>
								<li class="w3-padding-8">
									<p>
										도서 대여 시작일
										<input class="w3-input w3-padding-16 w3-border" type="text" placeholder="" required name="PNumber" readonly="readonly">
									</p>
								</li>
								<li class="w3-padding-8 ">
									<p>
										회원 대여 종료일
										<input class="w3-input w3-padding-16 w3-border" type="text" placeholder="" required name="Name">
									</p>
								</li>
								<li></li>


							</ul>
						</div>
					</div>
				</form>
			</div>

		</div>
	</div>
</body>
</html>