package com.xinbitiangao.transportservice.service;

import com.xinbitiangao.transportservice.entity.User;

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

    /**
     * 注册用户
     * @param user
     * @return
     */
    Map userRegister(User user);
}
