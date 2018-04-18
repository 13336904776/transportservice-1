package com.xinbitiangao.transportservice.dao;

import com.xinbitiangao.transportservice.entity.Peccancy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PeccancyDao extends JpaRepository<Peccancy,Long> {
    /**
     * 按照车牌获取车辆违章信息
     * @param carnumber
     * @return
     */
    public List<Peccancy> findByCarnumberEquals(String carnumber);
}
