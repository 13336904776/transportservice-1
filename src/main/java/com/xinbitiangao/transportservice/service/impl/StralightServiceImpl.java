package com.xinbitiangao.transportservice.service.impl;


import com.xinbitiangao.transportservice.dao.StralightDao;
import com.xinbitiangao.transportservice.entity.Stralight;
import com.xinbitiangao.transportservice.service.StralightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Service
@Transactional
public class StralightServiceImpl extends BaseServiceImpl implements StralightService {
    @Autowired
    private StralightDao stralightDao;

    @Override
    public Map setTrafficlightConfig(HashMap<String, Object> map) {
        try {

            //        获取对应id的红绿灯编号
            Stralight stralight = stralightDao.findById(((Integer) map.get("TrafficLightId")).longValue()).get();
            //        获取数据封装到红绿灯实体类
            stralight.setRedtime(((Integer) map.get("RedTime")).longValue());
            stralight.setGreentime(((Integer) map.get("GreenTime")).longValue());
            stralight.setYellowtime(((Integer) map.get("YellowTime")).longValue());
            //        存储
            stralightDao.save(stralight);
            return getWinMap("成功");
        } catch (Exception e) {
            return getErrorMap("失败");
        }
    }

    @Override
    public Map getTrafficlightConfig(HashMap<String, Object> map) {
        try {
            //        获取对应id的红绿灯编号
            Stralight stralight = stralightDao.findById(((Integer) map.get("TrafficLightId")).longValue()).get();
            //        存入map集合
            Map winMap = getWinMap("成功");
            winMap.put("RedTime", stralight.getRedtime());
            winMap.put("GreenTime", stralight.getGreentime());
            winMap.put("YellowTime", stralight.getYellowtime());
            return winMap;
        } catch (Exception e) {
            return getErrorMap("失败,注意TrafficLightId 是否正确，TrafficLightId必须是int值不能为字符串");
        }
    }



}
