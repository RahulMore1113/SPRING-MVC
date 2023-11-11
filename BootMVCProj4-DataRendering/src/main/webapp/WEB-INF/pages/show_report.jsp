<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Output Page</title>
</head>
<body>

	<h1 style="color: blue; text-align: center;">Displaying
		SimpleValues</h1>
	<h1 align="center">Name : ${name}</h1>
	<br>
	<h1 align="center">Name : ${age}</h1>
	<br>
	<h1 align="center">Name : ${address}</h1>
	<br>

	<%-- <c:forEach var="country" items="${countryNames}">
		${country} <br />
	</c:forEach> --%>

	<h1 style="color: blue;">Displaying the list of DTO</h1>

	<table>
		<tr>
			<th>ENO</th>
			<th>ENAME</th>
			<th>EDESG</th>
			<th>SALARY</th>
		</tr>
		<c:forEach var="emp" items="${empList}">
			<td>${emp.eno}</td>
			<td>${emp.ename}</td>
			<td>${emp.edesg}</td>
			<td>${emp.salary}</td>
		</c:forEach>
	</table>

</body>
</html>