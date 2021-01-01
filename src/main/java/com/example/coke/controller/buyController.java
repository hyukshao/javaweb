package com.example.coke.controller;

import com.example.coke.enity.*;
import com.example.coke.service.BuyService;
import com.example.coke.service.GoodsService;
import com.example.coke.service.ShoppingCarService;
import com.example.coke.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/buy")
public class buyController {
    @Autowired
    BuyService service;

    @Autowired
    UserService userservice;

    @Autowired
    GoodsService goodsservice;

    @Autowired
    ShoppingCarService carservice;

    @RequestMapping("/page")
    public String bought(int user_id, Model model){
        user u = userservice.getUser(user_id);
        model.addAttribute("username",u.getUsername());
        List<buy> b = service.buygoods(user_id);
        model.addAttribute("buypage",b);
        return"购买记录页面";
    }

    //购买商品
    @RequestMapping("/addgoods")
    public String addbuy(int user_id,int goods_id,String goods_name,
                      double unit_price,int amount,double price,
                     String picture){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String date = df.format(new Date());// new Date()为获取当前系统时间，也可使用当前时间戳
        buy b = new buy();
        b.setUser_id(user_id);
        b.setGoods_id(goods_id);
        b.setGoods_name(goods_name);
        b.setUnit_price(unit_price);
        b.setAmount(amount);
        b.setPrice(price);
        b.setPicture(picture);
        b.setBuydate(date);
        user getbuyuser = userservice.getUser(user_id);//获取购买用户
        //用户余额大于等于商品价格，购买成功
        if(getbuyuser.getMoney() >= price){
            double m = getbuyuser.getMoney() - price;//购买后将用户表中money减少
            getbuyuser.setMoney(m);
            userservice.alterUserName(getbuyuser);//将修改了money的用户信息保存到用户表
            service.bought(b);//将商品加入当前用户的购买表中

            //用户购买成功后将商品信息加入到卖家的售出表中
            List<goods> getgoods = goodsservice.goodsDetail(goods_id);
            sold soldrecord = new sold();
            soldrecord.setUser_id(getgoods.get(0).getSellerId());
            soldrecord.setGoods_id(goods_id);
            soldrecord.setGoods_name(goods_name);
            soldrecord.setUnit_price(unit_price);
            soldrecord.setAmount(amount);
            soldrecord.setPrice(price);
            soldrecord.setPicture(picture);
            soldrecord.setSolddate(date);
            service.addsold(soldrecord);//用户购买成功后将商品信息加入到卖家的售出表中
            user getseller = userservice.getUser(getgoods.get(0).getSellerId());//获取卖家
            double addmoney = getseller.getMoney() + price;//购买成功后卖家余额增加
            getseller.setMoney(addmoney);
            userservice.alterUserName(getseller);//将修改了money的卖家信息保存到用户表
            service.takeoff(goods_id);//购买商品后修改商品表的onsale字段为0（商品下架）
            //如果商品存在购物车中，将购物车中的onsale字段修改为0
            List<shoppingCar> car = carservice.findGoods(goods_id);
            if(car.size()>0){
                carservice.deleteGoods(car.get(0).getCar_id());
            }
            return "redirect:/buy/page?user_id=" + user_id;
        }
        //用户余额小于商品价格，购买失败，停留在本界面
        else{
            return "redirect:/zhuye/fenlei/detail?id=" + goods_id;
        }
    }

    @RequestMapping("/delete")
    public String deletegoods(int buy_id,int user_id){
        service.deletegoods(buy_id);
        return "redirect:/buy/page?user_id="+ user_id;
    }
}
