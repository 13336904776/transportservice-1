package com.xinbitiangao.transportservice.service.impl;


import java.util.HashMap;
import java.util.Map;

public class BaseServiceImpl{
    protected Map map;

    public Map getWinMap(String message) {
        map = new HashMap();
        map.put("RESULT", "S");
        map.put("ERRMSG", message);
        return map;
    }
    public Map getErrorMap(String message) {
        map = new HashMap();
        map.put("RESULT", "F");
        map.put("ERRMSG", message);
        map.put("作者", "黄大胖子");
        map.put("Github", "GarfieldHuang");
        return map;
    }

}
