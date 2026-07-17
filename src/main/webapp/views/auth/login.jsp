<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Food Ordering System - Login</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
          rel="stylesheet">
</head>

<body class="bg-light">

<div class="container">

    <div class="row justify-content-center mt-5">

        <div class="col-md-5">

            <div class="card shadow">

                <div class="card-body">

                    <h2 class="text-center mb-4">
                        Food Ordering System
                    </h2>

                    <h5 class="text-center text-secondary mb-4">
                        Login
                    </h5>

                    <c:if test="${not empty ERROR}">
                        <div class="alert alert-danger">
                            ${ERROR}
                        </div>
                    </c:if>

                    <form action="${pageContext.request.contextPath}/login"
                          method="post">

                        <div class="mb-3">

                            <label class="form-label">
                                Email
                            </label>

                            <input
                                    type="email"
                                    class="form-control"
                                    name="email"
                                    placeholder="Enter your email"
                                    required>

                        </div>

                        <div class="mb-3">

                            <label class="form-label">
                                Password
                            </label>

                            <input
                                    type="password"
                                    class="form-control"
                                    name="password"
                                    placeholder="Enter your password"
                                    required>

                        </div>

                        <div class="d-grid">

                            <button class="btn btn-primary"
                                    type="submit">

                                Login

                            </button>

                        </div>

                    </form>

                </div>

            </div>

            <p class="text-center mt-3 text-muted">
                Food Ordering System © 2026
            </p>

        </div>

    </div>

</div>

</body>
</html>