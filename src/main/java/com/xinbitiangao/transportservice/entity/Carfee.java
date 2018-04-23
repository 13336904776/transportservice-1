package com.xinbitiangao.transportservice.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Carfee {

    @Id
    @GeneratedValue
    private int cfid;
    private String feetime;
    private Integer money;
    private Integer carid;

    public int getCfid() {
        return cfid;
    }

    public void setCfid(int cfid) {
        this.cfid = cfid;
    }

    public String getFeetime() {
        return feetime;
    }

    public void setFeetime(String feetime) {
        this.feetime = feetime;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }
}
