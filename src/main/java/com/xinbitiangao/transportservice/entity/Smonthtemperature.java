package com.xinbitiangao.transportservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Smonthtemperature {
  @Id
  private long month;
  private long mint;
  private long maxt;


  public long getMonth() {
    return month;
  }

  public void setMonth(long month) {
    this.month = month;
  }


  public long getMint() {
    return mint;
  }

  public void setMint(long mint) {
    this.mint = mint;
  }


  public long getMaxt() {
    return maxt;
  }

  public void setMaxt(long maxt) {
    this.maxt = maxt;
  }

}
