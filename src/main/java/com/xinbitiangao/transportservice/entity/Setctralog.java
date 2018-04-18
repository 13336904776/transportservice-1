package com.xinbitiangao.transportservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Setctralog {
  @Id
  private long etlid;
  private long carid;
  private java.sql.Timestamp intime;
  private java.sql.Timestamp outtime;
  private long money;


  public long getEtlid() {
    return etlid;
  }

  public void setEtlid(long etlid) {
    this.etlid = etlid;
  }


  public long getCarid() {
    return carid;
  }

  public void setCarid(long carid) {
    this.carid = carid;
  }


  public java.sql.Timestamp getIntime() {
    return intime;
  }

  public void setIntime(java.sql.Timestamp intime) {
    this.intime = intime;
  }


  public java.sql.Timestamp getOuttime() {
    return outtime;
  }

  public void setOuttime(java.sql.Timestamp outtime) {
    this.outtime = outtime;
  }


  public long getMoney() {
    return money;
  }

  public void setMoney(long money) {
    this.money = money;
  }

}
