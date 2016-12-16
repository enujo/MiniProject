<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form>
		<h3 align="center"><div>Start</div></h3>
		<table align="center" border="1" width="300" >
			<thead>
				<tr>
					<th width="30" align="center"></th>
					<th width="100">주소</th>
					<th width="30" align="center"></th>
				</tr>
			</thead>
			<tbody>
				<tr height="30">
					<td width="30" align="center">1</td>
					<td>
						<div>
							<a href="<c:url value='/staff/AddView.jh' />">
								/staff/AddView.jh
							</a>
						</div>
					</td>
					<td width="30" align="center">
						<a href="<c:url value='/staff/AddView.jh' />">이동</a>					
					</td>					
				</tr>
				
				<tr height="30">
					<td width="30" align="center">1</td>
					<td>
						<div>
							<a href="<c:url value='/staff/StaffChoose.jh' />">
								/staff/ChooseStaff.jh
							</a>
						</div>
					</td>
					<td width="30" align="center">
						<a href="<c:url value='/staff/StaffChoose.jh' />">이동</a>					
					</td>					
				</tr>
				
					<tr height="30">
					<td width="30" align="center">1</td>
					<td>
						<div>
							<a href="<c:url value='/staff/StaffList.jh' />">
								/staff/StaffList.jh
							</a>
						</div>
					</td>
					<td width="30" align="center">
						<a href="<c:url value='/staff/StaffList.jh' />">이동</a>					
					</td>					
				</tr>
				
			</tbody>
		
		</table>
	</form>
</body>
</html>

<!-- th, td의 colspan=""은 좌,우의 칸 수 이다 
	align="left" right center 좌 중앙 우

-->