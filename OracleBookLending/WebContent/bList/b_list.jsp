<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="/module/top.jsp" %>
<%@ include file="/module/side.jsp" %>
<%@ page import = "java.util.ArrayList" %>
<%@ page import = "book.db.Books" %>



<div class="container">
  <h2>Book List</h2>  
<form action="<%= request.getContextPath() %>/BooksListPro.bo" method="post">
<select name="select">
<option value="books_name">�̸�</option>
<option value="books_writer">����</option>
<option value="books_publi">���ǻ�</option>
</select>
<input type="text" name="value"/>
<input type="submit" value="�˻�">
</form>

  <table class = "w3-table w3-striped w3-white">
    <thead>
      <tr>
        <th>IMG</th>
        <th>No</th>
        <th>Name</th>
        <th>Category</th>
        <th>�뿩����</th>
        <th>���ǻ�</th>
      </tr>
    </thead>
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
		<td><%= b.getBooks_cate() %></td>
		<td><%= b.getBooks_state() %></td>
		<td><%= b.getBooks_publi() %></td>
	</tr>  
    
    <%
    }
    %>
    </tbody>
  </table>
</div>
<%@ include file="/module/bottom.jsp" %>