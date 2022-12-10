package com.monitoring.sensormonitoring;

import com.google.gson.Gson;
import com.monitoring.sensormonitoring.model.SensorDTO;
import com.monitoring.sensormonitoring.myBatis.SensorTableMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class SensorController {

    private final Gson gson = new Gson();
    //@Autowired 는 비추천 RequiredArgsConstructor
    private final SensorTableMapper sensorTableMapper;

    @PostMapping("/sensor")
    public SensorDTO insertSensor(@RequestBody SensorDTO sensorDTO) {

//        SensorDTO.SensorData sensorData = SensorDTO.SensorData.builder()
//                .sensorValue(44.4)
//                .key("te")
//                .build();



        //System.out.println(gson.toJson(sensorDTO));
//        for (SensorListDTO sensorListDTO:
//                sensorDTO.getSensorList()) {
//
//            System.out.println(gson.toJson(sensorListDTO));
//            System.out.println(sensorListDTO.getSensorIdx());
//            System.out.println(sensorListDTO.getSensorValue());
//            System.out.println(sensorListDTO.getSensorNickName());
//            System.out.println(sensorDTO.getEqpId());
//            HashMap<String, Object> hashMap = new HashMap<>();
//            hashMap.put("eqp_idx", sensorDTO.getEqpId());
//            hashMap.put("sensor_idx", sensorListDTO.getSensorIdx());
//            hashMap.put("sensor_value", sensorListDTO.getSensorValue());
//            hashMap.put("sensor_nick", sensorListDTO.getSensorNickName());
//
//
//            sensorTableMapper.insertSensor(hashMap);
//        }

        for (SensorDTO.SensorData data : sensorDTO.getSensorData()) {
            sensorTableMapper.insertSensor(data);
        }


        /**
         * 1. access_token 값을 받아서, 해당 인증 확인
         * 2. token은 cache 저장하든, db에 읽어오든 eqp_table access_token값과 매칭
         * 3. token이 맞을경우에만 sensor_tbl에 insert
         */

        return sensorDTO;
    }
}
