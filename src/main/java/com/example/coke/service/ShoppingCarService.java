package com.example.coke.service;

import com.example.coke.dao.ShoppingCarDao;
import com.example.coke.enity.shoppingCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCarService {
    @Autowired
    ShoppingCarDao dao;

    public void addGoods(shoppingCar goods){
        dao.addGoods(goods);
    }

    public List<shoppingCar> findGoods(int goods_id){
        return dao.findGoods(goods_id);
    }
    public List<shoppingCar> findGoodsByuser(int goods_id){
        return dao.findGoodsByuser(goods_id);
    }

    //根据购物车表主键car_id删除商品
    public void deleteGoods(int car_id){
        dao.deleteGoods(car_id);
    };

    public void altercar(int goods_id){
        dao.altercar(goods_id);
    }
}
