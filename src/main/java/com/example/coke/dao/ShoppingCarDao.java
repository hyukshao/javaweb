package com.example.coke.dao;

import com.example.coke.enity.shoppingCar;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShoppingCarDao {
    //将商品加入购物车
    void addGoods(shoppingCar goods);

    //根据商品id查找购物车中的商品
    List<shoppingCar> findGoods(int goods_id);

    //根据当前用户id查找购物车中的商品
    List<shoppingCar> findGoodsByuser(int goods_id);

    //根据购物车表主键car_id删除商品
    void deleteGoods(int car_id);

    //修改购物车表
    void altercar(int goods_id);
}
