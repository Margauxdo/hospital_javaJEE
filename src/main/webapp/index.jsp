<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <%@include file="WEB-INF/bootstraps.html"%>
    <title>JSP - Hello World</title>
</head>
<body>
<h1 class=" text-center display-2 p-3 mb-2 bg-danger-subtle text-danger-emphasis"><%= "Bienvenue à l'hôpital Pinceton-plainsboro" %>
</h1>
<br/>
<nav class="p-3 mb-2 bg-body-tertiary d-flex justify-content-center border-end grid gap-3">
    <a class="fs-5 fw-medium p-2 g-col-6 link-offset-2 link-offset-3-hover link-underline link-underline-opacity-0 link-underline-opacity-75-hover text-secondary" href="index.jsp">Acceuil</a>
    <a class="fs-5 fw-medium p-2 g-col-6 link-offset-2 link-offset-3-hover link-underline link-underline-opacity-0 link-underline-opacity-75-hover text-secondary" href="hospital/list">Liste des patients</a>
</nav>
<div >
    <h2 class="h2 text-start">A propos de nous</h2>
    <p class="text-start fs-5">Nous sommes dédiés à fournir les meilleurs soins médicaux à nos patients avec compassion et excellence</p>
</div>
<footer class="p-3 mb-2 bg-dark text-white fixed-bottom">
    <p class="text-center lh-lg">2024 Hôpital Princeton-Plainsboro. Tous droits réserves</p>
</footer>
</body>
</html>
