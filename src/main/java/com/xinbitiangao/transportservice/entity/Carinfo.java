package com.xinbitiangao.transportservice.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
@Data
public class Carinfo {
    @Id
    @GeneratedValue
    private String carnumber;
    private Integer number;
    private String pcardid;
    private String buydate;
    private String carbrand;
    private String cardbrand;

}
