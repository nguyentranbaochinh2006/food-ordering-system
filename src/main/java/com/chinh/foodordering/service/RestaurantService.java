/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chinh.foodordering.service;

/**
 *
 * @author Lenovo
 */

import com.chinh.foodordering.dao.RestaurantDAO;
import com.chinh.foodordering.model.Restaurant;

import java.sql.SQLException;
import java.util.List;

public class RestaurantService {

    private final RestaurantDAO restaurantDAO = new RestaurantDAO();

    public List<Restaurant> getAllRestaurants() throws SQLException {
        return restaurantDAO.findAll();
    }
    
    
    public boolean createRestaurant(Restaurant restaurant)
        throws SQLException {

    return restaurantDAO.insert(restaurant);
}
    
    
    public Restaurant getRestaurantById(int id)
        throws SQLException {

    return restaurantDAO.findById(id);
}

public boolean updateRestaurant(Restaurant restaurant)
        throws SQLException {

    return restaurantDAO.update(restaurant);
}


public boolean deleteRestaurant(int id)
        throws SQLException {

    return restaurantDAO.delete(id);
}


public List<Restaurant> searchRestaurant(String keyword)
        throws SQLException {

    return restaurantDAO.searchByName(keyword);

}
}
