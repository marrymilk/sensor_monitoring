package com.monitoring.sensormonitoring.model;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SensorListDTO {

    private int sensorIdx;
    private float sensorValue;
    private String sensorNickName;

}
