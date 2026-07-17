/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package com.chinh.foodordering.controller;

import com.chinh.foodordering.service.RestaurantService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/restaurants/delete")
public class RestaurantDeleteServlet extends HttpServlet {

    private final RestaurantService restaurantService = new RestaurantService();

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        try {

            int id = Integer.parseInt(request.getParameter("id"));

            restaurantService.deleteRestaurant(id);

            response.sendRedirect(
                    request.getContextPath() + "/restaurants");

        } catch (SQLException e) {
            throw new ServletException(e);
        }

    }

}