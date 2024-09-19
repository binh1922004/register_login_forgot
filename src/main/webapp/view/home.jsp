<%--
  Created by IntelliJ IDEA.
  User: binh
  Date: 9/17/2024
  Time: 10:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Trang chủ</title>
</head>
<body>
    <div class="container">
        <h1>Chào mừng bạn đến trang chủ!</h1>
        <p>Xin chào, ${username}!Bạn đã đăng nhập thành công.</p>
        <p>Chức vụ: ${roleid}</p>
        <a href="<%=request.getContextPath()%>/logout" class="link-secondary text-decoration-none">Log out</a>
        <!-- Thêm các phần tử khác tại đây: danh sách sản phẩm, thông báo, v.v. -->
    </div>
</body>
</html>
