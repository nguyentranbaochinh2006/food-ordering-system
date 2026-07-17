<%-- 
    Document   : create
    Created on : Jul 17, 2026, 9:34:02 AM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>
    <title>Create Restaurant</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
      rel="stylesheet">
</head>

<body>
<div class="container mt-5">
<h2>Create Restaurant</h2>

<form action="${pageContext.request.contextPath}/restaurants/create"
      method="post">

    

    <div class="mb-3">
    <label class="form-label">Owner ID</label>
    <input
        class="form-control"
        type="number"
        name="ownerId"
         required>
</div>

    

    <div class="mb-3">
    <label class="form-label">Restaurant Name</label>
    <input class="form-control"
           type="text"
           name="restaurantName"
           required>
</div>

    

    <div class="mb-3">
    <label class="form-label">Description</label>
    <input
        class="form-control"
        type="text"
        name="description"
        required>
</div>

    
    <div class="mb-3">
    <label class="form-label">Address</label>
    <input
        class="form-control"
        type="text"
        name="address"
        required>
</div>
    

    
    <div class="mb-3">
    <label class="form-label">Phone</label>
    <input
        class="form-control"
        type="text"
        name="phone"
        required>
</div>
    

    
    <div class="mb-3">
    <label class="form-label">Image URL</label>
    <input
        class="form-control"
        type="text"
        name="imageUrl"
        required>
</div>
    

    <button class="btn btn-success me-2"
        type="submit">

        Create

    </button>
    
    
    <a class="btn btn-secondary"
   href="${pageContext.request.contextPath}/restaurants">

Back

</a>
    
    <p style="color:red">

${error}

</p>

</form>

</div>

</body>

</html>