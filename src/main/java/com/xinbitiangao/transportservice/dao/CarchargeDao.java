package com.xinbitiangao.transportservice.dao;

import com.xinbitiangao.transportservice.entity.CarchargeEntity;
import com.xinbitiangao.transportservice.entity.CarinfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarchargeDao extends JpaRepository<CarchargeEntity,Integer> {

}
