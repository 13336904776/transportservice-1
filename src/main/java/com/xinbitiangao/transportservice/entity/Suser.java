package com.xinbitiangao.transportservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Suser {
  @Id
  private String username;
  private String password;
  private String pname;
  private String pcardid;
  private String psex;
  private String ptel;
  private java.sql.Timestamp pregisterdate;
  private String role;
  private String email;


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getPname() {
    return pname;
  }

  public void setPname(String pname) {
    this.pname = pname;
  }


  public String getPcardid() {
    return pcardid;
  }

  public void setPcardid(String pcardid) {
    this.pcardid = pcardid;
  }


  public String getPsex() {
    return psex;
  }

  public void setPsex(String psex) {
    this.psex = psex;
  }


  public String getPtel() {
    return ptel;
  }

  public void setPtel(String ptel) {
    this.ptel = ptel;
  }


  public java.sql.Timestamp getPregisterdate() {
    return pregisterdate;
  }

  public void setPregisterdate(java.sql.Timestamp pregisterdate) {
    this.pregisterdate = pregisterdate;
  }


  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

}
