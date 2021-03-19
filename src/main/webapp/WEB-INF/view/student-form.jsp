<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
	<h1>Student form</h1>
	<form:form action="/processform" method="POST" modelAttribute="student">
		FirstName : <form:input path="firstName"/>
					<form:errors path="firstName"></form:errors>
		 <br/>
		LastName : <form:input path="lastName"/> 
					<form:errors path="lastName"></form:errors>
		<br/>
		FreePasses : <form:input path="freePasses"/> 
					<form:errors path="freePasses"></form:errors>
		<br/>
		Country : <form:select path="country">
					<form:options items="${student.countryOptions}"/>
				  </form:select> <br/>
		Favourite Language : 
		
		Java <form:radiobutton path="favoriteLanguage" value="Java"/>	
		C# <form:radiobutton path="favoriteLanguage" value="C#"/>		
		ES6 <form:radiobutton path="favoriteLanguage" value="ES6"/>		
		Python <form:radiobutton path="favoriteLanguage" value="Python"/>			  
		<br/>
		Operating system:
			<form:checkbox path="operatingSystem" value="Linux"/>
			<form:checkbox path="operatingSystem" value="Windows"/>
			<form:checkbox path="operatingSystem" value="MacOS"/>
		<br/>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>