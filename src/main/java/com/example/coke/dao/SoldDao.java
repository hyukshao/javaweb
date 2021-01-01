package com.example.coke.dao;

import com.example.coke.enity.sold;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SoldDao {
    //根据卖家id查找sold表内的商品
    List<sold> getsold(int uer_id);

    //用户删除售出记录
    void delete(int sold_id);
}
