package org.example.hospital_javajee.controller;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.hospital_javajee.model.Patient;
import org.example.hospital_javajee.service.PatientService;
import org.hibernate.Hibernate;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

@WebServlet(name = "patientServlet", value = "/hospital/*")
public class PatientServlet extends HttpServlet {

    private Patient patient;
    private PatientService patientService;

public void init() throws ServletException {
    patient = new Patient();
    this.patientService = new PatientService();
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
        case "details":
            showDetails(req,resp);
            break;
        case "search":
            searchPatient(req,resp);
            break;
    }





}
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println("on fait quoi ?");
    String name = req.getParameter("name");
    String firstName = req.getParameter("firstName");
    LocalDate dateOfBirth = LocalDate.parse(req.getParameter("dateOfBirth"));
    String urlCustomerPhoto = req.getParameter("urlCustomerPhoto");
    Patient patient = Patient.builder()
            .name(name)
            .firstname(firstName)
            .dateOfBirth(dateOfBirth)
            .urlCustomerPhoto(urlCustomerPhoto)
            .build();

    patientService.createPatient(patient);
    resp.sendRedirect("list");

}

private void showAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    List<Patient> list = patientService.findAllPatient();
    req.setAttribute("patients", list);
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
private void showDetails(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    int patientId = Integer.parseInt(req.getParameter("id"));
    Patient patient = patientService.findPatientById(patientId);
    req.setAttribute("patient", patient);
    System.out.println("coucou");
    req.getRequestDispatcher("/WEB-INF/hospital/details.jsp").forward(req, resp);


}
private void edit(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String id = req.getParameter("id");

}
private void deletePatient(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String id = req.getParameter("id");

}
private void searchPatient(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String name = req.getParameter("search");
    List<Patient> patients = patientService.findPatientByName(name);
    req.setAttribute("patients", patients);
    req.getRequestDispatcher("/WEB-INF/hospital/list.jsp").forward(req, resp);
}

}
