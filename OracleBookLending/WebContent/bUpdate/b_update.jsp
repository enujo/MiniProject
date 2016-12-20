<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import ="book.db.Books" %>
<%@ include file="/module/top.jsp"%>
<%@ include file="/module/side.jsp"%>

<%
	Books b = (Books)request.getAttribute("b");
	request.setCharacterEncoding("EUC-KR");
%>
	<table class = "w3-table w3-striped w3-white">
   	<tr>
   		<td>Book IMG</td>	
   		<td><img src="<%= request.getContextPath() %>/uploadbooks/<%=b.getBooks_img().split(",")[0] %>" width="200" height="200" border="0"></td>
    </tr>
    <tr>
    	<td>Book No</td>
    	<td><input type="text" name="books_no" value="<%=b.getBooks_no()%>" readonly></td>
   </tr>
   <tr>	
   		<td>Book Name</td>
   		<td><input type="text" name="books_no" value="<%=b.getBooks_name()%>"></td>
   </tr>
   <tr>
   		<td>Book Writer</td>
   		<td><input type="text" name="books_no" value="<%=b.getBooks_writer()%>"></td>
   </tr>
   <tr>
		<td>Book Category</td>
		<td>
			<select name="books_cate">
				<option value="�Ҽ�">�Ҽ�</option>
				<option value="������">������</option>
				<option value="�ڱ���">�ڱ���</option>
				<option value="�ڿ�">�ڿ�</option>
				<option value="�ι�����">�ι�����</option>
				<option value="����">����</option>
				<option value="����/���߹�ȭ">����/���߹�ȭ</option>
				<option value="�н���">�н���</option>
			</select>
		</td>
	</tr>
	<tr>
		<td>Book public</td>
		<td><input type="text" name="books_no" value="<%=b.getBooks_publi()%>"></td>
	</tr>
    </table>
      <a href="<%= request.getContextPath() %>/BooksUpdateForm.bo?bookNo=<%=b.getBooks_no()%>">Update</a>
      <a href="<%= request.getContextPath() %>/BooksDeleteForm.bo?bookNo=<%=b.getBooks_no()%>">Delete</a>  



<%@ include file="/module/bottom.jsp"%>