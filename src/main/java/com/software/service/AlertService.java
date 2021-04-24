package com.software.service;

import com.software.model.Alert;
import com.software.repository.AlertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class AlertService {

    @Autowired
    private AlertRepository alertRepository;

    public String create(Alert alert){
        Alert savedAlert = alertRepository.save(alert);
        return  savedAlert.getText();
    }
}
