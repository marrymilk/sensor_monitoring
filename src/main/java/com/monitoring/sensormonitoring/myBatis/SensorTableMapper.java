package com.monitoring.sensormonitoring.myBatis;

import com.monitoring.sensormonitoring.model.SensorDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SensorTableMapper {

    // INSERT
    void insertSensor(SensorDTO.SensorData sensor);

}
