package com.xinbitiangao.transportservice.controller;

import com.xinbitiangao.transportservice.service.RoadlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 路灯相关Controller
 */
@RestController
@RequestMapping(value = "/api/v2", method = RequestMethod.POST)
public class RoadlightController {
    @Autowired
    private RoadlightService roadlightService;


    @RequestMapping("/set_roadlight_control_mode")
    public Map setRoadlightControlMode(@RequestBody HashMap<String, Object> map) {
        return roadlightService.setRoadlightControlMode(map);
    }

    @RequestMapping("/get_roadlight_control_mode")
    public Map getRoadlightControlMode(@RequestBody HashMap<String, Object> map) {
        return roadlightService.getRoadlightControlMode(map);
    }

    @RequestMapping("/set_roadlight_status")
    public Map setRoadlightStatus(@RequestBody HashMap<String, Object> map) {
        return roadlightService.setRoadlightStatus(map);
    }

    @RequestMapping("/get_roadlight_status")
    public Map getRoadlightStatus(@RequestBody HashMap<String, Object> map) {
        return roadlightService.getRoadlightStatus(map);
    }
    @RequestMapping("/set_light_value")
    public Map setLightValue(@RequestBody HashMap<String, Object> map) {
        return roadlightService.setLightValue(map);
    }

    @RequestMapping("/get_light_value")
    public Map getLightValue(@RequestBody HashMap<String, Object> map) {
        return roadlightService.getLightValue(map);
    }

}
