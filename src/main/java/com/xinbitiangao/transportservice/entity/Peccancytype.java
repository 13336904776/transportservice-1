package com.xinbitiangao.transportservice.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Peccancytype {
    @Id
    @GeneratedValue
    private String pcode;
    private Integer pmoney;
    private Integer pscore;
    private String premarks;
}
