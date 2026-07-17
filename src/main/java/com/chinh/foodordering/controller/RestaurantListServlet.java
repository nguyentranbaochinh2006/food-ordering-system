/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package com.chinh.foodordering.controller;

import com.chinh.foodordering.model.Restaurant;
import com.chinh.foodordering.service.RestaurantService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/restaurants")
public class RestaurantListServlet extends HttpServlet {

    private final RestaurantService restaurantService = new RestaurantService();

    @Override
protected void doGet(HttpServletRequest request,
        HttpServletResponse response)
        throws ServletException, IOException {

    try {

        String keyword = request.getParameter("keyword");

        List<Restaurant> restaurants;

        if (keyword != null && !keyword.trim().isEmpty()) {

            restaurants =
                    restaurantService.searchRestaurant(keyword);

        } else {

            restaurants =
                    restaurantService.getAllRestaurants();

        }

        request.setAttribute("restaurants", restaurants);

        request.setAttribute("keyword", keyword);

        request.getRequestDispatcher("/views/restaurant/list.jsp")
                .forward(request, response);

    } catch (SQLException e) {

        throw new ServletException(e);

    }

}
}