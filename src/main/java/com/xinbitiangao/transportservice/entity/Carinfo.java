package com.xinbitiangao.transportservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Carinfo {
    @Id
    private String carnumber;
    private long number;
    private String pcardid;
    private java.sql.Date buydate;
    private String carbrand;
    private String cardbrand;


    public String getCarnumber() {
        return carnumber;
    }

    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber;
    }


    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }


    public String getPcardid() {
        return pcardid;
    }

    public void setPcardid(String pcardid) {
        this.pcardid = pcardid;
    }


    public java.sql.Date getBuydate() {
        return buydate;
    }

    public void setBuydate(java.sql.Date buydate) {
        this.buydate = buydate;
    }


    public String getCarbrand() {
        return carbrand;
    }

    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand;
    }


    public String getCardbrand() {
        return cardbrand;
    }

    public void setCardbrand(String cardbrand) {
        this.cardbrand = cardbrand;
    }

}
