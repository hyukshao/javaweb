package com.example.coke.dao;

import com.example.coke.enity.goods;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface GoodsDao {

    //根据搜索关键词查找商品
    List<goods> searchGoods(String searchWords);

    //根据搜索类型代号查找商品
    List<goods> Type(String type);

    //根据id查找商品
    List<goods> goodsDetail(int id);

    //添加出售商品
    void addGoods(goods g);
}
