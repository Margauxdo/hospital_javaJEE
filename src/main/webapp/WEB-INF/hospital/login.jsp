
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/WEB-INF/bootstraps.html"%>
    <%@include file="WEB-INF/importStyle.html"%>

    <title>Login</title>
</head>
<body>
<h1 class=" text-center display-2 p-3 mb-2 bg-danger-subtle text-danger-emphasis"><%= "Bienvenue à l'hôpital Pinceton-plainsboro" %>
</h1>
<br/>
<nav class="p-3 mb-2 bg-body-tertiary d-flex justify-content-center border-end grid gap-3">
    <a class="fs-5 fw-medium p-2 g-col-6 link-offset-2 link-offset-3-hover link-underline link-underline-opacity-0 link-underline-opacity-75-hover text-secondary" href="#">Acceuil</a>
    <a class="fs-5 fw-medium p-2 g-col-6 link-offset-2 link-offset-3-hover link-underline link-underline-opacity-0 link-underline-opacity-75-hover text-secondary" href="hospital/list">Liste des patients</a>
</nav>
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
<footer class="p-3 mb-2 bg-dark text-white fixed-bottom">
    <p class="text-center lh-lg">2024 Hôpital Princeton-Plainsboro. Tous droits réserves</p>
</footer>
</body>
</html>
