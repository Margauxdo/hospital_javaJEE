package org.example.hospital_javajee.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.example.hospital_javajee.model.Patient;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "sessionServlet", value = "/login/*")
public class SessionServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getPathInfo().substring(1);
        switch (action) {
            case "formLogin":
                showFormLogin(req, resp);
                break;
            case "submitLogin":
                showSubmitLogin(req, resp);
                break;
        }

        //req.getRequestDispatcher("WEB-INF/hospital/login.jsp").forward(req, resp);


//        HttpSession session = req.getSession();
//        session.setAttribute("isLogged", true);


    }

    protected void showFormLogin(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("/WEB-INF/hospital/login.jsp").forward(req, resp);

    }

    protected void showSubmitLogin(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email = req.getParameter("email");
        String password = req.getParameter("password");
        System.out.println("submit login");

        if (email.equals("admin@gmail.com") && password.equals("admin")) {
            System.out.println("if");
            HttpSession session = req.getSession();
            session.setAttribute("isLogged", true);
            resp.sendRedirect("../hospital/list");
        } else {
            System.out.println("else");
//            req.setAttribute("errorMessage", "Invalid indentifier or password");
            resp.sendRedirect("../hospital/list");
        }

    }

}
