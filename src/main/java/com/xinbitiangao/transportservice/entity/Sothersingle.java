package com.xinbitiangao.transportservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sothersingle {
  @Id
  private String name;
  private String value;
  private String descr;


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  public String getDescr() {
    return descr;
  }

  public void setDescr(String descr) {
    this.descr = descr;
  }

}
