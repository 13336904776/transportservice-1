package com.xinbitiangao.transportservice.service.impl;

import com.xinbitiangao.transportservice.dao.CarinfoDao;
import com.xinbitiangao.transportservice.dao.PeccancyDao;
import com.xinbitiangao.transportservice.dao.PeccancyTypeDao;
import com.xinbitiangao.transportservice.dao.ScarinfoDao;
import com.xinbitiangao.transportservice.entity.Carinfo;
import com.xinbitiangao.transportservice.entity.Peccancy;
import com.xinbitiangao.transportservice.entity.Peccancytype;
import com.xinbitiangao.transportservice.entity.Scarinfo;
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
    private ScarinfoDao scarinfoDao;
    @Autowired
    private PeccancyDao peccancyDao;
    @Autowired
    private PeccancyTypeDao peccancyTypeDao;
    @Autowired
    private CarinfoDao carinfoDao;

    @Override
    public Map setCarMove(HashMap<String, Object> map) {
        try {
            Long carId = ((Integer) map.get("CarId")).longValue();
            Scarinfo scarinfo = scarinfoDao.getOne(carId);
            scarinfo.setCaraction((String) map.get("CarAction"));
            scarinfoDao.save(scarinfo);
            return getWinMap("成功");
        } catch (Exception e) {
            return getErrorMap("失败");
        }
    }

    @Override
    public Map getCarMove(HashMap<String, Object> map) {
        try {
            Long carId = ((Integer) map.get("CarId")).longValue();
            Map winMap = getWinMap("成功");
            winMap.put("CarAction", scarinfoDao.findById(carId).get().getCaraction());
            return winMap;
        } catch (Exception e) {
            return getErrorMap("失败");
        }
    }

    @Override
    public Map getCarAccountBalance(HashMap<String, Object> map) {
        try {
            Long carId = ((Integer) map.get("CarId")).longValue();
            Map winMap = getWinMap("成功");
            winMap.put("Balance", scarinfoDao.findById(carId).get().getBalance());
            return winMap;
        } catch (Exception e) {
            return getErrorMap("失败");
        }
    }

    @Override
    public Map setCarAccountBalance(HashMap<String, Object> map) {
        try {
//            取小车id值
            Long carId = ((Integer) map.get("CarId")).longValue();
//            取需要充值金额
            long money = ((Integer) map.get("Money")).longValue();
//            取小车对象
            Scarinfo scarinfo = scarinfoDao.findById(carId).get();
//            修改并存入小车对象
            scarinfo.addbalance(money);
            scarinfoDao.save(scarinfo);
            return getWinMap("成功");
        } catch (Exception e) {
            return getErrorMap("失败");
        }

    }

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
