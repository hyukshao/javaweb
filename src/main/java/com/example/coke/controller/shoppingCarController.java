package com.example.coke.controller;

import com.example.coke.enity.*;
import com.example.coke.service.BuyService;
import com.example.coke.service.GoodsService;
import com.example.coke.service.ShoppingCarService;
import com.example.coke.service.UserService;
import com.example.coke.util.ResultMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

//购物车控制器
@Controller
@RequestMapping("/shoppingCar")
public class shoppingCarController {
    @Autowired
    ShoppingCarService service;
    @Autowired
    UserService userservice;

    @Autowired
    BuyService buyservice;

    @Autowired
    GoodsService goodsservice;

    @RequestMapping("/add")
    public String addGoods(int goods_id,String goods_name,
                           boolean onsale,double unit_price,int amount,
                           double price,int user_id,String picture){
        shoppingCar goods =new shoppingCar();
        goods.setGoods_id(goods_id);
        goods.setGoods_name(goods_name);
        goods.setOnsale(onsale);
        goods.setUnit_price(unit_price);
        goods.setAmount(amount);
        goods.setPrice(price);
        goods.setUser_id(user_id);
        goods.setPicture(picture);
        //通过商品id查找购物车商品
        List<shoppingCar> i = service.findGoods(goods.getGoods_id());
        //如果商品已经存在该用户的购物车中则不重复加入
        if(i.size() != 0 && i.get(0).getUser_id() == user_id){
            int s = goods.getGoods_id();
            return "redirect:/zhuye/fenlei/detail?id="+s;
        }
        //商品加入购物车
        service.addGoods(goods);
        int s = goods.getGoods_id();
        //加入购物车成功后仍跳转到本页面
        return "redirect:/zhuye/fenlei/detail?id="+s;
    }

    //返回购物车页面
    @RequestMapping("/detail")
    public String getShoopingCar(int userId, Model model){
        List<shoppingCar> goods = service.findGoodsByuser(userId);
        model.addAttribute("goods" , goods);
        return "购物车";
    }

//    //删除购物车商品
    @RequestMapping("/delete")
    public String delete(int car_id,int user_id,Model model){
        service.deleteGoods(car_id);
        return "redirect:/shoppingCar/detail/?userId=" + user_id;
    }

    //购买购物车内商品
    @RequestMapping("/buy")
    public String buy(int car_id,int user_id,int goods_id,String goods_name,
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
            buyservice.bought(b);//将商品加入当前用户的购买表中

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
            buyservice.addsold(soldrecord);//用户购买成功后将商品信息加入到卖家的售出表中
            user getseller = userservice.getUser(getgoods.get(0).getSellerId());//获取卖家
            double addmoney = getseller.getMoney() + price;//购买成功后卖家余额增加
            getseller.setMoney(addmoney);
            userservice.alterUserName(getseller);//将修改了money的卖家信息保存到用户表
            buyservice.takeoff(goods_id);//购买商品后修改商品表的onsale字段为0（商品下架）
            service.deleteGoods(car_id);//将商品移出购物车
            return "redirect:/buy/page?user_id=" + user_id;
        }
        //用户余额小于商品价格，购买失败，停留在本界面
        else{
            return "redirect:/shoppingCar/detail?userId="+user_id;
        }
    }

}
