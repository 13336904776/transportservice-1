package com.xinbitiangao.transportservice.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class CarfeeEntity {

    @Id
    private int cfid;
    private String feetime;
    private Integer money;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarfeeEntity that = (CarfeeEntity) o;
        return cfid == that.cfid &&
                Objects.equals(feetime, that.feetime) &&
                Objects.equals(money, that.money);
    }

    @Override
    public int hashCode() {

        return Objects.hash(cfid, feetime, money);
    }
}
