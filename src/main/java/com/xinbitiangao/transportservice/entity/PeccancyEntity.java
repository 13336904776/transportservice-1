package com.xinbitiangao.transportservice.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class PeccancyEntity {

    @Id
    private int id;
    private String carnumber;
    private String pcode;
    private String pdatetime;
    private String paddr;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarnumber() {
        return carnumber;
    }

    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber;
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public String getPdatetime() {
        return pdatetime;
    }

    public void setPdatetime(String pdatetime) {
        this.pdatetime = pdatetime;
    }

    public String getPaddr() {
        return paddr;
    }

    public void setPaddr(String paddr) {
        this.paddr = paddr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PeccancyEntity that = (PeccancyEntity) o;
        return id == that.id &&
                Objects.equals(carnumber, that.carnumber) &&
                Objects.equals(pcode, that.pcode) &&
                Objects.equals(pdatetime, that.pdatetime) &&
                Objects.equals(paddr, that.paddr);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, carnumber, pcode, pdatetime, paddr);
    }
}
