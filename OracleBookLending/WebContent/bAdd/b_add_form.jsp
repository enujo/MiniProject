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
			<label for="pwd">Book Name : </label>
			<input type="text" class="form-control" name="books_name">
		</div>
		<div class="form-group">
			<label for="pwd">Book Writer : </label> 
			<input type="text" class="form-control" name="books_writer">
		</div>
			<div class="form-group">
			<label for="usr">Book Category : </label> 
			<select name="books_cate">
				<option>--Category--</option>
				<c:forEach items="${category}" var="c">
				<option value="${c.category_no}">${c.category_name}</option>
				</c:forEach>
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