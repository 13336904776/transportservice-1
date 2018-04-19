package com.xinbitiangao.transportservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Carinfo {
    @Id
    @GeneratedValue
    private String carnumber;
    private Integer number;
    private String pcardid;
    private String buydate;
    private String carbrand;
    private String cardbrand;


    public String getCarnumber() {
        return carnumber;
    }

    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber;
    }


    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getPcardid() {
        return pcardid;
    }

    public void setPcardid(String pcardid) {
        this.pcardid = pcardid;
    }

    public String getBuydate() {
        return buydate;
    }

    public void setBuydate(String buydate) {
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
