<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
	<title>JOIN STAFF</title>
</head>
<body>
	<form action="<c:url value='/staff/ChoosList.jh'/>" method="post">
		<div align="center"><h3>STAFF정보 조회 화면</h3></div>
		<table border="1" style="table-layout:fixed" align="center">
			<tbody>
				<tr>
					<td>
						<div align="center">
							이름
						</div>
					</td>
					<td>
						<div>
							<input type="text" name="name" size="30px"/>
						</div>
					</td>
					<td>
						<div align="center">
							성별
						</div>
					</td>
					<td>
						남<input type="checkbox" name="gender" value="남"/>
						여<input type="checkbox" name="gender" value="여"/>
					</td>
					<td>
						<div align="center">
							종교
						</div>
					</td>
					<td>
						<div>
							<select name="religion">
								<c:forEach var="reli" items="${relilist}">
								<option value="${reli.no }">${reli.name }</option>
								</c:forEach>
							</select>
						</div>
					</td>					
				</tr>
				<tr>
					<td>
						<div align="center">
							<p>학력</p>
						</div>
					</td>
					<td>
						<div>
							<c:forEach var="school" items="${schoollist }">
							<input type="radio" name="schoolNo" value="${school.no }">${school.graduate}
							</c:forEach>
						</div>
					</td>
					<td>
						<div align="center">
							기술
						</div>
					</td>
					<td colspan="3">
						<div>
							<c:forEach var="skill" items="${skillist }">
							<input type="checkbox" name="chB" value="${skill.no }">${skill.name }
							</c:forEach>
						</div>
					</td>
									
				</tr>
				<tr>
					<td>
						<div align="center">
							졸업일
						</div>
					</td>
					<td colspan="5">
						<div>
							<input type="date" name="GdayStart">~
							<input type="date" name="GdayEnd">
						</div>
					</td>				
				</tr>
				<tr align="center" valign="middle">
					<td colspan="6">
						<div >
							<input type="submit" value="조회"/>
						</div>
					</td>					
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>