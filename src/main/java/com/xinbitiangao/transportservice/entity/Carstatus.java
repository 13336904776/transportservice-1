package com.xinbitiangao.transportservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Carstatus{
    @Id
    @GeneratedValue
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


    public void addbalance(int money) {
        this.balance += money;
    }
}
