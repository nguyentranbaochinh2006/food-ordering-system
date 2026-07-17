/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chinh.foodordering.mapper;

/**
 *
 * @author Lenovo
 */

import com.chinh.foodordering.model.User;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper {

    public static User map(ResultSet rs) throws SQLException {

        User user = new User();

        user.setUserId(rs.getInt("UserID"));
        user.setRoleId(rs.getInt("RoleID"));
        user.setFullName(rs.getString("FullName"));
        user.setEmail(rs.getString("Email"));
        user.setPasswordHash(rs.getString("PasswordHash"));
        user.setPhone(rs.getString("Phone"));
        user.setAvatar(rs.getString("Avatar"));
        user.setStatus(rs.getBoolean("Status"));
        user.setCreatedAt(rs.getTimestamp("CreatedAt"));

        return user;
    }
}