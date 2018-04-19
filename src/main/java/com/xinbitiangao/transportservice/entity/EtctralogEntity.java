package com.xinbitiangao.transportservice.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class EtctralogEntity {
    @Id
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EtctralogEntity that = (EtctralogEntity) o;
        return etlid == that.etlid &&
                Objects.equals(carid, that.carid) &&
                Objects.equals(intime, that.intime) &&
                Objects.equals(outtime, that.outtime) &&
                Objects.equals(money, that.money);
    }

    @Override
    public int hashCode() {

        return Objects.hash(etlid, carid, intime, outtime, money);
    }
}
