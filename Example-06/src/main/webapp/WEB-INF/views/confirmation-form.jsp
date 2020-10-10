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
<body>
	<p>Your reservation is confirmed successfully. please, re-check the ditails.</p>
	Last name: ${reservation.firstName}
	<br>
	Last name: ${reservation.lastName}
	<br>
	Gender: ${reservation.gender}
	Meals:
	<ul>
			<c:forEach var="meal" items="${reservation.food }">
					<li>${meal}</li>
			</c:forEach>
	</ul>
	Leaving From : ${reservation.cityFrom}
	<br>
	Going To : ${reservation.cityTo}
</body>
</body>
</html>