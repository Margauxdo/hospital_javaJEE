
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/WEB-INF/bootstraps.html"%>
    <%@include file="WEB-INF/importStyle.html"%>

    <title>Login</title>
</head>
<body>
<%@include file="WEB-INF/importHeader.html"%>
<main class="container">
    <h3 class="h3 text-start">Se connecter </h3>

    <div class="container-fluid">



        <form action="${pageContext.request.contextPath}/login/submitLogin" method="get">
            <div class="mb-3">
                <label for="email" class="form-label fw-light text-danger-emphasis">Login</label>
                <input type="email" class="form-control p-3 mb-2 bg-danger-subtle text-danger-emphasis" id="email" name="email" >
            </div>
            <div class="mb-3">
                <label for="password" class="form-label fw-light text-danger-emphasis">Password</label>
                <input type="password" class="form-control fw-light p-3 mb-2 bg-danger-subtle text-danger-emphasis" id="password" name="password">
            </div>

            <button type="submit" class="btn btn-info btn-outline-success btn-outline-light">Valider</button>
        </form>
    </div>

</main>
<%@include file="WEB-INF/importFooter.html"%>
</body>
</html>
