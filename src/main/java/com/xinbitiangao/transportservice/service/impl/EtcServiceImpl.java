package com.xinbitiangao.transportservice.service.impl;


import com.xinbitiangao.transportservice.dao.SetctralongDao;
import com.xinbitiangao.transportservice.entity.Setctralog;
import com.xinbitiangao.transportservice.service.EtcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class EtcServiceImpl extends BaseServiceImpl implements EtcService {
    @Autowired
    private SetctralongDao setctralongDao;
    //    费率零时变量
    private static int money = 10;

    @Override
    public Map setEtcRate(HashMap<String, Object> map) {
        this.money = (Integer) map.get("Money");
        return getWinMap("成功");
    }

    @Override
    public Map getEtcRate(HashMap<String, Object> map) {
        Map winMap = getWinMap("成功");
        winMap.put("Money", money);
        return winMap;
    }

    @Override
    public Map getCarAccountRecord(HashMap<String, Object> map) {
        try {
//            获取所有数据
            List<Setctralog> all = setctralongDao.findAll();
//             准备数据返回
            Map winMap = getWinMap("成功");
            winMap.put("ROWS_DETAIL",all);
            return winMap;
        }catch (Exception e){
            return getErrorMap("失败");
        }
    }


}
