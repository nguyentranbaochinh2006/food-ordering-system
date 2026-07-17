/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package com.chinh.foodordering.controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author Lenovo
 */

import com.chinh.foodordering.model.Restaurant;
import com.chinh.foodordering.service.RestaurantService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;


import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/restaurants/create")
public class RestaurantCreateServlet extends HttpServlet {

    private final RestaurantService restaurantService = new RestaurantService();

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        request.getRequestDispatcher("/views/restaurant/create.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        
        
        try {
            String restaurantName = request.getParameter("restaurantName");
String address = request.getParameter("address");

if (restaurantName == null || restaurantName.isBlank()
        || address == null || address.isBlank()) {

    request.setAttribute("error",
            "Restaurant Name and Address are required.");

    request.getRequestDispatcher("/views/restaurant/create.jsp")
            .forward(request, response);

    return;
}
            
            
            
            

            Restaurant restaurant = new Restaurant();

            
            restaurant.setOwnerId(
                    Integer.parseInt(request.getParameter("ownerId")));

            

restaurant.setRestaurantName(restaurantName);

            restaurant.setDescription(
                    request.getParameter("description"));

            restaurant.setAddress(address);

            restaurant.setPhone(
                    request.getParameter("phone"));

            restaurant.setImageUrl(
                    request.getParameter("imageUrl"));

            restaurant.setStatus(true);

            restaurantService.createRestaurant(restaurant);

            response.sendRedirect(
                    request.getContextPath() + "/restaurants");

        } catch (NumberFormatException ex) {

    request.setAttribute("error", "Owner ID must be a number.");

    request.getRequestDispatcher("/views/restaurant/create.jsp")
            .forward(request, response);

} catch (SQLException ex) {

    throw new ServletException(ex);

}

    }

}