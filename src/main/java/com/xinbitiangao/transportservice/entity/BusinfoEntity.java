package com.xinbitiangao.transportservice.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class BusinfoEntity {
    @Id
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BusinfoEntity that = (BusinfoEntity) o;
        return busid == that.busid &&
                buscapacity == that.buscapacity;
    }

    @Override
    public int hashCode() {

        return Objects.hash(busid, buscapacity);
    }
}
