package com.xinbitiangao.transportservice.controller;

import com.xinbitiangao.transportservice.service.StralightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 红绿灯Controller
 */
@RestController
@RequestMapping(value = "/api/v2", method = RequestMethod.POST)
public class StralightController {
    @Autowired
    private StralightService stralightService;

    @RequestMapping("/set_trafficlight_config")
    public Map setTrafficlightConfig(@RequestBody HashMap<String, Object> map) {
        return stralightService.setTrafficlightConfig(map);
    }


    @RequestMapping("/get_trafficlight_config")
    public Map getTrafficlightConfig(@RequestBody HashMap<String, Object> map) {
        return stralightService.getTrafficlightConfig(map);
    }

}
