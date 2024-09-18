<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%--<!DOCTYPE html>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title></title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<h2>LOGIN </h2>--%>

<%--<form action="/MVC/login" method="post">--%>
<%--    <!-- <c:if test = "${alterMsg != null}"> </c:if> -->--%>
<%--    <h3 class="alter alter danger"> ${alterMsg}</h3>--%>
<%--    <label for="fname">User name:</label><br>--%>
<%--    <input type="text" id="fname" name="username" value="" required><br>--%>
<%--    <label for="lname">Password:</label><br>--%>
<%--    <input type="text" id="lname" name="password" value="" required><br>--%>
<%--    <input type="submit" value="Login"><br>--%>
<%--    <input type="checkbox" checked = "checked" name="remember" > Remember me--%>
<%--</form>--%>
<%--</body>--%>
<%--</html>--%>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://unpkg.com/bootstrap@5.3.3/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://unpkg.com/bs-brain@2.0.4/components/logins/login-4/assets/css/login-4.css">
    <title>Login</title>
</head>
<body>
<!-- Login 4 - Bootstrap Brain Component -->
<section class="p-3 p-md-4 p-xl-5">
    <div class="container">
        <div class="card border-light-subtle shadow-sm">
            <div class="row g-0">
                <div class="col-12 col-md-6">
                    <img class="img-fluid rounded-start w-100 h-100 object-fit-cover" loading="lazy" src="https://fit.hcmute.edu.vn/Resources/Images/SubDomain/fit/FIT-DoanHoi.png" alt="BootstrapBrain Logo">
                </div>
                <div class="col-12 col-md-6">
                    <div class="card-body p-3 p-md-4 p-xl-5">
                        <div class="row">
                            <div class="col-12">
                                <div class="mb-5">
                                    <h3 style="color: red">${alert}</h3>
                                    <h3>Log in</h3>
                                </div>
                            </div>
                        </div>
                        <form action="/MVC/login" method="post">
                            <div class="row gy-3 gy-md-4 overflow-hidden">
                                <div class="col-12">
                                    <label for="email" class="form-label">Username <span class="text-danger">*</span></label>
                                    <input type="text" class="form-control" name="username" id="username" placeholder="name@example.com" required>
                                </div>
                                <div class="col-12">
                                    <label for="password" class="form-label">Password <span class="text-danger">*</span></label>
                                    <input type="password" class="form-control" name="password" id="password" value="" required>
                                </div>
                                <div class="col-12">
                                    <div class="form-check">
                                        <input class="form-check-input" type="checkbox" value="" name="remember" id="remember_me">
                                        <label class="form-check-label text-secondary" for="remember_me">
                                            Keep me logged in
                                        </label>
                                    </div>
                                </div>
                                <div class="col-12">
                                    <div class="d-grid">
                                        <button class="btn bsb-btn-xl btn-primary" type="submit">Log in now</button>
                                    </div>
                                </div>
                            </div>
                        </form>
                        <div class="row">
                            <div class="col-12">
                                <hr class="mt-5 mb-4 border-secondary-subtle">
                                <div class="d-flex gap-2 gap-md-4 flex-column flex-md-row justify-content-md-end">
                                    <a href="<%=request.getContextPath()%>/register" class="link-secondary text-decoration-none">Create new account</a>
                                    <a href="#!" class="link-secondary text-decoration-none">Forgot password</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
</body>
</html>