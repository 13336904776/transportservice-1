package com.xinbitiangao.transportservice.controller;

import com.xinbitiangao.transportservice.entity.User;
import com.xinbitiangao.transportservice.service.UserService;
import com.xinbitiangao.transportservice.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户相关
 */
@RestController
@RequestMapping(value = "/api/v2")
public class UserController extends BaseServiceImpl {

    @Autowired
    private UserService userService;


    /**
     * 用户登录
     *
     * @return
     */
    @RequestMapping(value = "/user_login", method = RequestMethod.GET)
    public Map userLoginGet(String UserName, String UserPwd) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("UserName", UserName);
        map.put("UserPwd", UserPwd);
        return userService.userLogin(map);
    }


    /**
     * 用户登录
     *
     * @param map
     * @return
     */
    @RequestMapping(value = "/user_login", method = RequestMethod.POST)
    public Map userLoginPost(@RequestBody HashMap<String, Object> map) {
        return userService.userLogin(map);
    }


    /**
     * 获取所有用户信息
     *
     * @param map
     * @return
     */
    @RequestMapping(value = "/get_all_user_info", method = RequestMethod.POST)
    public Map getAllUserInfo(@RequestBody HashMap<String, Object> map) {
        return userService.getAllUserInfo(map);
    }


    /**
     * 注册用户
     *
     * @return
     */
    @RequestMapping(value = "/user_register", method = RequestMethod.GET)
    public Map userRegister(@Valid User user, BindingResult result) {
        if (result.hasErrors()) {
            Map map = getErrorMap("提交参数错误");
            List<ObjectError> list = result.getAllErrors();
            ArrayList errorlist = new ArrayList();
            for (ObjectError error : list) {
                errorlist.add(error.getDefaultMessage());
            }
            map.put("errors", errorlist);
            return map;
        }
        return userService.userRegister(user);
    }


}
