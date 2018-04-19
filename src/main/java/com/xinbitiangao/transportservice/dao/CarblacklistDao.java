package com.xinbitiangao.transportservice.dao;


import com.xinbitiangao.transportservice.entity.Carblacklist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarblacklistDao extends JpaRepository<Carblacklist,Integer> {
//        根据username 查询数据
    public List<Carblacklist> findByUsernameEquals(String username);
}
