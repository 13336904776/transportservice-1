package com.xinbitiangao.transportservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tralight {
    @Id
    @GeneratedValue
    private int trafficlightid;
    private String status;
    private Integer redtime;
    private Integer greentime;
    private Integer yellowtime;
    private Integer time;


    public int getTrafficlightid() {
        return trafficlightid;
    }

    public void setTrafficlightid(int trafficlightid) {
        this.trafficlightid = trafficlightid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getRedtime() {
        return redtime;
    }

    public void setRedtime(Integer redtime) {
        this.redtime = redtime;
    }

    public Integer getGreentime() {
        return greentime;
    }

    public void setGreentime(Integer greentime) {
        this.greentime = greentime;
    }

    public Integer getYellowtime() {
        return yellowtime;
    }

    public void setYellowtime(Integer yellowtime) {
        this.yellowtime = yellowtime;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

}
