package com.xinbitiangao.transportservice.service;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户service
 */
public interface UserService {

    /**
     * 用户登录
     *
     * @param map
     * @return
     */
    Map userLogin(HashMap<String, Object> map);


    /**
     * 获取所有用户信息
     * @param map
     * @return
     */
    Map getAllUserInfo(HashMap<String, Object> map);
}
