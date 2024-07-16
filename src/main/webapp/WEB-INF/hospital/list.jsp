<%@ page import="org.example.hospital_javajee.model.Patient" %><%--
  Created by IntelliJ IDEA.
  User: marga
  Date: 15/07/2024
  Time: 22:40
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="list" type="java.util.ArrayList<org.example.hospital_javajee.model.Patient>" scope="request"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/WEB-INF/bootstraps.html"%>
    <title>liste des patients</title>
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
    <div >
        <div class="border-bottom mx-auto p-2">
            <h5 class="h5 text-start">Rechercher un patient: </h5>

            <nav class="navbar bg-body-tertiary">
                <div class="container-fluid">
                    <form class="d-flex" role="search">
                        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn  btn-info btn-outline-success btn-outline-light" type="submit">Valider</button>
                    </form>
                </div>
            </nav>
        </div>

        <div class="border-bottom mx-auto p-2">
            <h3 class="h3 text-start">Ajouter un patient : </h3>
            <button type="button" class="btn btn-info btn-outline-light">Se connecter</button>
        </div>

        <div class="mx-auto p-2">
            <div >
            <h3 class="h3 text-center">Liste des patients : </h3>
        </div>
            <hr>
            <% if (!list.isEmpty()) { %>
            <table >
                <thead>
                <tr>
                    <th>#</th>
                    <th>Name</th>
                    <th>First name</th>
                    <th>Birth date</th>
                    <th>Photo</th>
                </tr>
                </thead>
                <tbody>
                <% for (Patient p : list) {%>
                <tr>
                    <td><%= p.getId() %></td>
                    <td><%= p.getName() %></td>
                    <td><%= p.getDateOfBirth().toString() %></td>
                    <td><%= p.getCustomerPhoto() %></td>

                </tr>
                <% } %>
                </tbody>
            </table>
            <%  } else { %>
            <p class="text-start fs-5">There is no patient in the database yet!</p>
            <%  }  %>
            <hr>
            <div class="text-end">
                <a href="${pageContext.request.contextPath}/hospital/addPatient" class="btn btn-outline-info"><i
                        class="bi bi-plus-circle"></i> Add a Patient</a>
            </div>
        </div>
    </div>


</main>
</body>
</html>
