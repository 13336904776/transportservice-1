package com.xinbitiangao.transportservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sroadlight {
  @Id
  private long roadlightid;
  private String status;
  private String controlmode;


  public long getRoadlightid() {
    return roadlightid;
  }

  public void setRoadlightid(long roadlightid) {
    this.roadlightid = roadlightid;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public String getControlmode() {
    return controlmode;
  }

  public void setControlmode(String controlmode) {
    this.controlmode = controlmode;
  }

}
