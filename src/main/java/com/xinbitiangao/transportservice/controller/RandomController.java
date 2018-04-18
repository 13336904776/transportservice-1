package com.xinbitiangao.transportservice.controller;

import com.xinbitiangao.transportservice.entity.Sbusinfo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 返回随机数的类Controller
 */
@RestController
@RequestMapping(value = "/api/v2", method = RequestMethod.POST)
public class RandomController {
    private Map fanhui;
    Random random = new Random();

    /**
     * 公交车载人数查询
     *
     * @param map
     * @return
     */
    @RequestMapping("/get_bus_capacity")
    public Map getBusCapacity(@RequestBody HashMap<String, Object> map) {
        fanhui = getWinMap();
        fanhui.put("BusCapacity", random.nextInt(50));
        return fanhui;
    }

    /**
     * 道路状态查询
     *
     * @param map
     * @return
     */
    @RequestMapping("/get_road_status")
    public Map getRoadStatus(@RequestBody HashMap<String, Object> map) {
        fanhui = getWinMap();
        fanhui.put("Status", random.nextInt(5) + 1);
        return fanhui;
    }

    /**
     * 站台信息查询
     *
     * @param map
     * @return
     */
    @RequestMapping("/get_bus_station_info")
    public Map getBusStationInfo(@RequestBody HashMap<String, Object> map) {
        fanhui = getWinMap();
        ArrayList<Sbusinfo> ROWS_DETAIL = new ArrayList();
        for (int i = 0; i < 12; i++) {
           ROWS_DETAIL.add(new Sbusinfo(i+1,random.nextInt(20000))) ;
        }
        fanhui.put("ROWS_DETAIL",ROWS_DETAIL);
        return fanhui;
    }


    private Map getWinMap() {
        fanhui = new HashMap();
        fanhui.put("RESULT", "S");
        fanhui.put("ERRMSG", "成功");
        return fanhui;
    }
}
