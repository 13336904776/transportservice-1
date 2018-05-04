package com.xinbitiangao.transportservice.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue
    private String username;
    private String password;
    private String pname;
    private String pcardid;
    private String psex;
    private String ptel;
    private String pregisterdate;
    private String role;
    private String email;
}
