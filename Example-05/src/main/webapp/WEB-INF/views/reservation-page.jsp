<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Form</title>
</head>
	<h3>Railway Reservation Form</h3>
<body>
	<form:form action="submitForm" modelAttribute="reservation">
	First name: <form:input path="firstName" />
	<br><br>
	Last name: <form:input path="lastName" />
	<br><br>
	Gender:
	male <form:radiobutton path="Gender" value="Male" />
	Female <form:radiobutton path="Gender" value="Female" />
	<br><br>
	<input type="submit" value="Submit" />
	</form:form>
</body>
</html>