/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package com.chinh.foodordering.controller;



/**
 *
 * @author Lenovo
 */

import com.chinh.foodordering.model.User;
import com.chinh.foodordering.service.AuthService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private final AuthService authService = new AuthService();

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        request.getRequestDispatcher("/views/auth/login.jsp")
                .forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");

        
        if (email == null || email.trim().isEmpty()
        || password == null || password.trim().isEmpty()) {

    request.setAttribute("ERROR", "Email and password are required.");

    request.getRequestDispatcher("/views/auth/login.jsp")
            .forward(request, response);

    return;
}
        
        
        try {

            User user = authService.login(email, password);

            if (user != null) {

                HttpSession session = request.getSession();

                session.setAttribute("LOGIN_USER", user);
                
                session.setMaxInactiveInterval(30 * 60);

                response.sendRedirect(request.getContextPath() + "/home");

            } else {

                request.setAttribute("ERROR", "Invalid email or password");

                request.getRequestDispatcher("/views/auth/login.jsp")
                        .forward(request, response);

            }

        } catch (SQLException e) {

            throw new ServletException(e);

        }

    }

}