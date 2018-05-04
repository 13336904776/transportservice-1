package com.xinbitiangao.transportservice.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Roadlight {
    @Id
    @GeneratedValue
    private int roadlightid;
    private String status;
    private String controlmode;
}
