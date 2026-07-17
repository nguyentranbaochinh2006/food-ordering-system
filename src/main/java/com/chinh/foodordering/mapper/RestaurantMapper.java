/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chinh.foodordering.mapper;

/**
 *
 * @author Lenovo
 */

import com.chinh.foodordering.model.Restaurant;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RestaurantMapper {

    public static Restaurant map(ResultSet rs) throws SQLException {

        Restaurant restaurant = new Restaurant();

        restaurant.setRestaurantId(rs.getInt("RestaurantID"));
        restaurant.setOwnerId(rs.getInt("OwnerID"));
        restaurant.setRestaurantName(rs.getString("RestaurantName"));
        restaurant.setDescription(rs.getString("Description"));
        restaurant.setAddress(rs.getString("Address"));
        restaurant.setPhone(rs.getString("Phone"));
        restaurant.setImageUrl(rs.getString("ImageURL"));
        restaurant.setStatus(rs.getBoolean("Status"));
        restaurant.setCreatedAt(rs.getTimestamp("CreatedAt"));

        return restaurant;
    }
}
