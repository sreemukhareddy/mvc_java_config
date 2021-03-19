<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<a href="showFormForAdd">Add Customer</a>

	<table>
		<tr>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Email</th>
		</tr>
		
		<c:forEach var="tempCustomer" items="${customers}">
			<tr>
				<td> ${tempCustomer.firstName} </td>
				<td> ${tempCustomer.lastName} </td>
				<td> ${tempCustomer.email} </td>
				<td> <a href="/customer/showFormForUpdate?customerId=${tempCustomer.id}">Update</a>
					| <a href="/customer/delete?customerId=${tempCustomer.id}" onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false"> Delete </a>
				</td>
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>