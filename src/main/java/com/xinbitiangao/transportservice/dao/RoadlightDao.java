package com.xinbitiangao.transportservice.dao;

import com.xinbitiangao.transportservice.entity.RoadlightEntity;
import com.xinbitiangao.transportservice.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoadlightDao extends JpaRepository<RoadlightEntity,Integer> {

}
