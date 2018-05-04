package com.xinbitiangao.transportservice.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Carcharge{
    @Id
    @GeneratedValue
    private int ccid;
    private Integer money;
    private String chargetime;


}
