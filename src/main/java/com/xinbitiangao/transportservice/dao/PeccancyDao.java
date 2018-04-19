package com.xinbitiangao.transportservice.dao;

import com.xinbitiangao.transportservice.entity.Peccancy;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.*;
import java.util.List;

public interface PeccancyDao extends JpaRepository<Peccancy,Spring> {

    /**
     * 按车牌查违章
     * @param carnumber
     * @return
     */
    List<Peccancy> findByCarnumberEquals(String carnumber);
}
