package com.example.coke.service;

import com.example.coke.dao.UserDao;
import com.example.coke.enity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao dao;
    //根据用户id查找用户信息
    public user getUser(int userId){
        return dao.getUser(userId);
    }

    //根据用户名查找用户信息
    public user getUserByName(String username){
        return dao.getUserByName(username);
    }

    //更改用户名
    public void alterUserName(user u){
        dao.alterUserName(u);
    }
}
