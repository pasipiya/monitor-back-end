package com.software.model;

import javax.persistence.*;

@Entity
@Table( name = "data" )
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( name = "id" )
    private int userId;

    @Column(name = "username", unique = true)
    private String username;

    private String email;

    private String mobile;

    private String notificationWay;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setNotificationWay(String notificationWay) {
        this.notificationWay = notificationWay;
    }

    public String getNotificationWay() {
        return notificationWay;
    }
}

