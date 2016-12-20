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
      <td><img src="<%= request.getContextPath() %>/uploadbooks/<%=b.getBooks_img().split(",")[0] %>" width="200" height="200" border="0"></td>
      <td><%=b.getBooks_no()%></td>
      <td><%=b.getBooks_name()%></td>
      <td><%=b.getBooks_writer()%></td>
      <td><%=b.getBooks_date()%></td>
      <td><%=b.getBooks_cate()%></td>
      <td><%=b.getBooks_publi()%></td>
      <td><%=b.getBooks_count()%></td>
      <td><%=b.getBooks_state()%></td>
      
      
      
      
      </tr>
      </table>

<%@ include file="/module/bottom.jsp"%>