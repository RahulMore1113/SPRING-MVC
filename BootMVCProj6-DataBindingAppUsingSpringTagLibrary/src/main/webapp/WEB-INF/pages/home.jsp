<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>

	<h1 style="color: blue; text-align: center;">Employee Registration
		Page</h1>
	<form:form modelAttribute="emp">
		<table>
			<tr>
				<th>ENO</th>
				<td><form:input path="eno" /></td>
				<th>ENAME</th>
				<td><form:input path="ename" /></td>
				<th>EDESG</th>
				<td><form:input path="edesg" /></td>
				<th>SALARY</th>
				<td><form:input path="salary" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="register" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>