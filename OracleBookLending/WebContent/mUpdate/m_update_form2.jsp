<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/module/top.jsp"%>
<%@ include file="/module/side.jsp"%>
<%
	request.setCharacterEncoding("EUC-KR");
%>

<form action="<%=request.getContextPath()%>/MemberUpdatePro.me" method="post" enctype="multipart/form-data">
	<div class="container">
		<h2>Change Account</h2>
		<p></p>

		<div class="form-group">
			<label for="usr">ID:</label><br>
			<input type="text" class="form-control" id="usr" name="member_id" readonly value="${m.member_id }">
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
			<input type="text" class="form-control" id="usr" name="member_name" readonly value="${m.member_name }">
		</div>
		<div class="form-group">
			<label for="usr">Level:</label> 
			<input type="text" class="form-control" id="usr" name="member_level" readonly value="${m.member_level }">
		</div>
		<div class="form-group">
			<label for="usr">Phone:</label> 
			<input type="text" class="form-control" id="usr" name="member_phone" value="${m.member_phone }">
		</div>
		<div class="form-group">
			<label for="usr">Address:</label> 
			<input type="text" class="form-control" id="usr" name="member_addr" value="${m.member_addr }">
		</div>
		<div class="form-group">
			<label for="usr">Image:</label> 
			<input type="file" name="member_img" value="${m.member_img }" width="50" height="50" border="0">
		</div>
		<div class="form-group">
			<input type="submit" value="수정완료">
		</div>
	</div>
</form>

<%@ include file="/module/bottom.jsp"%>