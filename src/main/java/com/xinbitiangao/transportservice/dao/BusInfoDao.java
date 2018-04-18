package com.xinbitiangao.transportservice.dao;

import com.xinbitiangao.transportservice.entity.Sbusinfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusInfoDao extends JpaRepository<Sbusinfo,Long> {

}
