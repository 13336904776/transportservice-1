package com.xinbitiangao.transportservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sbusinfo {
  @Id
  private long busid;
  private long buscapacity;

  public Sbusinfo() {
  }

  public Sbusinfo(long busid, long buscapacity) {
    this.busid = busid;
    this.buscapacity = buscapacity;
  }

  public long getBusid() {
    return busid;
  }

  public void setBusid(long busid) {
    this.busid = busid;
  }


  public long getBuscapacity() {
    return buscapacity;
  }

  public void setBuscapacity(long buscapacity) {
    this.buscapacity = buscapacity;
  }

}
