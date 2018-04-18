package com.xinbitiangao.transportservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Road {
  @Id
  private long number;
  private String roadname;
  private String f3;
  private String f4;
  private String f5;


  public long getNumber() {
    return number;
  }

  public void setNumber(long number) {
    this.number = number;
  }


  public String getRoadname() {
    return roadname;
  }

  public void setRoadname(String roadname) {
    this.roadname = roadname;
  }


  public String getF3() {
    return f3;
  }

  public void setF3(String f3) {
    this.f3 = f3;
  }


  public String getF4() {
    return f4;
  }

  public void setF4(String f4) {
    this.f4 = f4;
  }


  public String getF5() {
    return f5;
  }

  public void setF5(String f5) {
    this.f5 = f5;
  }

}
