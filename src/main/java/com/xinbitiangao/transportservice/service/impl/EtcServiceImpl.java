package com.xinbitiangao.transportservice.service.impl;


import com.xinbitiangao.transportservice.dao.CarfeeDao;
import com.xinbitiangao.transportservice.dao.EtctralogDao;
import com.xinbitiangao.transportservice.dao.OthersingleDao;
import com.xinbitiangao.transportservice.entity.CarfeeEntity;
import com.xinbitiangao.transportservice.entity.EtctralogEntity;
import com.xinbitiangao.transportservice.entity.OthersingleEntity;
import com.xinbitiangao.transportservice.service.EtcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@Transactional
public class EtcServiceImpl extends BaseServiceImpl implements EtcService {

    @Autowired
    private EtctralogDao etctralogDao;

      @Autowired
    private CarfeeDao carfeeDao;

    @Autowired
    private OthersingleDao othersingleDao;


    /**
     * 费率设置
     * @param map
     * @return
     */
    @Override
    public Map setEtcRate(HashMap<String, Object> map) {
       try {
           OthersingleEntity feeRate = othersingleDao.findById("FeeRate").get();
           feeRate.setValue((String) map.get("Money"));
           return getWinMap("成功");
       }catch (Exception e){
           return getErrorMap("失败");
       }
    }


    /**
     * 查询费率
     * @param map
     * @return
     */
    @Override
    public Map getEtcRate(HashMap<String, Object> map) {
        try {
            OthersingleEntity feeRate = othersingleDao.findById("FeeRate").get();
            Map winMap = getWinMap("成功");
          winMap.put("Money",feeRate.getValue());
            return winMap;
        }catch (Exception e){
            return getErrorMap("失败");
        }
    }


    /**
     * 获取车辆充值记录
     * @param map
     * @return
     */
    @Override
    public Map getCarAccountRecord(HashMap<String, Object> map) {
        try {
//            获取所有数据
            List<CarfeeEntity> all = carfeeDao.findAll();
//             准备数据返回
            Map winMap = getWinMap("成功");
            winMap.put("ROWS_DETAIL",all);
            return winMap;
        }catch (Exception e){
            return getErrorMap("失败");
        }
    }


}
