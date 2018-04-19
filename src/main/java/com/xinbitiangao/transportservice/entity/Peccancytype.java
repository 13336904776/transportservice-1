package com.xinbitiangao.transportservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Peccancytype {
    @Id
    @GeneratedValue
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

}
