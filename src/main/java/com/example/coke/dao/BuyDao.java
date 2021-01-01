package com.example.coke.dao;

import com.example.coke.enity.buy;
import com.example.coke.enity.sold;
import com.example.coke.enity.user;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BuyDao {

    //购买商品，将对应商品加入到购买表中
    void bought(buy buy);

    //根据用户id查找购买表里的商品
    List<buy> buygoods(int user_id);

    //购买商品后修改商品表的onsale字段为0（商品下架）
    void takeoff(int id);

    //删除购买记录
    void deletegoods(int buy_id);

    //用户购买成功后将商品信息加入到卖家的售出表中
    void addsold(sold s);

}
