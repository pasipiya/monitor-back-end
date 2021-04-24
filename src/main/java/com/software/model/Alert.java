package com.software.model;

import javax.persistence.*;

@Entity
@Table( name = "data" )
public class Alert {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( name = "id" )
    private int alertId;

    private String text;

    public void setAlertId(int alertId) {
        this.alertId = alertId;
    }

    public int getAlertId() {
        return alertId;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
