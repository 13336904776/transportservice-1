package com.xinbitiangao.transportservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Peccancy {
@Id
  private long id;
  private String carnumber;
  private String pcode;
  private java.sql.Timestamp pdatetime;
  private String paddr;


  public long getId() {
    return id;
  }

  public void setId(long id) {
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


  public java.sql.Timestamp getPdatetime() {
    return pdatetime;
  }

  public void setPdatetime(java.sql.Timestamp pdatetime) {
    this.pdatetime = pdatetime;
  }


  public String getPaddr() {
    return paddr;
  }

  public void setPaddr(String paddr) {
    this.paddr = paddr;
  }

}
