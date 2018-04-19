package com.xinbitiangao.transportservice.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class PeccancytypeEntity {
    @Id
    private String pcode;
    private Integer pmoney;
    private Integer pscore;
    private String premarks;

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public Integer getPmoney() {
        return pmoney;
    }

    public void setPmoney(Integer pmoney) {
        this.pmoney = pmoney;
    }

    public Integer getPscore() {
        return pscore;
    }

    public void setPscore(Integer pscore) {
        this.pscore = pscore;
    }

    public String getPremarks() {
        return premarks;
    }

    public void setPremarks(String premarks) {
        this.premarks = premarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PeccancytypeEntity that = (PeccancytypeEntity) o;
        return Objects.equals(pcode, that.pcode) &&
                Objects.equals(pmoney, that.pmoney) &&
                Objects.equals(pscore, that.pscore) &&
                Objects.equals(premarks, that.premarks);
    }

    @Override
    public int hashCode() {

        return Objects.hash(pcode, pmoney, pscore, premarks);
    }
}
