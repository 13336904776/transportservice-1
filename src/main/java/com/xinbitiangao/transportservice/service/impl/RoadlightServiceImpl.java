package com.xinbitiangao.transportservice.service.impl;


import com.xinbitiangao.transportservice.dao.RoadlightDao;
import com.xinbitiangao.transportservice.dao.SothersingleDao;
import com.xinbitiangao.transportservice.entity.Sothersingle;
import com.xinbitiangao.transportservice.entity.Sroadlight;
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
    private SothersingleDao sothersingleDao;


    @Override
    public Map setRoadlightControlMode(HashMap<String, Object> map) {
        try {
            Sroadlight one = roadlightDao.getOne(1L);
            one.setControlmode((String) map.get("ControlMode"));
            roadlightDao.save(one);
            return getWinMap("成功");
        } catch (Exception e) {
            return getErrorMap("失败");
        }
    }

    @Override
    public Map getRoadlightControlMode(HashMap<String, Object> map) {
        try {
            Sroadlight one = roadlightDao.getOne(1L);
            Map winMap = getWinMap("成功");
            winMap.put("ControlMode", one.getControlmode());
            return winMap;
        } catch (Exception e) {
            return getErrorMap("失败");
        }
    }

    @Override
    public Map setRoadlightStatus(HashMap<String, Object> map) {
        try {
            Sroadlight one = roadlightDao.getOne(((Integer) map.get("RoadLightId")).longValue());
            one.setStatus((String) map.get("Action"));
            roadlightDao.save(one);
            return getWinMap("成功");
        } catch (Exception e) {
            return getErrorMap("失败");
        }
    }

    @Override
    public Map getRoadlightStatus(HashMap<String, Object> map) {
        try {
            Sroadlight one = roadlightDao.getOne(((Integer) map.get("RoadLightId")).longValue());
            Map winMap = getWinMap("成功");
            winMap.put("Status", one.getStatus());
            return winMap;
        } catch (Exception e) {
            return getErrorMap("失败");
        }
    }

    @Override
    public Map getLightValue(HashMap<String, Object> map) {
        try {
            Map winMap = getWinMap("成功");
            Sothersingle upper = sothersingleDao.findById("Up").get();
            Sothersingle lower = sothersingleDao.findById("Down").get();
            winMap.put("upper",Integer.valueOf(upper.getValue()));
            winMap.put("lower",Integer.valueOf(lower.getValue()));
            return winMap;
        } catch (Exception e) {
            return getErrorMap("失败");
        }
    }

    @Override
    public Map setLightValue(HashMap<String, Object> map) {
        try {
//            传入参数处理一
            Sothersingle up = sothersingleDao.findById("Up").get();
            up.setValue(map.get("upper").toString());
            sothersingleDao.save(up);
//            传入参数处理二
            Sothersingle Down = sothersingleDao.findById("Down").get();
            Down.setValue(map.get("lower").toString());
            sothersingleDao.save(Down);
            return getWinMap("成功");
        } catch (Exception e) {
            return getErrorMap("失败");
        }
    }


}
