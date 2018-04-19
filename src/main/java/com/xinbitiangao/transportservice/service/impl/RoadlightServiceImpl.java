package com.xinbitiangao.transportservice.service.impl;


import com.xinbitiangao.transportservice.dao.OthersingleDao;
import com.xinbitiangao.transportservice.dao.RoadlightDao;
import com.xinbitiangao.transportservice.entity.Othersingle;
import com.xinbitiangao.transportservice.entity.Roadlight;
import com.xinbitiangao.transportservice.service.RoadlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Service
@Transactional
public class RoadlightServiceImpl extends BaseServiceImpl implements RoadlightService {
    @Autowired
    private RoadlightDao roadlightDao;
    @Autowired
    private OthersingleDao othersingleDao;

    /**
     * 设置自动手动控制模式
     *
     * @param map
     * @return
     */
    @Override
    public Map setRoadlightControlMode(HashMap<String, Object> map) {
        try {
            Roadlight one = roadlightDao.getOne(1);
            one.setControlmode((String) map.get("ControlMode"));
            roadlightDao.save(one);
            return getWinMap("成功");
        } catch (Exception e) {
            return getErrorMap("失败");
        }
    }

    /**
     * 查询控制模式
     *
     * @param map
     * @return
     */
    @Override
    public Map getRoadlightControlMode(HashMap<String, Object> map) {
        try {
            Roadlight one = roadlightDao.getOne(1);
            Map winMap = getWinMap("成功");
            winMap.put("ControlMode", one.getControlmode());
            return winMap;
        } catch (Exception e) {
            return getErrorMap("失败");
        }
    }

    /**
     * 手动打开关闭制定路灯
     *
     * @param map
     * @return
     */
    @Override
    public Map setRoadlightStatus(HashMap<String, Object> map) {
        try {
            Roadlight one = roadlightDao.getOne((Integer) map.get("RoadLightId"));
            one.setStatus((String) map.get("Action"));
            roadlightDao.save(one);
            return getWinMap("成功");
        } catch (Exception e) {
            return getErrorMap("失败");
        }
    }

    /**
     * 查询当前路灯状态
     *
     * @param map
     * @return
     */
    @Override
    public Map getRoadlightStatus(HashMap<String, Object> map) {
        try {
            Roadlight one = roadlightDao.getOne((Integer) map.get("RoadLightId"));
            Map winMap = getWinMap("成功");
            winMap.put("Status", one.getStatus());
            return winMap;
        } catch (Exception e) {
            return getErrorMap("失败");
        }
    }

    /**
     * 获取路灯光照阈值
     *
     * @param map
     * @return
     */
    @Override
    public Map getLightValue(HashMap<String, Object> map) {
        try {
            Map winMap = getWinMap("成功");
            Othersingle upper = othersingleDao.findById("Up").get();
            Othersingle lower = othersingleDao.findById("Down").get();
            winMap.put("upper", Integer.valueOf(upper.getValue()));
            winMap.put("lower", Integer.valueOf(lower.getValue()));
            return winMap;
        } catch (Exception e) {
            return getErrorMap("失败");
        }
    }

    /**
     * 设置路灯光照阈值
     *
     * @param map
     * @return
     */
    @Override
    public Map setLightValue(HashMap<String, Object> map) {
        try {
//            传入参数处理一
            Othersingle up = othersingleDao.findById("Up").get();
            up.setValue(map.get("upper").toString());
            othersingleDao.save(up);
//            传入参数处理二
            Othersingle Down = othersingleDao.findById("Down").get();
            Down.setValue(map.get("lower").toString());
            othersingleDao.save(Down);
            return getWinMap("成功");
        } catch (Exception e) {
            return getErrorMap("失败");
        }
    }


}
