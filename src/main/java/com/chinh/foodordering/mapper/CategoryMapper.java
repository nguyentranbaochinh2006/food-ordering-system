/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chinh.foodordering.mapper;

/**
 *
 * @author Lenovo
 */

import com.chinh.foodordering.model.Category;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryMapper {

    public static Category map(ResultSet rs)
            throws SQLException {

        Category category = new Category();

        category.setCategoryId(
                rs.getInt("CategoryID"));

        category.setRestaurantId(
                rs.getInt("RestaurantID"));

        category.setCategoryName(
                rs.getString("CategoryName"));

        category.setDescription(
                rs.getString("Description"));

        return category;
    }

}
