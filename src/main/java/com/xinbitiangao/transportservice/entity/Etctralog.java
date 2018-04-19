package com.xinbitiangao.transportservice.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Etctralog {
    @Id
    @GeneratedValue
    private int etlid;
    private Integer carid;
    private String intime;
    private String outtime;
    private Integer money;

    public int getEtlid() {
        return etlid;
    }

    public void setEtlid(int etlid) {
        this.etlid = etlid;
    }


    public Integer getCarid() {
        return carid;
    }

    public void setCarid(Integer carid) {
        this.carid = carid;
    }

    public String getIntime() {
        return intime;
    }

    public void setIntime(String intime) {
        this.intime = intime;
    }

    public String getOuttime() {
        return outtime;
    }

    public void setOuttime(String outtime) {
        this.outtime = outtime;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }


}
