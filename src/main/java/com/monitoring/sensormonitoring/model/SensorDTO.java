package com.monitoring.sensormonitoring.model;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@Builder
@ToString
public class SensorDTO {

    /*
     * idx : primary key
     * sensor_id : primary key (여러 장비에 같은 센서 타입으로 추가 될 수 있음)
     * sensor_type: 센서 타입 (ex. 1.온도, 2.전압, 저항.. 등등) / 확장성
     * sensor_nick: 센서 별명
     * sensor_value: 센서가 어떤 값을 보내는지
     * eqp_id : 장비 id (user(1) : eqp(N) : sensor(N))
     *
     * 센서 등록 페이지에서 센서 타입이 없을 경우 센서 타입 등록 모달(타입 등록할때, 단위 설명(비고란) 로 추가) 만들어두기
     */


    private String sensorId;

    private String eqpId;

    private List<SensorListDTO> sensorList;

    private String accessToken;


}
