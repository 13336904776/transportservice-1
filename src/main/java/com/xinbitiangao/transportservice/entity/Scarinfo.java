package com.xinbitiangao.transportservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 小车信息
 */
@Entity
public class Scarinfo {
    @Id
    private long carid;
    private String caraction;
    private long balance;


    public void addbalance(long Money) {
        this.balance += Money;
    }

    public long getCarid() {
        return carid;
    }

    public void setCarid(long carid) {
        this.carid = carid;
    }


    public String getCaraction() {
        return caraction;
    }

    public void setCaraction(String caraction) {
        this.caraction = caraction;
    }


    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

}
