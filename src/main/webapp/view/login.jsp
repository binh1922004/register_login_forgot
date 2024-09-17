<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <title></title>
</head>
<body>
<h2>LOGIN </h2>

<form action="/MVC/login" method="post">
    <!-- <c:if test = "${alterMsg != null}"> </c:if> -->
    <h3 class="alter alter danger"> ${alterMsg}</h3>
    <label for="fname">User name:</label><br>
    <input type="text" id="fname" name="username" value="" required><br>
    <label for="lname">Password:</label><br>
    <input type="text" id="lname" name="password" value="" required><br>
    <input type="submit" value="Login"><br>
    <input type="checkbox" checked = "checked" name="remember" > Remember me
</form>
</body>
</html>
