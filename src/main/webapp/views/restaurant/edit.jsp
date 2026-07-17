<%-- 
    Document   : edit
    Created on : Jul 17, 2026, 9:46:35 AM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>
    <title>Edit Restaurant</title>
</head>

<body>

<h2>Edit Restaurant</h2>

<form action="${pageContext.request.contextPath}/restaurants/edit"
      method="post">

    <input type="hidden"
           name="restaurantId"
           value="${restaurant.restaurantId}">

    Owner ID

    <input type="number"
           name="ownerId"
           value="${restaurant.ownerId}">

    <br><br>

    Restaurant Name

    <input type="text"
           name="restaurantName"
           value="${restaurant.restaurantName}">

    <br><br>

    Description

    <input type="text"
           name="description"
           value="${restaurant.description}">

    <br><br>

    Address

    <input type="text"
           name="address"
           value="${restaurant.address}">

    <br><br>

    Phone

    <input type="text"
           name="phone"
           value="${restaurant.phone}">

    <br><br>

    Image URL

    <input type="text"
           name="imageUrl"
           value="${restaurant.imageUrl}">

    <br><br>

    Status

    <select name="status">

        <option value="true"
            ${restaurant.status ? "selected" : ""}>
            Active
        </option>

        <option value="false"
            ${!restaurant.status ? "selected" : ""}>
            Inactive
        </option>

    </select>

    <br><br>

    <button type="submit">

        Update

    </button>

</form>

</body>

</html>
