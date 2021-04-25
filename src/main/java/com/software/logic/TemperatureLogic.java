package com.software.logic;

import com.software.model.Sensor;
import com.software.repository.DataAcquisitionRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TemperatureLogic {
    public boolean checkValue(int checkValue){
        return checkValue>20 ? true : false;
    }

}
