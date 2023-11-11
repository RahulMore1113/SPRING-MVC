<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1 style="color: blue; text-align: center;">EMployee Data</h1>
	<table border="1" style="text-align: center;">
		<tr>
			<th>ENO</th>
			<td>${employee.eno}</td>
		</tr>
		<tr>
			<th>ENAME</th>
			<td>${employee.ename}</td>
		</tr>
		<tr>
			<th>EDESG</th>
			<td>${employee.edesg}</td>
		</tr>
		<tr>
			<th>SALARY</th>
			<td>${employee.salary}</td>
		</tr>
	</table>
</body>
</html>