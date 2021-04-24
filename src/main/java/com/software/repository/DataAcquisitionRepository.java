package com.software.repository;

import com.software.model.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataAcquisitionRepository extends JpaRepository <Sensor , Long>{

}
