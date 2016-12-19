<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file="/module/top.jsp"%>
<%@ include file="/module/side.jsp"%>
<%
	request.setCharacterEncoding("EUC-KR");
%>

<form action="<%=request.getContextPath()%>/BooksAddPro.bo" method="post" enctype="multipart/form-data">
	<div class="container">
		<h2>BOOK ADD</h2>
		<p></p>

		<div class="form-group">
			<label for="usr">Book Code : </label>
			<input type="text" class="form-control" name="books_no">
		</div>
		<div class="form-group">
			<label for="pwd">Book Name : </label>
			<input type="text" class="form-control" name="books_name">
		</div>
		<div class="form-group">
			<label for="pwd">Book Writer : </label> 
			<input type="text" class="form-control" name="books_writer">
		</div>
		<div class="form-group">
			<label for="usr">Book category : </label> 
			<select class=”form-control“ name="books_cate">
				<option value="소설">소설</option>
				<option value="에세이">에세이</option>
				<option value="자기계발">자기계발</option>
				<option value="자연">자연</option>
				<option value="인문과학">인문과학</option>
				<option value="역사">역사</option>
				<option value="예술/대중문화">예술/대중문화</option>
				<option value="학습서">학습서</option>
			</select>
		</div>
		<div class="form-group">
			<label for="usr">Book public : </label> 
			<input type="text" class="form-control" name="books_publi">
		</div>
		<div class="form-group">
			<label for="usr">Book Image : </label> 
			<input type="file" name="books_img">
		</div>
		<div class="form-group">
			<input type="submit" value="Add">
		</div>
	</div>
</form>
<%@ include file="/module/bottom.jsp"%>