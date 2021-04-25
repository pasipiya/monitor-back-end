package com.software.controller;

import com.software.model.Alert;
import com.software.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "test")
public class AlertController {

    @Autowired
    private AlertService alertService;

    @PostMapping
    public String create(@RequestBody Alert alert){
        return alertService.create(alert);
    }
}
