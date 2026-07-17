<%-- 
    Document   : list
    Created on : Jul 17, 2026, 9:07:33 AM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Restaurant List</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
      rel="stylesheet">
    </head>
    <body>
        <div class="container mt-5">
        <h2>Restaurant List</h2>
        <form class="row g-3 mb-3"
      action="${pageContext.request.contextPath}/restaurants"
      method="get">

    <div class="col-md-4">

        <input
                class="form-control"
                type="text"
                name="keyword"
                value="${keyword}"
                placeholder="Search restaurant...">

    </div>

    <div class="col-auto">

        <button class="btn btn-primary"
                type="submit">

            Search

        </button>

    </div>

</form>
        
        
        
        <a class="btn btn-primary" href="${pageContext.request.contextPath}/restaurants/create">

            Add Restaurant

        </a>

        <br><br>

        <table class="table table-bordered table-hover">
            
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Address</th>
                <th>Phone</th>
                <th>Status</th>
                <th>Action</th>
            </tr>

            <c:forEach items="${restaurants}" var="restaurant">

                <tr>

                    <td>${restaurant.restaurantId}</td>

                    <td>${restaurant.restaurantName}</td>

                    <td>${restaurant.address}</td>

                    <td>${restaurant.phone}</td>

                    <td>${restaurant.status}</td>

                    <td>

                        <a class="btn btn-warning btn-sm" href="${pageContext.request.contextPath}/restaurants/edit?id=${restaurant.restaurantId}">
                            Edit
                        </a>
                        |
                        <a class="btn btn-danger btn-sm" href="${pageContext.request.contextPath}/restaurants/delete?id=${restaurant.restaurantId}"
                           onclick="return confirm('Delete this restaurant?')">

                            Delete

                        </a>
                    </td>

                </tr>

            </c:forEach>

        </table>

<br><br>

</div>

</body>

</html>
