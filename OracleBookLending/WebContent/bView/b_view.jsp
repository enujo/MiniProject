<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%response.setContentType("text/html; charset=UTF-8"); %>
<c:import url="/module/top.jsp" />
<c:import url="/module/side.jsp" />
	<div class="container">
		<h2>DETAIL</h2>
		<p></p>
		<table>
			<tr>
				<td style="width:33%" rowspan="3">
					<img src="<c:url value='/uploadbooks/${book.books_img.split(",")[0]}'/>" class="w3-circle w3-margin-right" style="width:100%" >
					<%-- width="50" height="50" border="0"> --%>
				</td>
				<td>
					<div class="form-group">			
						<label for="usr">No:</label>
					</div>
				</td>
				<td>	
					<div class="form-group">
						<input type="text" class="form-control" id="usr" name="member_id" readonly value="${book.books_no }"/>
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
						<input type="text" class="form-control" id="usr" name="member_name" readonly value="${book.books_name }">
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
						<input type="text" class="form-control" id="usr" name="member_level" readonly value="${book.books_writer }">
					</div>
				</td>
			</tr>
			<tr>
				<td>
				
				</td>
			</tr>
		</table>
		
		<div class="form-group">
			<label for="usr">Public:</label> 
			<input type="text" class="form-control" id="usr" name="member_phone" readonly value="${book.books_publi}">
		</div>
		<div class="form-group">
			<label for="usr">Category:</label> 
			<input type="text" class="form-control" id="usr" name="member_addr" readonly value="${book.category.category_name}">
		</div>
		<div class="form-group">
			<label for="usr">Date:</label> 
			<input type="text" class="form-control" id="usr" name="member_addr" readonly value="${book.books_date}">
		</div>
		<div class="form-group">
			<label for="usr">Count:</label> 
			<input type="text" class="form-control" id="usr" name="member_addr" readonly value="${book.books_count}">
		</div>
		<div class="form-group">
			<label for="usr">State:</label> 
			<input type="text" class="form-control" id="usr" name="member_addr" value="${book.books_state}" readonly/>
		</div>
		<div class="form-group">
			<a href="<c:url value='/BooksUpdateForm.bo'/>?bookNo=${book.books_no}">
				<input type="button" value="¼öÁ¤">
			</a>
		</div>
	</div>
<c:import url="/module/bottom.jsp" />