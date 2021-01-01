package com.example.coke.service;

import com.example.coke.dao.SoldDao;
import com.example.coke.enity.sold;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoldService {
    @Autowired
    SoldDao dao;
    //根据卖家id查找sold表内的商品
    public List<sold> getsold(int user_id){
        return dao.getsold(user_id);
    }
    //用户删除售出记录
    public void delete(int sold_id){
        dao.delete(sold_id);
    }
}
