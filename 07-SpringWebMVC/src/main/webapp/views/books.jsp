<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Books Details you Stored as :</h1>
	<table>
		<tr>
			<td>Book Name :</td>
			<td>${book.bName}</td>
		</tr>
		<tr>
			<td>Author Name :</td>
			<td>${book.authorName}</td>
		</tr>
		<tr>
			<td>Book Price :</td>
			<td>${book.bPrice}</td>
		</tr>
	</table>
	
	<a href="loadingform">Reload Form</a>
</body>
</html>