/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Lenovo
 */
package com.chinh.foodordering.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DBUtils {

    private static final String URL =
            "jdbc:sqlserver://localhost:1433;databaseName=FoodOrderingSystem;encrypt=true;trustServerCertificate=true";

    private static final String USER = "sa";
    private static final String PASSWORD = "123";

    private DBUtils() {
    }

    public static Connection getConnection() throws SQLException {

    try {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    } catch (ClassNotFoundException e) {
        throw new SQLException("SQL Server JDBC Driver not found.", e);
    }

    return DriverManager.getConnection(URL, USER, PASSWORD);
}
}