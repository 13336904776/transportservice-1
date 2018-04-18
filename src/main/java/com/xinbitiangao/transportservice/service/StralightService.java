package com.xinbitiangao.transportservice.service;

import java.util.HashMap;
import java.util.Map;

/**
 * 红绿灯service
 */
public interface StralightService {
    /**
     * 设置红绿灯配置信息
     * @param map
     * @return
     */
    Map setTrafficlightConfig(HashMap<String, Object> map);


    /**
     * 获取红绿灯配置信息
     * @param map
     * @return
     */
    Map getTrafficlightConfig(HashMap<String, Object> map);
}
