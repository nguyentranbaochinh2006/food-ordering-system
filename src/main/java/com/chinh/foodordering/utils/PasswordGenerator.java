/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chinh.foodordering.utils;

/**
 *
 * @author Lenovo
 */

import org.mindrot.jbcrypt.BCrypt;

public class PasswordGenerator {

    public static void main(String[] args) {

        System.out.println(
                BCrypt.hashpw("123456",
                        BCrypt.gensalt())
        );

    }

}
