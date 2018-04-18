package com.xinbitiangao.transportservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Srole {
  @Id
  private String role;
  private String rolename;


  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }


  public String getRolename() {
    return rolename;
  }

  public void setRolename(String rolename) {
    this.rolename = rolename;
  }

}
