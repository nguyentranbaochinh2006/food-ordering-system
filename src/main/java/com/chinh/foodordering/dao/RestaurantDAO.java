/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Lenovo
 */
package com.chinh.foodordering.dao;

import com.chinh.foodordering.config.DBUtils;
import com.chinh.foodordering.mapper.RestaurantMapper;
import com.chinh.foodordering.model.Restaurant;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RestaurantDAO {

    private static final String FIND_ALL =
            "SELECT * FROM Restaurant ORDER BY RestaurantID";

    public List<Restaurant> findAll() throws SQLException {

        List<Restaurant> restaurants = new ArrayList<>();

        try (
                Connection conn = DBUtils.getConnection();
                PreparedStatement ps = conn.prepareStatement(FIND_ALL);
                ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                restaurants.add(RestaurantMapper.map(rs));
            }
        }

        return restaurants;
    }
    
    
    
    private static final String SEARCH =
        """
        SELECT *
        FROM Restaurant
        WHERE RestaurantName LIKE ?
        ORDER BY RestaurantID
        """;
    
    public List<Restaurant> searchByName(String keyword) throws SQLException {

    List<Restaurant> restaurants = new ArrayList<>();

    try (
            Connection conn = DBUtils.getConnection();
            PreparedStatement ps = conn.prepareStatement(SEARCH)) {

        ps.setString(1, "%" + keyword + "%");

        try (ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                restaurants.add(RestaurantMapper.map(rs));

            }

        }

    }

    return restaurants;

}
    
    
    
    
    
    
    private static final String INSERT = """
    INSERT INTO Restaurant
    (
        OwnerID,
        RestaurantName,
        Description,
        Address,
        Phone,
        ImageURL,
        Status
    )
    VALUES
    (?, ?, ?, ?, ?, ?, ?)
    """;
    public boolean insert(Restaurant restaurant) throws SQLException {

    try (
            Connection conn = DBUtils.getConnection();
            PreparedStatement ps = conn.prepareStatement(INSERT)) {

        ps.setInt(1, restaurant.getOwnerId());
        ps.setString(2, restaurant.getRestaurantName());
        ps.setString(3, restaurant.getDescription());
        ps.setString(4, restaurant.getAddress());
        ps.setString(5, restaurant.getPhone());
        ps.setString(6, restaurant.getImageUrl());
        ps.setBoolean(7, restaurant.isStatus());

        return ps.executeUpdate() > 0;
    }
}
    
    
    
    
    
    private static final String FIND_BY_ID =
        "SELECT * FROM Restaurant WHERE RestaurantID = ?";

private static final String UPDATE =
        """
        UPDATE Restaurant
        SET
            OwnerID = ?,
            RestaurantName = ?,
            Description = ?,
            Address = ?,
            Phone = ?,
            ImageURL = ?,
            Status = ?
        WHERE RestaurantID = ?
        """;


public Restaurant findById(int id) throws SQLException {

    try (
            Connection conn = DBUtils.getConnection();
            PreparedStatement ps = conn.prepareStatement(FIND_BY_ID)) {

        ps.setInt(1, id);

        try (ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {
                return RestaurantMapper.map(rs);
            }

        }

    }

    return null;
}



public boolean update(Restaurant restaurant) throws SQLException {

    try (
            Connection conn = DBUtils.getConnection();
            PreparedStatement ps = conn.prepareStatement(UPDATE)) {

        ps.setInt(1, restaurant.getOwnerId());
        ps.setString(2, restaurant.getRestaurantName());
        ps.setString(3, restaurant.getDescription());
        ps.setString(4, restaurant.getAddress());
        ps.setString(5, restaurant.getPhone());
        ps.setString(6, restaurant.getImageUrl());
        ps.setBoolean(7, restaurant.isStatus());
        ps.setInt(8, restaurant.getRestaurantId());

        return ps.executeUpdate() > 0;
    }

}




private static final String DELETE =
        "DELETE FROM Restaurant WHERE RestaurantID = ?";

public boolean delete(int id) throws SQLException {

    try (
            Connection conn = DBUtils.getConnection();
            PreparedStatement ps = conn.prepareStatement(DELETE)) {

        ps.setInt(1, id);

        return ps.executeUpdate() > 0;
    }

}






}
