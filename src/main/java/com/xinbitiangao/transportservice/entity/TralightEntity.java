package com.xinbitiangao.transportservice.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class TralightEntity {
    @Id
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TralightEntity that = (TralightEntity) o;
        return trafficlightid == that.trafficlightid &&
                Objects.equals(status, that.status) &&
                Objects.equals(redtime, that.redtime) &&
                Objects.equals(greentime, that.greentime) &&
                Objects.equals(yellowtime, that.yellowtime) &&
                Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {

        return Objects.hash(trafficlightid, status, redtime, greentime, yellowtime, time);
    }
}
