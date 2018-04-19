package com.xinbitiangao.transportservice.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class CarinfoEntity {
    @Id
    private String carnumber;
    private Integer number;
    private String pcardid;
    private Date buydate;
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

    public Date getBuydate() {
        return buydate;
    }

    public void setBuydate(Date buydate) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarinfoEntity that = (CarinfoEntity) o;
        return Objects.equals(carnumber, that.carnumber) &&
                Objects.equals(number, that.number) &&
                Objects.equals(pcardid, that.pcardid) &&
                Objects.equals(buydate, that.buydate) &&
                Objects.equals(carbrand, that.carbrand) &&
                Objects.equals(cardbrand, that.cardbrand);
    }

    @Override
    public int hashCode() {

        return Objects.hash(carnumber, number, pcardid, buydate, carbrand, cardbrand);
    }
}
