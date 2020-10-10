<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert File Upload</title>
</head>
<body>
	<h1>File Upload Exemple</h1>
	<form:form method="post" action="savefile" enctype="multipart/form-data">
	<p><label for="image">choose Image</label></p>
	<p><input name="file" id="fileToUpload" type="file"/></p>
	<p><input type="submit" value="Upload"></p>
	</form:form>
</body>
</html>