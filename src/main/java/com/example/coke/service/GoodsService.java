package com.example.coke.service;

import com.example.coke.dao.GoodsDao;
import com.example.coke.enity.goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsService {
    @Autowired
    GoodsDao dao;

    //搜索
    public List<goods> searchGoods(String searchWords){
        return dao.searchGoods(searchWords);
    }

    //分类
    public  List<goods> Type(String type){
        return dao.Type(type);
    }

    //获取商品详细信息
    public List<goods> goodsDetail(int id){
        return dao.goodsDetail(id);
    }

    //添加出售商品
    public void addGoods(goods g){
        dao.addGoods(g);
    }

}
