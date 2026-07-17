<%-- 
    Document   : home
    Created on : Jul 17, 2026, 12:25:18 AM
    Author     : Lenovo
--%>

<%-- 
    Document   : login
    Created on : Jul 17, 2026, 12:23:30 AM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>

<html>

<head>

    <title>Dashboard</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet">

</head>

<body>

<div class="container mt-5">

    <h2>Food Ordering System</h2>

    <hr>

    <h4>

        Welcome,
        ${sessionScope.LOGIN_USER.fullName}

    </h4>

    <br>

    <div class="row">

        <div class="col-md-4">

            <div class="card">

                <div class="card-body">

                    <h5>Restaurant</h5>

                    <p>Manage Restaurants</p>

                    <c:if test="${sessionScope.LOGIN_USER.roleId == 1}">
    <a class="btn btn-primary"
       href="${pageContext.request.contextPath}/restaurants">
        Open
    </a>
</c:if>

                </div>

            </div>

        </div>

        <div class="col-md-4">

            <div class="card">

                <div class="card-body">

                    <h5>Profile</h5>

                    <p>User Information</p>

                </div>

            </div>

        </div>

        <div class="col-md-4">

            <div class="card">

                <div class="card-body">

                    <h5>Logout</h5>

                    <a class="btn btn-danger"

                       href="${pageContext.request.contextPath}/logout">

                        Logout

                    </a>

                </div>

            </div>

        </div>

    </div>

</div>

</body>

</html>

