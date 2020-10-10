<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
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
	Meals:
	BreakFast<form:checkbox path="Food" value="BreakFast"/>
	Lunch<form:checkbox path="Food" value="Lunch"/>
	Dinner<form:checkbox path="Food" value="Dinner"/>
	<br><br>
	Leaving from: <form:select path="cityFrom">
	<form:option value="Ghaziabad" label="Ghazibad"/>
	<form:option value="Modinagar" label="Modinagar"/>
	<form:option value="Meerut" label="Meerut"/>
	<form:option value="Amristar" label="Amristar"/>
	</form:select>
	<br><br>
	Going to: <form:select path="cityTo">
		<form:option value="Ghaziabad" label="Ghazibad"/>
	<form:option value="Modinagar" label="Modinagar"/>
	<form:option value="Meerut" label="Meerut"/>
	<form:option value="Amristar" label="Amristar"/>
	</form:select>
	<br><br>
	<input type="submit" value="Submit" />
</form:form>
</body>
</html>