package com.xinbitiangao.transportservice.service;

import java.util.HashMap;
import java.util.Map;

/**
 * 设置路灯service
 */
public interface RoadlightService {

    /**
     * 设置自动手动控制模式
     *
     * @param map
     * @return
     */
    Map setRoadlightControlMode(HashMap<String, Object> map);

    /**
     * 查询控制模式
     * @param map
     * @return
     */
    Map getRoadlightControlMode(HashMap<String, Object> map);

    /**
     * 手动打开关闭制定路灯
     * @param map
     * @return
     */
    Map setRoadlightStatus(HashMap<String,Object> map);

    /**
     * 查询当前路灯状态
     * @param map
     * @return
     */
    Map getRoadlightStatus(HashMap<String, Object> map);

    /**
     * 获取路灯光照阈值
     * @param map
     * @return
     */
    Map getLightValue(HashMap<String, Object> map);

    /**
     * 设置路灯光照阈值
     * @param map
     * @return
     */
    Map setLightValue(HashMap<String,Object> map);
}
