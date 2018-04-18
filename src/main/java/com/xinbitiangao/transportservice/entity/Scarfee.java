package com.xinbitiangao.transportservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Scarfee {
  @Id
  private long cfid;
  private long carid;
  private java.sql.Timestamp feetime;
  private long money;


  public long getCfid() {
    return cfid;
  }

  public void setCfid(long cfid) {
    this.cfid = cfid;
  }


  public long getCarid() {
    return carid;
  }

  public void setCarid(long carid) {
    this.carid = carid;
  }


  public java.sql.Timestamp getFeetime() {
    return feetime;
  }

  public void setFeetime(java.sql.Timestamp feetime) {
    this.feetime = feetime;
  }


  public long getMoney() {
    return money;
  }

  public void setMoney(long money) {
    this.money = money;
  }

}
