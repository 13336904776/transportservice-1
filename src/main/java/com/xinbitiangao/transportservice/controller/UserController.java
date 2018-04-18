package com.xinbitiangao.transportservice.controller;

import com.xinbitiangao.transportservice.service.CarService;
import com.xinbitiangao.transportservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 用户相关
 */
@RestController
@RequestMapping(value = "/api/v2", method = RequestMethod.POST)
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 用户登录
     * @param map
     * @return
     */
    @RequestMapping("/user_login")
    public Map userLogin(@RequestBody HashMap<String, Object> map) {
        return userService.userLogin(map);
    }




    /**
     * 获取所有用户信息
     * @param map
     * @return
     */
    @RequestMapping("/get_all_user_info")
    public Map getAllUserInfo(@RequestBody HashMap<String, Object> map) {
        return userService.getAllUserInfo(map);
    }

}
