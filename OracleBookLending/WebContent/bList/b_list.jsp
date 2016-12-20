<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<c:import url="/module/top.jsp" />
<c:import url="/module/side.jsp" />
<% response.setContentType("text/html; charset=UTF-8"); %>

<div class="container">
	<h2>Book List</h2>
	<form action="<%= request.getContextPath() %>/BooksListPro.bo"
		method="post">
		<select name="select">
			<option value="books_name">이름</option>
			<option value="books_writer">저자</option>
			<option value="books_publi">출판사</option>
		</select> <input type="text" name="value" /> <input type="submit" value="검색">
	</form>

	<table class="w3-table w3-striped w3-white">
		<thead>
			<tr>
				<th>IMG</th>
				<th>No</th>
				<th>Name</th>
				<th>Category</th>
				<th>대여상태</th>
				<th>출판사</th>
			</tr>
		</thead>
		<%--
<%@ page import="java.util.ArrayList"%>
<%@ page import="book.db.Books"%>

     <tbody>
	<%
	ArrayList<Books> getalb = (ArrayList<Books>)request.getAttribute("alb"); 
	for(int i=0 ; i < getalb.size() ; i++){		
		Books b = getalb.get(i);
	%>
    <tr>
    	<td><img src="<%= request.getContextPath() %>/uploadbooks/<%=b.getBooks_img().split(",")[0] %>" width="50" height="50" border="0"></td>
		<td><%= b.getBooks_no() %></td>
		<td><a href="<%=request.getContextPath()%>/BooksViewPro.bo?bookNo=<%=b.getBooks_no()%>"><%= b.getBooks_name() %></a></td>
		<td><%= b.getCategory().getCategory_name()%></td>
		<td><%= b.getBooks_state() %></td>
		<td><%= b.getBooks_publi() %></td>
	</tr>  
    
    <%
    }
    %>
    </tbody> 
--%>
		<tbody>
			<c:forEach var="getalb" items="${alb }">
				<tr>
					<td><img
						src="<c:url value='/uploadbooks/'/>${getalb.books_img.split(',')[0]}"
						width="50" height="50" border="0"></td>
					<td>${getalb.books_no}</td>
					<td><a
						href="<c:url value='/BooksViewPro.bo?bookNo=${getalb.books_no }'/>">${getalb.books_name}</a></td>
					<td>${getalb.category.category_name}</td>
					<td>${getalb.books_state}</td>
					<td>${getalb.books_publi}</td>
				</tr>
			</c:forEach>
		</tbody>

	</table>
</div>
<c:import url="/module/bottom.jsp" />

