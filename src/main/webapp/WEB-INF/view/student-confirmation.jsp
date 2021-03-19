<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hello World..!</h1>
<h3>Student : ${student.firstName} ${student.lastName}</h3> <br/>
<h3>Country: ${student.country}</h3>
<h2>
	Language: ${student.favoriteLanguage} <br/>
	<c:forEach var="operatingSystems" items="${student.operatingSystem}">
		<li>${operatingSystems} </li> <br/>
	</c:forEach>
	
</h2>
</body>
</html>