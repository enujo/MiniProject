<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JOIN STAFF</title>
</head>
<body>
	<form action="<c:url value='/staff/Add.jh'/>" method="post">
		<div align="center"><h3>STAFF���� ��� ȭ��</h3></div>
		<table border="1" style="table-layout:fixed" align="center">
			<tbody>
				<tr>
					<td>
						<div align="center">
							�̸�
						</div>
					</td>
					<td>
						<div>
							<input type="text" name="name" size="30px"/>
						</div>
					</td>
					<td>
						<div align="center">
							�ֹι�ȣ
						</div>
					</td>
					<td>
						<input type="text" name="frontNumber" /> &#45;
						<input type="password" name="backNumber" />
					</td>
					<td>
						<div align="center">
							����
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
							�з�
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
							���
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
							������
						</div>
					</td>
					<td colspan="5">
						<div>
							<input type="date" name="Gday">
						</div>
					</td>				
				</tr>
				<tr align="center" valign="middle">
					<td colspan="6">
						<div >
							<input type="submit" value="���"/>
							<input type="reset" value="�ʱ�ȭ"/>
						</div>
					</td>					
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>