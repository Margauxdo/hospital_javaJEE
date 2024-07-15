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
    <%@include file="WEB-INF/bootstraps.html"%>
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
        <div >
            div >
            <h2 class="display-5 text-start">A propos de nous</h2>
        </div>
            <hr>
            <% if (patientList != null && !patientList.isEmpty()) { %>
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
                <% for (Patient p : patientList) {%>
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
            <p>There is no patient in the database yet!</p>
            <%  }  %>
            <hr>
            <div class="text-end">
                <a href="${pageContext.request.contextPath}/hospital/addPatient" class="btn btn-outline-success"><i
                        class="bi bi-plus-circle"></i> Add a Patient</a>
            </div>
        </div>
    </div>


</main>
</body>
</html>
