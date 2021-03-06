package com.software.controller;


import com.software.model.Sensor;
import com.software.service.SensorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DataAcquisition {
    private final SensorService sensorService;

    public DataAcquisition(SensorService sensorService) {
        this.sensorService = sensorService;
    }

    @CrossOrigin
    @PostMapping("/sensor-data")
    Sensor newSensor (@RequestBody Sensor newSensor){
        return sensorService.create(newSensor);
    }

    @CrossOrigin
    @GetMapping("/sensor-data/{sensorId}/{userId}")
    List<Sensor> getSensorData (@PathVariable String sensorId, @PathVariable String userId){
        return (List<Sensor>) sensorService.getSensorData(sensorId,userId);
    }

    @CrossOrigin
    @GetMapping("/test")
    String test(){
        return sensorService.test();
    }
}
