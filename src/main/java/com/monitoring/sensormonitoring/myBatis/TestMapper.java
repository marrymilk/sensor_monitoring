package com.monitoring.sensormonitoring.myBatis;


import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface TestMapper {
    List<HashMap<Object,Object>> selectTest();

    List<HashMap<Object,Object>> insertTest();
}
