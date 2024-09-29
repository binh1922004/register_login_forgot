<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>


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

<%--<!-- Login 4 - Bootstrap Brain Component -->--%>
<%--<section class="p-3 p-md-4 p-xl-5">--%>
<%--    <div class="container">--%>
<%--        <div class="card border-light-subtle shadow-sm">--%>
<%--            <div class="row g-0">--%>
<%--                <div class="col-12 col-md-6">--%>
<%--                    <img class="img-fluid rounded-start w-100 h-100 object-fit-cover" loading="lazy" src="https://fit.hcmute.edu.vn/Resources/Images/SubDomain/fit/FIT-DoanHoi.png" alt="BootstrapBrain Logo">--%>
<%--                </div>--%>
<%--                <div class="col-12 col-md-6">--%>
<%--                    <div class="card-body p-3 p-md-4 p-xl-5">--%>
<%--                        <div class="row">--%>
<%--                            <div class="col-12">--%>
<%--                                <div class="mb-5">--%>
<%--                                    <h3 style="color: red">${alert}</h3>--%>
<%--                                    <h3>Log in</h3>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                        <form action="/MVC/login" method="post">--%>
<%--                            <div class="row gy-3 gy-md-4 overflow-hidden">--%>
<%--                                <div class="col-12">--%>
<%--                                    <label for="username" class="form-label">Username <span class="text-danger">*</span></label>--%>
<%--                                    <input type="text" class="form-control" name="username" id="username" placeholder="name@example.com" required>--%>
<%--                                </div>--%>
<%--                                <div class="col-12">--%>
<%--                                    <label for="password" class="form-label">Password <span class="text-danger">*</span></label>--%>
<%--                                    <input type="password" class="form-control" name="password" id="password" value="" required>--%>
<%--                                </div>--%>
<%--                                <div class="col-12">--%>
<%--                                    <div class="form-check">--%>
<%--                                        <label>--%>
<%--                                            <input class="form-check-input" type="checkbox" checked = "checked" name="remember">--%>
<%--                                        </label> Remember me--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                                <div class="col-12">--%>
<%--                                    <div class="d-grid">--%>
<%--                                        <button class="btn bsb-btn-xl btn-primary" type="submit">Log in now</button>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                        </form>--%>
<%--                        <div class="row">--%>
<%--                            <div class="col-12">--%>
<%--                                <hr class="mt-5 mb-4 border-secondary-subtle">--%>
<%--                                <div class="d-flex gap-2 gap-md-4 flex-column flex-md-row justify-content-md-end">--%>
<%--                                    <a href="<%=request.getContextPath()%>/register" class="link-secondary text-decoration-none">Create new account</a>--%>
<%--                                    <a href="<%=request.getContextPath()%>/forgot/identify" class="link-secondary text-decoration-none">Forgot password</a>--%>
<%--                                </div>--%>
<%--                            </div>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--</section>--%>
<div class="col-md-9 col-sm-9">
    <h1>Login</h1>
    <div class="content-form-page">
        <div class="row">
            <div class="col-md-7 col-sm-7">
                <form action="/MVC/login" method="post" class="form-horizontal form-without-legend" role="form">
                    <div class="form-group">
                        <label for="email" class="col-lg-4 control-label">User name <span class="require">*</span></label>
                        <div class="col-lg-8">
                            <input type="text" class="form-control" id="email" name="username">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="password" class="col-lg-4 control-label">Password <span class="require">*</span></label>
                        <div class="col-lg-8">
                            <input type="password" class="form-control" id="password" name="password">
                        </div>
                    </div>
                    <div class="form-group">
                        <label>
                            <input type="checkbox" checked = "checked" name="remember" >
                        </label> Remember me
                    </div>
                    <div class="row">
                        <div class="col-lg-8 col-md-offset-4 padding-left-0">
                            <a href="<%=request.getContextPath()%>/forgot/identify">Forget Password?</a>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-lg-8 col-md-offset-4 padding-left-0 padding-top-20">
                            <button type="submit" class="btn btn-primary">Login</button>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-lg-8 col-md-offset-4 padding-left-0 padding-top-10 padding-right-30">
                            <hr>
                            <div class="login-socio">
                                <p class="text-muted">or login using:</p>
                                <ul class="social-icons">
                                    <li><a href="#" data-original-title="facebook" class="facebook" title="facebook"></a></li>
                                    <li><a href="#" data-original-title="Twitter" class="twitter" title="Twitter"></a></li>
                                    <li><a href="#" data-original-title="Google Plus" class="googleplus" title="Google Plus"></a></li>
                                    <li><a href="#" data-original-title="Linkedin" class="linkedin" title="LinkedIn"></a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </form>
            </div>
            <div class="col-md-4 col-sm-4 pull-right">
                <div class="form-info">
                    <h2><em>Important</em> Information</h2>
                    <p>Duis autem vel eum iriure at dolor vulputate velit esse vel molestie at dolore.</p>

                    <button type="button" class="btn btn-default">More details</button>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>

<%--<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>--%>
<%--<%@ taglib prefix="c" uri="jakarta.tags.core" %>--%>
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
<%--    <input type="text" id="fname" name="username" value=""><br>--%>
<%--    <label for="lname">Password:</label><br>--%>
<%--    <input type="text" id="lname" name="password" value=""><br>--%>
<%--    <input type="submit" value="Login"><br>--%>
<%--</form>--%>
<%--</body>--%>
<%--</html>--%>