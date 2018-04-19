package com.xinbitiangao.transportservice.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class CarblacklistEntity {
    @Id
    private int cbid;
    private Integer carid;
    private String carDateTime;
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
        return carDateTime;
    }

    public void setCarDateTime(String carDateTime) {
        this.carDateTime = carDateTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarblacklistEntity that = (CarblacklistEntity) o;
        return cbid == that.cbid &&
                Objects.equals(carid, that.carid) &&
                Objects.equals(carDateTime, that.carDateTime) &&
                Objects.equals(username, that.username);
    }

    @Override
    public int hashCode() {

        return Objects.hash(cbid, carid, carDateTime, username);
    }
}
