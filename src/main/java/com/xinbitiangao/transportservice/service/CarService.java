package com.xinbitiangao.transportservice.service;

import java.util.HashMap;
import java.util.Map;

/**
 * 小车信息service
 */
public interface CarService {
    /**
     * 设置小车动作
     * @param map
     * @return
     */
    Map setCarMove(HashMap<String,Object> map);

    /**
     * 获取小车动作
     * @param map
     * @return
     */
    Map getCarMove(HashMap<String, Object> map);

    /**
     * 获取小车余额
     * @param map
     * @return
     */
    Map getCarAccountBalance(HashMap<String, Object> map);

    /**
     * 小车账户充值
     * @param map
     * @return
     */
    Map setCarAccountBalance(HashMap<String, Object> map);

    /**
     * 车讯车辆违章记录
     * @param map
     * @return
     */
    Map getCarPeccancy(HashMap<String, Object> map);

    /**
     * 查询所有车辆违章记录
     * @param map
     * @return
     */
    Map getAllCarPeccancy(HashMap<String,Object> map);

    /**
     * 获取所有车辆信息
     * @param map
     * @return
     */
    Map getCarInfo(HashMap<String, Object> map);

    /**
     * 违章代码
     * @param map
     * @return
     */
    Map getPeccancyType(HashMap<String,Object> map);
}
