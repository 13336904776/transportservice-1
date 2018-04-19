package com.xinbitiangao.transportservice.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class CarstatusEntity {
    @Id
    private int carid;
    private String caraction;
    private int balance;


    public int getCarid() {
        return carid;
    }

    public void setCarid(int carid) {
        this.carid = carid;
    }

    public String getCaraction() {
        return caraction;
    }

    public void setCaraction(String caraction) {
        this.caraction = caraction;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarstatusEntity that = (CarstatusEntity) o;
        return carid == that.carid &&
                Objects.equals(caraction, that.caraction) &&
                Objects.equals(balance, that.balance);
    }

    @Override
    public int hashCode() {

        return Objects.hash(carid, caraction, balance);
    }

    public void addbalance(int money) {
        this.balance += money;
    }
}
