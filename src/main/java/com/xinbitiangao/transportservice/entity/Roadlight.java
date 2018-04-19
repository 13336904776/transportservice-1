package com.xinbitiangao.transportservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Roadlight {
    @Id
    @GeneratedValue
    private int roadlightid;
    private String status;
    private String controlmode;


    public int getRoadlightid() {
        return roadlightid;
    }

    public void setRoadlightid(int roadlightid) {
        this.roadlightid = roadlightid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getControlmode() {
        return controlmode;
    }

    public void setControlmode(String controlmode) {
        this.controlmode = controlmode;
    }


}
