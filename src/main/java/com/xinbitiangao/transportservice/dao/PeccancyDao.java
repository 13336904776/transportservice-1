package com.xinbitiangao.transportservice.dao;

import com.xinbitiangao.transportservice.entity.PeccancyEntity;
import com.xinbitiangao.transportservice.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.*;
import java.util.List;

public interface PeccancyDao extends JpaRepository<PeccancyEntity,Spring> {

    /**
     * 按车牌查违章
     * @param carnumber
     * @return
     */
    List<PeccancyEntity> findByCarnumberEquals(String carnumber);
}
