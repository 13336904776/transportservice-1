package com.xinbitiangao.transportservice.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Tralight {
    @Id
    @GeneratedValue
    private int trafficlightid;
    private String status;
    private Integer redtime;
    private Integer greentime;
    private Integer yellowtime;
    private Integer time;
}
