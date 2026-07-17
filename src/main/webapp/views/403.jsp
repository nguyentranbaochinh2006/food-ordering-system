<%-- 
    Document   : 403
    Created on : Jul 17, 2026, 12:15:56 PM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>403 - Access Denied</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet">
</head>

<body class="bg-light">

<div class="container mt-5">

    <div class="alert alert-danger">

        <h3>403 - Access Denied</h3>

        <p>
            You don't have permission to access this page.
        </p>

        <a href="${pageContext.request.contextPath}/home"
           class="btn btn-primary">

            Back Home

        </a>

    </div>

</div>

</body>
</html>