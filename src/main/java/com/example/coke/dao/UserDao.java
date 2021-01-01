package com.example.coke.dao;

import com.example.coke.enity.user;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    //根据用户id查找用户信息
    user getUser(int userId);

    //根据用户名查找用户信息
    user getUserByName(String username);

    //更改用户名
    void alterUserName(user u);

    //用户注册
    void registration(user u);
}
