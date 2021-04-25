package com.software.service;


import com.software.logic.TemperatureLogic;
import com.software.model.Alert;
import com.software.model.Sensor;
import com.software.model.User;
import com.software.notification.CallNotification;
import com.software.notification.EmailNotification;
import com.software.notification.SmsNotification;
import com.software.repository.AlertRepository;
import com.software.repository.DataAcquisitionRepository;
import com.software.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SensorService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AlertRepository alertRepository;

    @Autowired
    private DataAcquisitionRepository dataAcquisitionRepository;
    public Sensor create(Sensor sensor){
        Sensor savedSensor= dataAcquisitionRepository.save(sensor);
        TemperatureLogic temperatureLogic = new TemperatureLogic();
        boolean isAlert = temperatureLogic.checkValue(Integer.parseInt(sensor.getDataValue()));
        if(isAlert){
            List<User> users = userRepository.findAll();

            for( User user : users ){
                if( user.getNotificationWay().equals("email")) {
                    new EmailNotification().SendEmail( user );
                }

                if( user.getNotificationWay().equals("call")) {
                    new CallNotification().SendCall(  user );
                }

                if( user.getNotificationWay().equals("sms")) {
                    new SmsNotification().SendSms(  user );
                }
            }

            Alert alert = new Alert();
            alert.setAlertId( 1 );
            alert.setText(sensor.getSensorId() );

            alertRepository.save(alert);
        }
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
