package com.software.service;


import com.software.model.Sensor;
import com.software.repository.DataAcquisitionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorService {

    @Autowired
    private DataAcquisitionRepository dataAcquisitionRepository;
    public Sensor create(Sensor sensor){
        Sensor savedSensor= dataAcquisitionRepository.save(sensor);
        return savedSensor;
    }

    public List<Sensor> getSensorData(String sensorId, String userId){
        return dataAcquisitionRepository.findBySensorIdAndUserId(sensorId,userId);
    }

    public  Sensor getOneSensorData(Long id){
        return dataAcquisitionRepository.getOne(id);
    }

    public String test(){
        return "Great";
    }
}
