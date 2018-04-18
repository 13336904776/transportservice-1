package com.xinbitiangao.transportservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Scarcharge {
  @Id
  private long ccid;
  private long money;
  private java.sql.Timestamp chargetime;
  private long carid;


  public long getCcid() {
    return ccid;
  }

  public void setCcid(long ccid) {
    this.ccid = ccid;
  }


  public long getMoney() {
    return money;
  }

  public void setMoney(long money) {
    this.money = money;
  }


  public java.sql.Timestamp getChargetime() {
    return chargetime;
  }

  public void setChargetime(java.sql.Timestamp chargetime) {
    this.chargetime = chargetime;
  }


  public long getCarid() {
    return carid;
  }

  public void setCarid(long carid) {
    this.carid = carid;
  }

}
