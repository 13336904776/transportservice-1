package com.xinbitiangao.transportservice.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Businfo {
    @Id
    @GeneratedValue
    private int busid;
    private int buscapacity;

}
