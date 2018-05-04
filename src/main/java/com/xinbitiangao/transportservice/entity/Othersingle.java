package com.xinbitiangao.transportservice.entity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Othersingle {
    @Id
    @GeneratedValue
    private String name;
    private String value;
    private String descr;
}
