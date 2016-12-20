<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<c:import url="/module/top.jsp" />
<c:import url="/module/side.jsp" />

<%--
<%@ page import ="book.db.Books" %>
<%
	Books b = (Books)request.getAttribute("b");
	request.setCharacterEncoding("EUC-KR");
	response.setCharacterEncoding("EUC-KR");
%>

 	<table class = "w3-table w3-striped w3-white">
   	<tr>
      <td><img src="<%=request.getContextPath()%>/uploadbooks/<%=b.getBooks_img().split(",")[0]%>" width="200" height="200" border="0"></td>
      <%System.out.println("せせせせせせせせせせせせせせせ"+b.toString()); %>
      <td><%=b.getBooks_no()%></td>
      <td><%=b.getBooks_name()%></td>
      <td><%=b.getBooks_writer()%></td>
      <td><%=b.getBooks_date()%></td>
      <td><%=b.getCategory().getCategory_name()%></td>
      <td><%=b.getBooks_publi()%></td>
      <td><%=b.getBooks_count()%></td>
      <td><%=b.getBooks_state()%></td>
		</tr>
    </table>
--%>

	<div class="container">
		<h2 align="center">${b.books_name }</h2>
		<table class="w3-table w3-striped w3-white">
			<thead>
			</thead>
			<tbody>
				<tr>
					<td rowspan="2" colspan="1">
						<img
						src="<c:url value='/uploadbooks/'/>${b.books_img.split(',')[0]}"
						width="200" height="200" border="0">
					</td>
					<td>坪球)</td>
					<td>${b.books_no}</td>
					<td>歳嫌)</td>
					<td>${b.category.category_name}</td>
				</tr>
				<tr>
					<td>奪戚硯</td>
					<td>${b.books_name}</td>
					<td>煽切</td>
					<td>${b.books_writer }</td>
					
					<td>${b.books_date }</td>
					
					<td>${b.books_publi}</td>
					<td>${b.books_count}</td>
					<td>雌殿)</td>
					<td>${b.books_state}</td>
				</tr>
			</tbody>
		</table>
	
		<a href="<c:url value='/BooksUpdateForm.bo?bookNo=${b.books_no }'/>">Update</a>
		<a href="<c:url value='/BooksDeleteForm.bo?bookNo=${b.books_no }'/>">Delete</a>
	</div>
<c:import url="/module/bottom.jsp" />
