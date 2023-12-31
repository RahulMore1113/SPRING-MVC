<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save Customer</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/add-customer-style.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/style.css" />
</head>
<body>

	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>

	<div id="container">
		<h3>Save Customer</h3>

		<form:form action="saveCustomer" method="post"
			modelAttribute="customer">

			<!-- need to associate this data with customer id -->
			<form:hidden path="id" />

			<table>
				<tbody>
					<tr>
						<td>First Name</td>
						<td><form:input path="firstName" /></td>
					</tr>
					<tr>
						<td>Last Name</td>
						<td><form:input path="lastName" /></td>
					</tr>
					<tr>
						<td>Email</td>
						<td><form:input path="email" /></td>
					</tr>
					<tr>
						<td></td>
						<td><input type="submit" value="Save" class="save" /></td>
					</tr>
				</tbody>
			</table>
		</form:form>

	</div>

	<div style="clear: both;">
		<p>
			<a href="${pageContext.request.contextPath}/customer/list">Back
				to List</a>
		</p>
	</div>

</body>
</html>