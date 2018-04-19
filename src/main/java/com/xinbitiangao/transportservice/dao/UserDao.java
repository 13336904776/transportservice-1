package com.xinbitiangao.transportservice.dao;


import com.xinbitiangao.transportservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,String> {

}
