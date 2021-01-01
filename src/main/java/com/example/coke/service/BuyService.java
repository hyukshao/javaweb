package com.example.coke.service;

import com.example.coke.dao.BuyDao;
import com.example.coke.enity.buy;
import com.example.coke.enity.sold;
import com.example.coke.enity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyService {
    @Autowired
    BuyDao dao;
    //购买商品，将对应商品加入到购买表中
    public void bought(buy buy){
        dao.bought(buy);
    }

    //根据用户id查找购买表里的商品
    public List<buy> buygoods(int user_id){
        return dao.buygoods(user_id);
    }

    //购买商品后修改商品表的onsale字段为0（商品下架）
    public void takeoff(int id){
        dao.takeoff(id);
    }

    //删除购买记录
    public void deletegoods(int buy_id){
        dao.deletegoods(buy_id);
    }

    //用户购买成功后将商品信息加入到卖家的售出表中
    public void addsold(sold s){
        dao.addsold(s);
    }

}
