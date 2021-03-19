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
	<form:form modelAttribute="customer" action="saveCustomer" method="POST">
		<form:hidden path="id"/>
		<label>FirstName</label>
		<form:input type="text" path="firstName"  />	<br/>
		<label>LastName</label>
		<form:input type="text" path="lastName" />	<br/>
		<label>Email</label>
		<form:input type="email" path="email"  />	<br/>
		<input type="submit" value="Submit">
	</form:form>
	<br />
	<a href="/customer/list">Go to homepage</a>
</body>
</html>