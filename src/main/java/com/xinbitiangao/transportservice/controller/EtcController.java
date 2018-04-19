package com.xinbitiangao.transportservice.controller;

import com.xinbitiangao.transportservice.service.EtcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


/**
 * etc  Controller
 */
@RestController
@RequestMapping(value = "/api/v2", method = RequestMethod.POST)
public class EtcController {
    @Autowired
    private EtcService etcService;


    @RequestMapping("/set_etc_rate")
    public Map setEtcRate(@RequestBody HashMap<String, Object> map) {
        return etcService.setEtcRate(map);
    }

    @RequestMapping("/get_etc_rate")
    public Map getEtcRate(@RequestBody HashMap<String, Object> map) {
        return etcService.getEtcRate(map);
    }

    @RequestMapping("/get_car_account_record")
    public Map getCarAccountRecord(@RequestBody HashMap<String, Object> map) {
        return etcService.getCarAccountRecord(map);
    }

    @RequestMapping("/get_car_account_fee")
    public Map getCarAccountFee(@RequestBody HashMap<String, Object> map) {
        return etcService.getCarAccountFee(map);
    }


    @RequestMapping("/set_car_account_fee")
    public Map setCarAccountFee(@RequestBody HashMap<String, Object> map) {
        return etcService.setCarAccountFee(map);
    }



    @RequestMapping("/get_etc_traffic_log")
    public Map getEtcTrafficLog(@RequestBody HashMap<String, Object> map) {
        return etcService.getEtcTrafficLog(map);
    }




    @RequestMapping("/get_etc_blacklist")
    public Map getEtcBlacklist(@RequestBody HashMap<String, Object> map) {
        return etcService.getEtcBlacklist(map);
    }


    @RequestMapping("/set_etc_blacklist")
    public Map setEtcBlacklist(@RequestBody HashMap<String, Object> map) {
        return etcService.setEtcBlacklist(map);
    }
}
