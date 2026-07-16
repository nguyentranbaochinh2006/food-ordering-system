<%-- 
    Document   : login
    Created on : Jul 17, 2026, 12:23:30 AM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>

<h2>Login</h2>

<p style="color:red">
    ${ERROR}
</p>

<form action="${pageContext.request.contextPath}/login" method="post">

    Email:
    <input type="email"
           name="email"
           required>

    <br><br>

    Password:
    <input type="password"
           name="password"
           required>

    <br><br>

    <button type="submit">
        Login
    </button>

</form>

</body>
</html>
