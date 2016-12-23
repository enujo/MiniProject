<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%response.setContentType("text/html; charset=euc-kr"); %>
<c:import url="/module/top.jsp" />
<c:import url="/module/side.jsp" />
	<div class="container">
		<h2>Update</h2>
		<p></p>
<form action="<c:url value='${request.getContextPath()}/BooksUpdatePro.bo'/>" method="post" enctype="multipart/form-data">		
		<table>
			<tr>
				<td style="width:33%" rowspan="3">
					<img src="<c:url value='/uploadbooks/${book.books_img.split(",")[0]}'/>" class="w3-circle w3-margin-right" style="width:100%" >
				</td>
				<td>
					<div class="form-group">			
						<label for="usr">No:</label>
					</div>
				</td>
				<td>	
					<div class="form-group">
						<input type="text" class="form-control" id="usr" name="books_no" readonly value="${book.books_no}"/>
					</div>					
				</td>
			
			</tr>
			<tr>
				<td>
					<div class="form-group">
						<label for="usr">Name:</label> 
					</div>
				</td>
				<td>	
					<div class="form-group">
						<input type="text" class="form-control" id="usr" name="books_name" value="${book.books_name }">
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div class="form-group">
						<label for="usr">Writer:</label> 
					</div>
				</td>
				<td>
					<div class="form-group">
						<input type="text" class="form-control" id="usr" name="books_writer" value="${book.books_writer }">
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div class="form-group">
						<label  for="usr">Image: </label>
						<input type="file" name="books_img" value="${book.books_img }" width="10" height="10" border="0">
					</div>
				</td>
			</tr>
		</table>
		
		<div class="form-group">
			<label for="usr">Public:</label> 
			<input type="text" class="form-control" id="usr" name="books_publi" value="${book.books_publi}">
		</div>
		<div class="form-group">
			<label for="usr">Category:</label> 
				<select name="books_cate">
				<option>--Category--</option>
				<c:forEach items="${category}" var="c">
				<option value="${c.category_no}">${c.category_name}</option>
				</c:forEach>
			</select>
		</div>
		<div class="form-group">
			<input type="submit" value="수정완료" >
		</div>
		</form>
	</div>
<c:import url="/module/bottom.jsp" />