package com.xinbitiangao.transportservice.service.impl;


import com.xinbitiangao.transportservice.dao.*;
import com.xinbitiangao.transportservice.entity.*;
import com.xinbitiangao.transportservice.service.EtcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class EtcServiceImpl extends BaseServiceImpl implements EtcService {

    @Autowired
    private EtctralogDao etctralogDao;

    @Autowired
    private CarfeeDao carfeeDao;

    @Autowired
    private OthersingleDao othersingleDao;

    @Autowired
    private CarchargeDao carchargeDao;
    @Autowired
    private CarblacklistDao carblacklistDao;


    /**
     * 费率设置
     *
     * @param map
     * @return
     */
    @Override
    public Map setEtcRate(HashMap<String, Object> map) {
        try {
            Othersingle feeRate = othersingleDao.findById("FeeRate").get();
            feeRate.setValue((String) map.get("Money"));
            return getWinMap("成功");
        } catch (Exception e) {
            return getErrorMap("失败");
        }
    }


    /**
     * 查询费率
     *
     * @param map
     * @return
     */
    @Override
    public Map getEtcRate(HashMap<String, Object> map) {
        try {
            Othersingle feeRate = othersingleDao.findById("FeeRate").get();
            Map winMap = getWinMap("成功");
            winMap.put("Money", feeRate.getValue());
            return winMap;
        } catch (Exception e) {
            return getErrorMap("失败");
        }
    }


    /**
     * 获取车辆充值记录
     *
     * @param map
     * @return
     */
    @Override
    public Map getCarAccountRecord(HashMap<String, Object> map) {
        try {
//            获取所有数据
            List<Carcharge> all = carchargeDao.findAll();
//             准备数据返回
            Map winMap = getWinMap("成功");
            winMap.put("ROWS_DETAIL", all);
            return winMap;
        } catch (Exception e) {
            return getErrorMap("失败");
        }
    }

    @Override
    public Map getCarAccountFee(HashMap<String, Object> map) {
        try {
//            获取所有数据
            List<Carfee> all = carfeeDao.findAll();
//             准备数据返回
            Map winMap = getWinMap("成功");
            winMap.put("ROWS_DETAIL", all);
            return winMap;
        } catch (Exception e) {
            return getErrorMap("失败");
        }
    }

    @Override
    public Map setCarAccountFee(HashMap<String, Object> map) {
        try {
//           获取传入小车id与money
            Integer carId = (Integer) map.get("CarId");
            Integer money = (Integer) map.get("Money");
//          添加数据
            Carfee carfee = new Carfee();
            carfee.setMoney(money);
            carfee.setCarid(carId);
//          获取当前日期
            String nowDate = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(LocalDateTime.now());
            carfee.setFeetime(nowDate);
//          存储
            carfeeDao.save(carfee);
            return getWinMap("成功");
        } catch (Exception e) {
            return getErrorMap("失败");
        }
    }

    @Override
    public Map getEtcTrafficLog(HashMap<String, Object> map) {
        try {
            Map winMap = getWinMap("成功");
            List<Etctralog> all = etctralogDao.findAll();
            winMap.put("ROWS_DETAIL", all);
            return winMap;
        } catch (Exception e) {
            return getErrorMap("失败");
        }
    }

    @Override
    public Map getEtcBlacklist(HashMap<String, Object> map) {
        try {
//            获取传入用户id
            String username = (String) map.get("UserName");
//            查询对应数据库
            List<Carblacklist> carblacklists = carblacklistDao.findByUsernameEquals(username);
            Map winMap = getWinMap("成功");
            winMap.put("ROWS_DETAIL", carblacklists);
            return winMap;
        } catch (Exception e) {
            return getErrorMap("失败");
        }
    }

    @Override
    public Map setEtcBlacklist(HashMap<String, Object> map) {
        try {

            //            获取传入用户id
            String username = (String) map.get("UserName");
            //        获取传入参数集
            Integer carid = (Integer) map.get("carid");

            String nowDate = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:SS").format(LocalDateTime.now());

            Carblacklist carblacklist = new Carblacklist();
            carblacklist.setCarid(carid);
            carblacklist.setUsername(username);
            carblacklist.setCarDateTime(nowDate);

            carblacklistDao.save(carblacklist);

            return getWinMap("成功");
        } catch (Exception e) {
            return getErrorMap("失败");
        }
    }
}
