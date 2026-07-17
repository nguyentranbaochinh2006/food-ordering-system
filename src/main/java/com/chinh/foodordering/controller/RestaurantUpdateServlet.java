/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package com.chinh.foodordering.controller;

import com.chinh.foodordering.model.Restaurant;
import com.chinh.foodordering.service.RestaurantService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/restaurants/edit")
public class RestaurantUpdateServlet extends HttpServlet {

    private final RestaurantService restaurantService = new RestaurantService();

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        try {

            int id = Integer.parseInt(request.getParameter("id"));

            Restaurant restaurant = restaurantService.getRestaurantById(id);

            request.setAttribute("restaurant", restaurant);

            request.getRequestDispatcher("/views/restaurant/edit.jsp")
                    .forward(request, response);

        } catch (SQLException e) {
            throw new ServletException(e);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        try {

            Restaurant restaurant = new Restaurant();

            restaurant.setRestaurantId(
                    Integer.parseInt(request.getParameter("restaurantId")));

            restaurant.setOwnerId(
                    Integer.parseInt(request.getParameter("ownerId")));

            restaurant.setRestaurantName(
                    request.getParameter("restaurantName"));

            restaurant.setDescription(
                    request.getParameter("description"));

            restaurant.setAddress(
                    request.getParameter("address"));

            restaurant.setPhone(
                    request.getParameter("phone"));

            restaurant.setImageUrl(
                    request.getParameter("imageUrl"));

            restaurant.setStatus(
                    Boolean.parseBoolean(request.getParameter("status")));

            restaurantService.updateRestaurant(restaurant);

            response.sendRedirect(
                    request.getContextPath() + "/restaurants");

        } catch (SQLException e) {
            throw new ServletException(e);
        }

    }

}