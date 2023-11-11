<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>

	<h1 style="color: blue; text-align: center;">Employee Registration
		Page</h1>
	<form method="post">
		<table>
			<tr>
				<th>ENO</th>
				<td><input type="text" name="eno" /></td>
				<th>ENAME</th>
				<td><input type="text" name="ename" /></td>
				<th>EDESG</th>
				<td><input type="text" name="edesg" /></td>
				<th>SALARY</th>
				<td><input type="text" name="salary" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="register" /></td>
			</tr>
		</table>
	</form>

</body>
</html>