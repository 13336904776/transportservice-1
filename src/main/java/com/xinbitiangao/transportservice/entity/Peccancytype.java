package com.xinbitiangao.transportservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Peccancytype {
    @Id
    private String pcode;
    private long pmoney;
    private long pscore;
    private String premarks;


    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }


    public long getPmoney() {
        return pmoney;
    }

    public void setPmoney(long pmoney) {
        this.pmoney = pmoney;
    }


    public long getPscore() {
        return pscore;
    }

    public void setPscore(long pscore) {
        this.pscore = pscore;
    }


    public String getPremarks() {
        return premarks;
    }

    public void setPremarks(String premarks) {
        this.premarks = premarks;
    }

}
