package org.example.hospital_javajee.controller;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.hospital_javajee.model.Patient;
import org.hibernate.Hibernate;

import java.io.IOException;
import java.time.LocalDate;

@WebServlet(name = "patientServlet", value = "/hospital/*")
public class PatientServlet extends HttpServlet {

    private Patient patient;

public void init() throws ServletException {
    patient = new Patient();
}
@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String action = req.getPathInfo().substring(1);
    switch (action) {
        case "list":
            showAll(req,resp);
            break;
        case "addPatient":
            showForm(req,resp);
            break;
        case "add":
             add(req,resp);
             break;
         case "edit":
             edit(req,resp);
             break;
        case "delete":
            deletePatient(req,resp);
            break;
    }





}
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

}

private void showAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    req.setAttribute("patient", patient);
    req.getRequestDispatcher("/WEB-INF/hospital/list.jsp").forward(req, resp);
}
private void showForm(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //Patient patient1ToAdd = new Patient("","", LocalDate.now());
    req.setAttribute("patient", patient);
    //req.setAttribute("model", "add");
}
private void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String firstName = req.getParameter("firstName");
    String lastName = req.getParameter("Name");
    LocalDate birthDate = LocalDate.parse(req.getParameter("dateOfBirth"));
    Byte photo = Byte.parseByte(req.getParameter("customerPhoto"));
    resp.sendRedirect("list");
}
private void edit(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String id = req.getParameter("id");

}
private void deletePatient(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String id = req.getParameter("id");

}

}
