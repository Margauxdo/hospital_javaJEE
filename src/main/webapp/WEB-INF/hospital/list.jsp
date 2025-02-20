<%@ page import="org.example.hospital_javajee.model.Patient" %>

<jsp:useBean id="patients" type="java.util.ArrayList<org.example.hospital_javajee.model.Patient>" scope="request"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="/WEB-INF/bootstraps.html"%>
    <%@include file="WEB-INF/importStyle.html"%>

    <title>liste des patients</title>
</head>
<body>
<%@include file="WEB-INF/importHeader.html"%>

<main class="container">
    <div >
        <div class="border-bottom mx-auto p-2">
            <h5 class="h5 text-start">Rechercher un patient: </h5>

            <nav class="navbar bg-body-tertiary">
                <div class="container-fluid">
                    <%-- revoir la recherche avec la condition du nom --%>
                    <form class="d-flex" action="${pageContext.request.contextPath}/hospital/search" method="get">

                        <% if (!patients.isEmpty()) { %>

                        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" name="search">
                        <% for (Patient p : patients) {%>

                        <% } %>
                        <button class="btn  btn-info btn-outline-success btn-outline-light" type="submit">Valider</button>


                        <%  } else { %>
                        <p class="text-start fs-5">There is no patient in the database yet!</p>
                        <%  }  %>

                    </form>
                </div>
            </nav>
        </div>




        <div class="border-bottom mx-auto p-2">
            <h3 class="h3 text-start">Ajouter un patient : </h3>

            <% if (session.getAttribute("isLogged") != null && (boolean) session.getAttribute("isLogged")){%>




            <form action="${pageContext.request.contextPath}/hospital/patientServlet" method="post" >
                <div class="form-group mx-auto p-2">
                    <label for="name">Nom</label>
                    <input type="text" class="form-control" id="name" name="name" required>
                </div>
                <div class="form-group mx-auto p-2">
                    <label for="firstname">Prénom</label>
                    <input type="text" class="form-control" id="firstname" name="firstName" required>
                </div>
                <div class="form-group mx-auto p-2">
                    <label for="dateOfBirth">Date de naissance</label>
                    <input type="date" class="form-control" id="dateOfBirth" name="dateOfBirth" required>
                </div>
                <div class="form-group mx-auto p-3">
                    <label for="urlCustomerPhoto">Photo</label>
                    <input type="file" class="form-control-file" id="urlCustomerPhoto" name="urlCustomerPhoto" accept="image/*" >
                </div>
                <div class="position-relative">
                <button type="submit" class="btn  btn-info btn-outline-success btn-outline-light mx-auto p-2 position-absolute top-50 start-50 translate-middle">Ajout patient</button>
                </div>
            </form>

            <%}else { %>
            <button type="button" class="btn btn-info btn-outline-light" >
                <a class="link-underline-light link-light link-offset-2 link-underline-opacity-25 link-underline-opacity-100-hover icon-link icon-link-hover" href="${pageContext.request.contextPath}/login/formLogin">Se connecter</a>
            </button>
            <%}%>

        </div>

        <div class="mx-auto p-2">
            <div >
            <h3 class="h3 text-center">Liste des patients : </h3>
        </div>
            <hr>
            <% if (!patients.isEmpty()) { %>
            <table class="table table-striped">
                <thead>
                <tr>
                    <th >#</th>
                    <th >Name</th>
                    <th >First name</th>
                    <th>Birth date</th>
                    <th >Photo</th>
                </tr>
                </thead>
                <tbody>
                <% for (Patient p : patients) {%>
                <tr>
                    <td><%= p.getId() %></td>
                    <td><%= p.getName() %></td>
                    <td><%= p.getFirstname() %></td>
                    <td><%= p.getDateOfBirth().toString() %></td>
                    <td><%= p.getUrlCustomerPhoto() %></td>
                    <td>
                        <a href="${pageContext.request.contextPath}/hospital/details?id=<%= p.getId() %>"
                           class="btn btn-outline-info"><i class="bi bi-eye"></i> Details</a>
                    </td>

                </tr>
                <% } %>
                </tbody>
            </table>
            <%  } else { %>
            <p class="text-start fs-5">There is no patient in the database yet!</p>
            <%  }  %>
            <hr>

        </div>
    </div>


</main>
<%@include file="WEB-INF/importFooter.html"%>
</body>
</html>
