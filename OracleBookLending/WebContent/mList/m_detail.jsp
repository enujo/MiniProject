<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
	<title>MEMBER DETAIL</title>
</head>
<body>
<c:import url="/module/top.jsp" />
<c:import url="/module/side.jsp" />
	<div class="container">
		<h2>DETAIL</h2>
		<p></p>
		<table>
			<tr>
				<td  style="width:33%" rowspan="3">
					<img src="<c:url value='/upload/${m.member_img.split(",")[0]}'/>" class="w3-circle w3-margin-right" style="width:100%" >
					<%-- width="50" height="50" border="0"> --%>
				</td>
				<td>
					<div class="form-group">			
						<label for="usr">ID:</label>
					</div>
				</td>
				<td>	
					<div class="form-group">
						<input type="text" class="form-control" id="usr" name="member_id" readonly value="${m.member_id }"/>
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
						<input type="text" class="form-control" id="usr" name="member_name" readonly value="${m.member_name }">
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div class="form-group">
						<label for="usr">Level:</label> 
					</div>
				</td>
				<td>
					<div class="form-group">
						<input type="text" class="form-control" id="usr" name="member_level" readonly value="${m.member_level }">
					</div>
				</td>
			</tr>
			<tr>
				<td>
				
				</td>
			</tr>
		</table>
		
		<div class="form-group">
			<label for="usr">Phone:</label> 
			<input type="text" class="form-control" id="usr" name="member_phone" readonly value="${m.member_phone }">
		</div>
		<div class="form-group">
			<label for="usr">Address:</label> 
			<input type="text" class="form-control" id="usr" name="member_addr" readonly value="${m.member_addr }">
		</div>
		<div class="form-group">
			<a href="<c:url value='/MemberUpdate.me'/>?mID=${m.member_id}">
				<input type="button" value="수정">
			</a>
		</div>
		<%-- 
		<div class="form-group">
			<label for="usr">Image:</label> 
			<input type="file" name="member_img" value="${m.member_img }" width="50" height="50" border="0">
		</div>
		<div class="form-group">
			<input type="submit" value="수정완료">
		</div> --%>
	</div>
<c:import url="/module/bottom.jsp" />
</body>
</html>