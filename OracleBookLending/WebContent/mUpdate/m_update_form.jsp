<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<c:import url="/module/top.jsp" />
<c:import url="/module/side.jsp" />
<fmt:requestEncoding value="euc-kr"/>


<form action="<c:url value='${request.getContextPath()}/MemberUpdatePro.me'/>?mID=${m.member_id}" method="post" enctype="multipart/form-data">
	<div class="container">
		<h2>Change Account</h2>
		<p></p>
		<table >
			<tr>
				<td  style="width:23%" rowspan="3">
					<img src="<c:url value='/upload/${m.member_img.split(",")[0]}'/>" class="w3-circle w3-margin-right" style="width:70%" >
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
					<div class="form-group">
						<label  for="usr">Image: </label>
						<input type="file" name="member_img" value="${m.member_img }" width="10" height="10" border="0">
						
					</div>
				</td>
			</tr>
		</table>
		<div class="form-group">
			<label for="pwd">Password:</label>
			<input type="password" class="form-control" id="pwd" name="member_pw">
		</div>
		<div class="form-group">
			<label for="pwd">Password Check:</label> 
			<input type="password" class="form-control" id="pwd" name="member_pwcheck">
		</div>
		<div class="form-group">
			<label for="usr">Phone:</label> 
			<input type="text" class="form-control" id="usr" name="member_phone" value="${m.member_phone }">
		</div>
		<div class="form-group">
			<label for="usr">Address:</label> 
			<input type="text" class="form-control" id="usr" name="member_addr" value="${m.member_addr }">
		</div>

		<div class="form-group">
			<input type="submit" value="수정완료" >
		</div>
	</div>
</form>

<%@ include file="/module/bottom.jsp"%>