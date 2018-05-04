package com.xinbitiangao.transportservice.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Peccancy {
    @Id
    @GeneratedValue
    private int id;
    private String carnumber;
    private String pcode;
    private String pdatetime;
    private String paddr;
}
