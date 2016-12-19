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
			<select class=��form-control�� name="books_cate">
				<option value="�Ҽ�">�Ҽ�</option>
				<option value="������">������</option>
				<option value="�ڱ���">�ڱ���</option>
				<option value="�ڿ�">�ڿ�</option>
				<option value="�ι�����">�ι�����</option>
				<option value="����">����</option>
				<option value="����/���߹�ȭ">����/���߹�ȭ</option>
				<option value="�н���">�н���</option>
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