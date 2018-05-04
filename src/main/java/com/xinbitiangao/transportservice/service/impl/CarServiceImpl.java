package com.xinbitiangao.transportservice.service.impl;

import com.xinbitiangao.transportservice.dao.CarinfoDao;
import com.xinbitiangao.transportservice.dao.CarstatusDao;
import com.xinbitiangao.transportservice.dao.PeccancyDao;
import com.xinbitiangao.transportservice.dao.PeccancytypeDao;
import com.xinbitiangao.transportservice.entity.Carinfo;
import com.xinbitiangao.transportservice.entity.Carstatus;
import com.xinbitiangao.transportservice.entity.Peccancy;
import com.xinbitiangao.transportservice.entity.Peccancytype;
import com.xinbitiangao.transportservice.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class CarServiceImpl extends BaseServiceImpl implements CarService {

    @Autowired
    private CarinfoDao carinfoDao;
    @Autowired
    private PeccancyDao peccancyDao;
    @Autowired
    private PeccancytypeDao peccancyTypeDao;
    @Autowired
    private CarstatusDao carstatusDao;

    /**
     * 设置小车动作
     *
     * @param map
     * @return
     */
    @Override
    public Map setCarMove(HashMap<String, Object> map) {
        try {
            Integer carId = (Integer) map.get("CarId");
            Carstatus carstatus = carstatusDao.getOne(carId);
            carstatus.setCaraction((String) map.get("CarAction"));
            carstatusDao.save(carstatus);
            return getWinMap("成功");
        } catch (Exception e) {
            return getErrorMap("失败");
        }
    }

    /**
     * 获取小车动作
     *
     * @param map
     * @return
     */
    @Override
    public Map getCarMove(HashMap<String, Object> map) {
        try {
            Integer carId = (Integer) map.get("CarId");
            Map winMap = getWinMap("成功");
            winMap.put("CarAction", carstatusDao.findById(carId).get().getCaraction());
            return winMap;
        } catch (Exception e) {
            return getErrorMap("失败");
        }
    }

    /**
     * 获取小车余额
     *
     * @param map
     * @return
     */
    @Override
    public Map getCarAccountBalance(HashMap<String, Object> map) {
        try {
            Integer carId = (Integer) map.get("CarId");
            Map winMap = getWinMap("成功");
            winMap.put("Balance", carstatusDao.findById(carId).get().getBalance());
            return winMap;
        } catch (Exception e) {
            return getErrorMap("失败");
        }
    }

    /**
     * 小车账户充值
     *
     * @param map
     * @return
     */
    @Override
    public Map setCarAccountBalance(HashMap<String, Object> map) {
        try {
            //            取小车id值
            Integer carId = (Integer) map.get("CarId");
            //            取需要充值金额
            Integer money = (Integer) map.get("Money");
            //            取小车对象
            Carstatus carstatus = carstatusDao.findById(carId).get();
            //            修改并存入小车对象
            carstatus.addbalance(money);
            carstatusDao.save(carstatus);
            return getWinMap("成功");
        } catch (Exception e) {
            return getErrorMap("失败");
        }

    }

    /**
     * 获取车辆违章记录
     *
     * @param map
     * @return
     */
    @Override
    public Map getCarPeccancy(HashMap<String, Object> map) {
        try {
            //            准备数据
            String carnumber = (String) map.get("carnumber");
            //           清空字符串所带空格
            carnumber = carnumber.replace(" ", "");
            //            根据车牌获取违章记录
            List<Peccancy> carnumbers = peccancyDao.findByCarnumberEquals(carnumber);
            //           返回消息
            Map winMap = getWinMap("成功");
            winMap.put("ROWS_DETAIL", carnumbers);
            return winMap;
        } catch (Exception e) {
            return getErrorMap("失败");
        }
    }

    /**
     * 查询所有车辆违章记录
     *
     * @param map
     * @return
     */
    @Override
    public Map getAllCarPeccancy(HashMap<String, Object> map) {
        try {
            //           获取所有车辆违章信息
            List<Peccancy> carnumbers = peccancyDao.findAll();
            //           返回消息
            Map winMap = getWinMap("成功");
            winMap.put("ROWS_DETAIL", carnumbers);
            return winMap;
        } catch (Exception e) {
            return getErrorMap("失败");
        }
    }

    /**
     * 获取所有车辆信息
     *
     * @param map
     * @return
     */
    @Override
    public Map getCarInfo(HashMap<String, Object> map) {
        try {
            //          执行查询
            List<Carinfo> all = carinfoDao.findAll();
            Map winMap = getWinMap("成功");
            winMap.put("ROWS_DETAIL", all);
            return winMap;
        } catch (Exception e) {
            return getErrorMap("失败");
        }
    }

    /**
     * 违章代码
     *
     * @param map
     * @return
     */
    @Override
    public Map getPeccancyType(HashMap<String, Object> map) {
        try {
            //          执行查询
            List<Peccancytype> all = peccancyTypeDao.findAll();
            Map winMap = getWinMap("成功");
            winMap.put("ROWS_DETAIL", all);
            return winMap;
        } catch (Exception e) {
            return getErrorMap("失败");
        }
    }
}
