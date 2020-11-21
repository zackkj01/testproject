<!DOCTYPE html>
 
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 
<html>
<head>
<meta charset="utf-8">
<title>Login</title>
</head>
<body>
    <p style="color: red">${message}</p>
    <form:form id="loginForm" action="login" method="POST" modelAttribute="loginBean">
        <form:label path="username">Username</form:label>
        <form:input id="username" name="username" path="username" />
        <br>
        <form:label path="password">Password</form:label>
        <form:password id="password" name="password" path="password" />
        <br>
        <input type="submit" value="Submit" />
    </form:form>
</body>
</html>