package com.xinbitiangao.transportservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Scarblacklist {
  @Id
  private long cbid;
  private long carid;
  private java.sql.Timestamp datetime;
  private String username;


  public long getCbid() {
    return cbid;
  }

  public void setCbid(long cbid) {
    this.cbid = cbid;
  }


  public long getCarid() {
    return carid;
  }

  public void setCarid(long carid) {
    this.carid = carid;
  }


  public java.sql.Timestamp getDatetime() {
    return datetime;
  }

  public void setDatetime(java.sql.Timestamp datetime) {
    this.datetime = datetime;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

}
