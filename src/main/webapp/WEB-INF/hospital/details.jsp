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
<%@include file="WEB-INF/importHeader.html"%>

<main>
    <h5 class="h5 text-start">Infos du patient: </h5>

    <div>
        <img alt="img-patient" <%= patient.getUrlCustomerPhoto()%>/>
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
    <div>
        <h5 class="h5 text-start"> Ajouter une consultation </h5>

    </div>
</br>

<aside>
        <button type="button" class="btn btn-info btn-outline-light  " >
            <i class="bi bi-plus-circle"></i>
            <a class="link-underline-light link-light link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover icon-link icon-link-hover" href="#">Ajout</a>

        </button>

    </aside>
</br>


</main>
<%@include file="WEB-INF/importFooter.html"%>

</body>
</html>
