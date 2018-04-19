package com.xinbitiangao.transportservice.service.impl;

import com.xinbitiangao.transportservice.dao.UserDao;
import com.xinbitiangao.transportservice.entity.User;
import com.xinbitiangao.transportservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public Map userLogin(HashMap<String, Object> map) {
        try {
            //        获取传入用户帐号
            User user = userDao.getOne((String) map.get("UserName"));
            //        比对密码
            if (!user.getPassword().equals(map.get("UserPwd"))) {
                throw new Exception();
            }
            //        返回权限
            Map winMap = getWinMap("登录成功");
            winMap.put("UserRole", user.getRole());
            return winMap;
        } catch (Exception e) {
            return getErrorMap("失败");
        }
    }

    @Override
    public Map getAllUserInfo(HashMap<String, Object> map) {
        try {
            //            获取所有用户信息
            List<User> all = userDao.findAll();
            Map winMap = getWinMap("成功");
            winMap.put("ROWS_DETAIL", all);
            return winMap;
        } catch (Exception e) {
            return getErrorMap("失败");
        }
    }
}
