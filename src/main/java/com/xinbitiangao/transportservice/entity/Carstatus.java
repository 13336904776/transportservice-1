package com.xinbitiangao.transportservice.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Carstatus{
    @Id
    @GeneratedValue
    private int carid;
    private String caraction;
    private int balance;

    public void addbalance(Integer money) {
        this.balance+=money;
    }
}
