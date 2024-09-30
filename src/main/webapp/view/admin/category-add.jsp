<%--
  Created by IntelliJ IDEA.
  User: binh
  Date: 9/30/2024
  Time: 9:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/conmon/taglib.jsp"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="<c:url value="/admin/category/insert"/>" method="post" enctype="multipart/form-data">
        <label for="categoryname">Category name:</label><br>
        <input type="text" id="categoryname" name="categoryname"><br>
        <label for="img">Link image</label><br>
        <input type="text" id="img" name="img"><br>

        <label for="img1">Upload image</label><br>
        <input type="file" id="img1" name="img1" ><br>

        <label for="status">Status</label><br>
        <input type="radio" id="statuson" name="status" value="1">
        <label for="statuson">Hoat dong</label>
        <input type="radio" id="statusoff" name="status" value="0">
        <label for="statuson">Khong hoat dong</label>
        <br>
        <input type="submit" value="Insert">
    </form>

</body>
</html>
