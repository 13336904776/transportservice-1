package com.xinbitiangao.transportservice.entity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Carfee {

    @Id
    @GeneratedValue
    private int cfid;
    private String feetime;
    private Integer money;
    private Integer carid;

}
