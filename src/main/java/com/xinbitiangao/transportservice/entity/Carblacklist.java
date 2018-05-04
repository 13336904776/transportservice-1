package com.xinbitiangao.transportservice.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Carblacklist {
    @Id
    @GeneratedValue
    private int cbid;
    private Integer carid;
    private String cardatetime;
    private String username;

}
