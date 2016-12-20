<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file="/module/top.jsp"%>
<%@ include file="/module/side.jsp"%>
<%
	request.setCharacterEncoding("EUC-KR");
%>

<form action="<%=request.getContextPath()%>/MemberJoinPro.me" method="post" enctype="multipart/form-data">
	<div class="container">
		<h2>JOIN US</h2>
		<p></p>

		<div class="form-group">
			<label for="usr">ID:</label><br>
			<input type="text" class="form-control" id="usr" name="member_id">
		</div>
		<div class="form-group">
			<label for="pwd">Password:</label>
			<input type="password" class="form-control" id="pwd" name="member_pw">
		</div>
		<div class="form-group">
			<label for="pwd">Password Check:</label> 
			<input type="password" class="form-control" id="pwd" name="member_pwcheck">
		</div>
		<div class="form-group">
			<label for="usr">Name:</label> 
			<input type="text" class="form-control" id="usr" name="member_name">
		</div>
		<div class="form-group">
			<label for="usr">Level:</label> 
			<input type="text" class="form-control" id="usr" name="member_level">
		</div>
		<div class="form-group">
			<label for="usr">Phone:</label> 
			<input type="text" class="form-control" id="usr" name="member_phone">
		</div>
		<div class="form-group">
			<label for="usr">Address:</label> 
			<input type="text" class="form-control" id="usr" name="member_addr">
		</div>
		<div class="form-group">
			<label for="usr">Image:</label> 
			<input type="file" name="member_img">
		</div>
		<div class="form-group">
			<input type="submit" value="JOIN US">
		</div>
	</div>
</form>

<%@ include file="/module/bottom.jsp"%>