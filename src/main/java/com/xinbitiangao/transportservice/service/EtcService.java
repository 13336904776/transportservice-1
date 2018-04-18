package com.xinbitiangao.transportservice.service;

import java.util.HashMap;
import java.util.Map;

/**
 * Etc service
 */
public interface EtcService {

    /**
     * 费率设置
     * @param map
     * @return
     */
    Map setEtcRate(HashMap<String, Object> map);

    /**
     * 查询费率
     * @param map
     * @return
     */
    Map getEtcRate(HashMap<String, Object> map);

    /**
     * 获取车辆充值记录
     * @param map
     * @return
     */
    Map getCarAccountRecord(HashMap<String, Object> map);
}
