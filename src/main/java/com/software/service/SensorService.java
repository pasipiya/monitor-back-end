package com.software.service;


import com.software.controller.DataAcquisition;
import com.software.model.Sensor;
import com.software.repository.DataAcquisitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SensorService {

    @Autowired
    private DataAcquisitionRepository dataAcquisitionRepository;
    public void create(Sensor sensor){
        Sensor savedSensor= dataAcquisitionRepository.save(sensor);
    }
}
