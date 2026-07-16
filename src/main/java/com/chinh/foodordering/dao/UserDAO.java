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
import com.chinh.foodordering.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

    private static final String FIND_BY_EMAIL
            = "SELECT * FROM [User] WHERE Email = ?";

    public User findByEmail(String email) throws SQLException {
        try (Connection conn = DBUtils.getConnection(); PreparedStatement ps = conn.prepareStatement(FIND_BY_EMAIL)) {

            ps.setString(1, email);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {

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

            return null;
        }

    }
    
}
