<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>   
<c:import url="/module/top.jsp" />
<c:import url="/module/side.jsp" />
<%@ page import ="java.util.*" %>
<%@ page import ="member.db.*" %>    


<div class="container">
  <h2>Member List</h2>  
  
<form action="<c:url value='/MemberList.me'/>" method="post">
<select name="select">
<option value="member_id">아이디</option>
<option value="member_level">권한</option>
<option value="member_name">이름</option>
<option value="member_email">이메일</option>
</select>
<input type="text" name="value"/>
<input type="submit" value="검색">
</form>

  <table class = "w3-table w3-striped w3-white">
    <thead>
      <tr>
        <th>IMG</th>
        <th>ID</th>
        <th>Name</th>
        <th>Level</th>
        <th>Phone</th>
        <th>Address</th>
        <th>Date</th>
      </tr>
    </thead>
    <tbody>
	<%-- 	<c:forEach var="getalm" items="alm">
		${Member m = getalm.get(1)}
		</c:forEach> --%>
	<%
	ArrayList<Member> getalm = (ArrayList<Member>)request.getAttribute("alm"); 
	for(int i=0 ; i < getalm.size() ; i++){
		Member m = getalm.get(i);
	%>
    <tr>
    	<td><a href="<%=request.getContextPath()%>/MemberDetail.me?mID=<%=m.getMember_id()%>"><img src="<%= request.getContextPath() %>/upload/<%=m.getMember_img().split(",")[0] %>" width="50" height="50" border="0"></a></td>
		<td><a href="<c:url value='/MemberDetail.me'/>?mID=<%=m.getMember_id()%>"><%= m.getMember_id() %></a></td>
		<td><%= m.getMember_name() %></td>
		<td><%= m.getMember_level() %></td>
		<td><%= m.getMember_phone() %></td>
		<td><%= m.getMember_addr() %></td>
		<td><%= m.getMember_date() %></td>
	</tr>  
    
    <%
    }
    %>
	    
    </tbody>
  </table>
</div>
<%@ include file="/module/bottom.jsp" %>