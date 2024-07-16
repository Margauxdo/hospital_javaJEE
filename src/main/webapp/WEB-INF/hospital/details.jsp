<%@ page import="org.hibernate.type.descriptor.converter.internal.JpaAttributeConverterImpl" %><%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 16/07/2024
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="patient" scope="request" type="org.example.hospital_javajee.model.Patient" />
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/WEB-INF/bootstraps.html"%>
    <%@include file="WEB-INF/importStyle.html"%>
    <title>infos du patient</title>

</head>
<body >
<h1 class=" text-center display-2 p-3 mb-2 bg-danger-subtle text-danger-emphasis"><%= "Bienvenue à l'hôpital Pinceton-plainsboro" %>
</h1>
<br/>
<nav class="p-3 mb-2 bg-body-tertiary d-flex justify-content-center border-end grid gap-3">
    <a class="fs-5 fw-medium p-2 g-col-6 link-offset-2 link-offset-3-hover link-underline link-underline-opacity-0 link-underline-opacity-75-hover text-secondary" href="#">Acceuil</a>
    <a class="fs-5 fw-medium p-2 g-col-6 link-offset-2 link-offset-3-hover link-underline link-underline-opacity-0 link-underline-opacity-75-hover text-secondary" href="hospital/list">Liste des patients</a>
</nav>
<main>
    <h5 class="h5 text-start">Infos du patient: </h5>

    <div>
        <img <%= patient.getCustomerPhoto()%>/>
    </div>
    <div class="p-3 mb-2 bg-light text-dark">
        <p class="text-success-emphasis fs-6"> Nom : <%= patient.getName()%></p>
    </div>
    <div class="p-3 mb-2 bg-light text-dark">
        <p class="text-success-emphasis fs-6"> Prénom : <%= patient.getFirstname()%></p>
    </div>
    <div class="p-3 mb-2 bg-light text-dark">
        <p class="text-success-emphasis fs-6"> Date de naissance : <%= patient.getDateOfBirth()%></p>
    </div>
    <aside>
        <h5 class="h5 text-start"> Ajouter une consultation </h5>

        <button type="button" class="btn btn-info btn-outline-light" >
            <i class="bi bi-plus-circle"></i>
            <a class="link-underline-light link-light link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover icon-link icon-link-hover" href="#">Ajout</a>

        </button>
    </aside>


</main>
<footer class="p-3 mb-2 bg-dark text-white d-flex fixed-bottom">
    <p class="text-center lh-lg">2024 Hôpital Princeton-Plainsboro. Tous droits réserves</p>
</footer>
</body>
</html>
