/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chinh.foodordering.model;

/**
 *
 * @author Lenovo
 */

import java.sql.Timestamp;

public class Restaurant {

    private int restaurantId;
    private int ownerId;
    private String restaurantName;
    private String description;
    private String address;
    private String phone;
    private String imageUrl;
    private boolean status;
    private Timestamp createdAt;

    public Restaurant() {
    }

    public Restaurant(int restaurantId, int ownerId,
            String restaurantName,
            String description,
            String address,
            String phone,
            String imageUrl,
            boolean status,
            Timestamp createdAt) {

        this.restaurantId = restaurantId;
        this.ownerId = ownerId;
        this.restaurantName = restaurantName;
        this.description = description;
        this.address = address;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.status = status;
        this.createdAt = createdAt;
    }

    

    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }
}
