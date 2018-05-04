package com.xinbitiangao.transportservice.entity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Etctralog {
    @Id
    @GeneratedValue
    private int etlid;
    private Integer carid;
    private String intime;
    private String outtime;
    private Integer money;

}
