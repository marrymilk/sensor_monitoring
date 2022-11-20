package com.monitoring.sensormonitoring.myBatis;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface SensorTableMapper {

    // INSERT
    void insertSensor(HashMap<String, Object> sensor);

}
