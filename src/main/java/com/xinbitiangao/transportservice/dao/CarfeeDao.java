package com.xinbitiangao.transportservice.dao;

import com.xinbitiangao.transportservice.entity.CarfeeEntity;
import com.xinbitiangao.transportservice.entity.CarinfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarfeeDao extends JpaRepository<CarfeeEntity,Integer> {

}
