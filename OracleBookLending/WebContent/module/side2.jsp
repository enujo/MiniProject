<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<%
	request.setCharacterEncoding("EUC-KR");
%>

<!-- Sidenav/menu -->
<nav class="w3-sidenav w3-collapse w3-white w3-animate-left" style="z-index: 3; width: 300px;" id="mySidenav"><br>
	<div class="w3-container w3-row"> 
	<div class="w3-col s4">
	<c:if test="${userId eq null}">
		<div class="form-group">
		<form action="<c:url value='/MemberLoginPro.me'/>" method="post">
		 	ID :<input type="text" name="id" class="form-control" id="ex3">
			Password :<input type="password" name="pw" class="form-control" id="ex3">
			<input type="submit" value="로그인버튼">
		</form>
		</div>
	</c:if>
	</div>
		
	<c:if test="${userId ne null}">
	<div class="w3-col s4">
      <img src="${userImg}" class="w3-circle w3-margin-right" style="width:46px">
    </div>
    <div class="w3-col s8">
      <span>Welcome, <strong>${userId}</strong></span><br>
      <a href="<c:url value='/MemberUpdate.me'/>?mID=${userId }"class="w3-hover-none w3-hover-text-green w3-show-inline-block"><i class="fa fa-user"></i></a>
      <a href="#" class="w3-hover-none w3-hover-text-blue w3-show-inline-block"><i class="fa fa-cog"></i></a>
      <a href="<%=request.getContextPath()%>/MemberLogoutPro.me" class="w3-hover-none w3-hover-text-red w3-show-inline-block"><span><strong>LogOut</strong></span></a>
    </div>
	</c:if>
	</div>

	<hr>

	<a href="#" class="w3-padding-16 w3-hide-large w3-dark-grey w3-hover-black" onclick="w3_close()" title="close menu">
	<i class="fa fa-remove fa-fw"></i> Close Menu</a> 
	<a href="<%=request.getContextPath()%>/MemberJoinForm.me" class="w3-padding w3-blue"><i class="fa fa-users fa-fw"></i> Join</a>
	<a href="<%=request.getContextPath()%>/MemberList.me" class="w3-padding"><i class="fa fa-eye fa-fw"></i> List</a>
	<a href="<%=request.getContextPath()%>/BooksAddForm.bo" class="w3-padding"><i class="fa fa-eye fa-fw"></i> Add</a>
	<a href="<%=request.getContextPath()%>/BooksListPro.bo" class="w3-padding"><i class="fa fa-eye fa-fw"></i> Book List</a>
	<br>
</nav>
<div id="body" class="w3-main" style="margin-left: 300px; margin-top: 43px;">
	<div id="content">
	
<script>
// Get the Sidenav
var mySidenav = document.getElementById("mySidenav");

// Get the DIV with overlay effect
var overlayBg = document.getElementById("myOverlay");

// Toggle between showing and hiding the sidenav, and add overlay effect
function w3_open() {
    if (mySidenav.style.display === 'block') {
        mySidenav.style.display = 'none';
        overlayBg.style.display = "none";
    } else {
        mySidenav.style.display = 'block';
        overlayBg.style.display = "block";
    }
}


// Close the sidenav with the close button


</script>