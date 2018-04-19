package com.xinbitiangao.transportservice.service.impl;


import com.xinbitiangao.transportservice.dao.TralightDao;
import com.xinbitiangao.transportservice.entity.Tralight;
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
    private TralightDao tralightDao;

    /**
     * 设置红绿灯配置信息
     *
     * @param map
     * @return
     */
    @Override
    public Map setTrafficlightConfig(HashMap<String, Object> map) {
        try {

            //        获取对应id的红绿灯编号
            Tralight tralight = tralightDao.findById((Integer) map.get("TrafficLightId")).get();
            //        获取数据封装到红绿灯实体类
            tralight.setRedtime((Integer) map.get("RedTime"));
            tralight.setGreentime((Integer) map.get("GreenTime"));
            tralight.setYellowtime((Integer) map.get("YellowTime"));
            //        存储
            tralightDao.save(tralight);
            return getWinMap("成功");
        } catch (Exception e) {
            return getErrorMap("失败");
        }
    }

    /**
     * 获取红绿灯配置信息
     *
     * @param map
     * @return
     */
    @Override
    public Map getTrafficlightConfig(HashMap<String, Object> map) {
        try {
            //        获取对应id的红绿灯编号
            Tralight tralight = tralightDao.findById((Integer) map.get("TrafficLightId")).get();
            //        存入map集合
            Map winMap = getWinMap("成功");
            winMap.put("RedTime", tralight.getRedtime());
            winMap.put("GreenTime", tralight.getGreentime());
            winMap.put("YellowTime", tralight.getYellowtime());
            return winMap;
        } catch (Exception e) {
            return getErrorMap("失败,注意TrafficLightId 是否正确，TrafficLightId必须是int值不能为字符串");
        }
    }


}
