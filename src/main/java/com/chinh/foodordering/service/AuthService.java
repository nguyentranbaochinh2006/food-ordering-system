/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chinh.foodordering.service;

/**
 *
 * @author Lenovo
 */

import com.chinh.foodordering.dao.UserDAO;
import com.chinh.foodordering.model.User;
import java.sql.SQLException;
import org.mindrot.jbcrypt.BCrypt;

public class AuthService {

    private final UserDAO userDAO = new UserDAO();

    public User login(String email, String password) throws SQLException {

        User user = userDAO.findByEmail(email);

        if (user == null) {
            return null;
        }

        if (BCrypt.checkpw(password, user.getPasswordHash())) {
            return user;
        }

        return null;
    }

}