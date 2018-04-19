package com.xinbitiangao.transportservice.dao;


import com.xinbitiangao.transportservice.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<UserEntity,String> {

}
