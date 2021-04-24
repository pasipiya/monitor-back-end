package com.software.controller;


import com.software.model.Sensor;
import com.software.repository.DataAcquisitionRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataAcquisition {
    private final DataAcquisitionRepository repository;

    public DataAcquisition(DataAcquisitionRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/sensor-data")
    Sensor newSensor (@RequestBody Sensor newSensor){
        return repository.save(newSensor);
    }


}
