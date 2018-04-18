package com.xinbitiangao.transportservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Stralight {
  @Id
  private long trafficlightid;
  private String status;
  private long redtime;
  private long greentime;
  private long yellowtime;
  private long time;


  public long getTrafficlightid() {
    return trafficlightid;
  }

  public void setTrafficlightid(long trafficlightid) {
    this.trafficlightid = trafficlightid;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public long getRedtime() {
    return redtime;
  }

  public void setRedtime(long redtime) {
    this.redtime = redtime;
  }


  public long getGreentime() {
    return greentime;
  }

  public void setGreentime(long greentime) {
    this.greentime = greentime;
  }


  public long getYellowtime() {
    return yellowtime;
  }

  public void setYellowtime(long yellowtime) {
    this.yellowtime = yellowtime;
  }


  public long getTime() {
    return time;
  }

  public void setTime(long time) {
    this.time = time;
  }

}
