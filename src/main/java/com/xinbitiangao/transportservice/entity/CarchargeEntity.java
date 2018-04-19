package com.xinbitiangao.transportservice.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class CarchargeEntity {
    @Id
    private int ccid;
    private Integer money;
    private String chargetime;


    public int getCcid() {
        return ccid;
    }

    public void setCcid(int ccid) {
        this.ccid = ccid;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getChargetime() {
        return chargetime;
    }

    public void setChargetime(String chargetime) {
        this.chargetime = chargetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarchargeEntity that = (CarchargeEntity) o;
        return ccid == that.ccid &&
                Objects.equals(money, that.money) &&
                Objects.equals(chargetime, that.chargetime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(ccid, money, chargetime);
    }
}
