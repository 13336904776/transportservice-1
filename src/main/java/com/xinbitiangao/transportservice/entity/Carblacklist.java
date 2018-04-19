package com.xinbitiangao.transportservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Carblacklist {
    @Id
    @GeneratedValue
    private int cbid;
    private Integer carid;
    private String cardatetime;
    private String username;


    public int getCbid() {
        return cbid;
    }

    public void setCbid(int cbid) {
        this.cbid = cbid;
    }

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }


    public String getCarDateTime() {
        return cardatetime;
    }

    public void setCarDateTime(String cardatetime) {
        this.cardatetime = cardatetime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
