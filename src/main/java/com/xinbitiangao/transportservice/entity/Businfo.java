package com.xinbitiangao.transportservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Businfo {
    @Id
    @GeneratedValue
    private int busid;
    private int buscapacity;


    public int getBusid() {
        return busid;
    }

    public void setBusid(int busid) {
        this.busid = busid;
    }


    public int getBuscapacity() {
        return buscapacity;
    }

    public void setBuscapacity(int buscapacity) {
        this.buscapacity = buscapacity;
    }


}
