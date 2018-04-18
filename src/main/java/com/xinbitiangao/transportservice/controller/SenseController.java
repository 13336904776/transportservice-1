package com.xinbitiangao.transportservice.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 环境天气Controller
 */
@RestController
@RequestMapping(value = "/api/v2", method = RequestMethod.POST)
public class SenseController {
    Random random = new Random();

    @RequestMapping("/get_all_sense")
    public Map getAllSense(@RequestBody HashMap<String, Object> map) {
        Map fanhui = new HashMap();
        try {
            fanhui.put("pm2.5", random.nextInt(600));
            fanhui.put("co2", random.nextInt(10000));
            fanhui.put("LightIntensity", random.nextInt(3000));
            fanhui.put("humidity", random.nextInt(100));
            fanhui.put("temperature", random.nextInt(70) - 20);
            fanhui.put("RESULT", "S");
            fanhui.put("ERRMSG", "成功");
        } catch (Exception e) {
            fanhui.put("RESULT", "F");
            fanhui.put("ERRMSG", "失败");
            fanhui.put("作者", "黄大胖子");
            fanhui.put("Github", "GarfieldHuang");
        }
        return fanhui;
    }

    @RequestMapping("/get_sense_by_name")
    public Map getSenseByName(@RequestBody HashMap<String, Object> map) {
        Map fanhui = new HashMap();
        try {
            switch ((String) map.get("SenseName")) {
                case "pm2.5":
                    fanhui.put("pm2.5", random.nextInt(600));
                    break;
                case "co2":
                    fanhui.put("co2", random.nextInt(10000));
                    break;
                case "LightIntensity":
                    fanhui.put("LightIntensity", random.nextInt(3000));
                    break;
                case "humidity":
                    fanhui.put("humidity", random.nextInt(100));
                    break;
                case "temperature":
                    fanhui.put("temperature", random.nextInt(70) - 20);
                    break;
                default:
                    throw new Exception();
            }
            fanhui.put("RESULT", "S");
            fanhui.put("ERRMSG", "成功");
        } catch (Exception e) {
            fanhui.put("RESULT", "F");
            fanhui.put("ERRMSG", "失败");
            fanhui.put("作者", "黄大胖子");
            fanhui.put("GitHub", "GarfieldHuang");
        }
        return fanhui;
    }


    /**
     * 气象信息查询
     *
     * @param map
     * @return
     */
    @RequestMapping("/get_weather")
    public Map getWeather(@RequestBody HashMap<String, Object> map) {
        Map fanhui = new HashMap();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        ArrayList<Object> ROWS_DETAIL = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
//          日期生成
            HashMap mapHash = new HashMap<>();
            long date = System.currentTimeMillis() + (86400000 * i);
            mapHash.put("WData", simpleDateFormat.format(date));
//          天气生成
//            "temperature":"15~ 24"
//            获取最高温度
            int max = random.nextInt(40)+1;
//            获取最低温度
            int min = random.nextInt(max);
            mapHash.put("temperature", min + "~" + max);
//            放入第一天当前温度
            if (i == 0) {
                int WCurrent = random.nextInt(max - min) + min;
                fanhui.put("WCurrent", WCurrent);
            }
//          添加每天天气情况
            ROWS_DETAIL.add(mapHash);
        }

        fanhui.put("ROWS_DETAIL", ROWS_DETAIL);
        return fanhui;
    }

}
