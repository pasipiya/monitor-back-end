package com.software.repository;

import com.software.model.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DataAcquisitionRepository extends JpaRepository <Sensor , Long>{
    List<Sensor> findBySensorIdAndUserId(String sensorId, String userId);
}
