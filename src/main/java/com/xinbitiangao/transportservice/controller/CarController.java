package com.xinbitiangao.transportservice.controller;

import com.xinbitiangao.transportservice.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * 车辆相关Controller
 */
@RestController
@RequestMapping(path = "/car", method = RequestMethod.POST)
public class CarController {
    @Autowired
    private CarService carService;


    /**
     * 设置小车动作
     * @param map
     * @return
     */
    @RequestMapping("/setcarmove")
    public Map setCarMove(@RequestBody HashMap<String, Object> map) {
        return carService.setCarMove(map);
    }

    /**
     * 获取小车动作
     * @param map
     * @return
     */
    @RequestMapping("/get_car_move")
    public Map getCarMove(@RequestBody HashMap<String, Object> map) {
        return carService.getCarMove(map);
    }
    /**
     * 获取小车余额
     * @param map
     * @return
     */
    @RequestMapping("/get_car_account_balance")
    public Map getCarAccountBalance(@RequestBody HashMap<String, Object> map) {
        return carService.getCarAccountBalance(map);
    }

    /**
     * 小车账户充值
     * @param map
     * @return
     */
    @RequestMapping("/set_car_account_recharge")
    public Map setCarAccountBalance(@RequestBody HashMap<String, Object> map) {
        return carService.setCarAccountBalance(map);
    }


    /**
     * 车辆违章记录
     * @param map
     * @return
     */
    @RequestMapping("/get_car_peccancy")
    public Map getCarPeccancy(@RequestBody HashMap<String, Object> map) {
        return carService.getCarPeccancy(map);
    }

    /**
     * 查询所有车辆违章记录
     * @param map
     * @return
     */
    @RequestMapping("/get_all_car_peccancy")
    public Map getAllCarPeccancy(@RequestBody HashMap<String, Object> map) {
        return carService.getAllCarPeccancy(map);
    }

    /**
     * 获取所有车辆信息
     * @param map
     * @return
     */
    @RequestMapping("/get_car_info")
    public Map getCarInfo(@RequestBody HashMap<String, Object> map) {
        return carService.getCarInfo(map);
    }


    /**
     * 违章代码
     * @param map
     * @return
     */
    @RequestMapping("/get_peccancy_type")
    public Map getPeccancyType(@RequestBody HashMap<String, Object> map) {
        return carService.getPeccancyType(map);
    }


}
