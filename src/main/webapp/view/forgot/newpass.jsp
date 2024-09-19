<%--
  Created by IntelliJ IDEA.
  User: binh
  Date: 9/19/2024
  Time: 1:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Forgot password</title>
</head>
<body>
    <h1>New your password is: ${pass}</h1>
    <a href="<%=request.getContextPath()%>/login" class="link-secondary text-decoration-none">Login</a>
</body>
</html>
