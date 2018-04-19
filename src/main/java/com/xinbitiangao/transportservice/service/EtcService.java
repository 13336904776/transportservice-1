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


    /**
     * 获取车辆扣费记录
     * @param map
     * @return
     */
    Map getCarAccountFee(HashMap<String, Object> map);


    /**
     * 小车账户扣费
     * @param map
     * @return
     */
    Map setCarAccountFee(HashMap<String, Object> map);


    /**
     * 通行日志查询
     * @param map
     * @return
     */
    Map getEtcTrafficLog(HashMap<String, Object> map);

    /**
     * 获取Etc黑名单下发
     * @param map
     * @return
     */
    Map getEtcBlacklist(HashMap<String, Object> map);

    /**
     * 黑名单下发
     * @param map
     * @return
     */
    Map setEtcBlacklist(HashMap<String, Object> map);
}
