package com.example.coke.controller;

import com.example.coke.dao.UserRepository;
import com.example.coke.enity.buy;
import com.example.coke.enity.goods;
import com.example.coke.enity.shoppingCar;
import com.example.coke.enity.user;
import com.example.coke.service.GoodsService;
import com.example.coke.service.ShoppingCarService;
import com.example.coke.service.UserService;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.xml.crypto.Data;
import java.security.Principal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;
//主页控制器，主页上的操作基本在这里完成
@Controller
@RequestMapping(value = "/zhuye")
public class zhuyeController {
    //导入商品的service层，调用方法实现对应功能
    @Autowired
    GoodsService service;

    @Autowired
    UserRepository userService;
    //显示主页
    @RequestMapping()
    public String zhuye(Principal principal,Model model){
        //Principal方法获取登录后的用户名，用model传到主页.
        model.addAttribute("getUserByName",principal.getName());
        return "主页";
    }


    //提交搜索结果，返回搜索页面
    @PostMapping()
    //@RequestParam查找name属性为InputField的搜索框的输入内容
    public String search(@RequestParam("InputField") String InputField,String searchWords, Model model,Principal principal){
        searchWords = InputField;
        List<goods> search= service.searchGoods(searchWords);//serchWords为GoodService层的函数，作用是根据商品id查找商品
        model.addAttribute("searchGoods",search);//用model将查找到的商品信息传递给搜索结果页面
        model.addAttribute("username",principal.getName());
        return "搜索结果页面";
    }
    //返回分类页面
    @RequestMapping("/fenlei/{type}")//{type}为参数，对应商品类型
    //@Pathvariable将路径参数type与函数参数type对应起来
    public String fenlei(@PathVariable String type, Model model,Principal principal){
        List<goods> get = service.Type(type);//Type为GoodService层的函数，作用是根据类型查找商品
        model.addAttribute("username",principal.getName());
        model.addAttribute("fenleiGoods",get);//用model将查找到的商品信息传递给分类页面
        return "分类页面";
    }

    //返回分类详细页面(返回搜索详细页面也是这里)，此处和搜索页面实现方法相同，使用GoodService层的方法实现通过商品id查找商品信息
    @RequestMapping("/fenlei/detail")
    public String fenleiDetail(Principal principal,int id, Model model){
        goods get = service.goodsDetail(id).get(0);//因为商品详细页面只对应一个商品，所以List<goods>列表里只有一条数据，下标0
       //将商品信息传递给分类页面或搜索详细页
        model.addAttribute("goodsDetail",get);
        //将商品信息赋值给一个购物车商品对象，用于将商品添加进购物车
        int s = 0;
        if (s ==0){
            shoppingCar goods = new shoppingCar();
            goods.setGoods_id(get.getId());
            goods.setGoods_name(get.getName());
            goods.setOnsale(true);
            goods.setUnit_price(get.getNewPrice());
            goods.setAmount(get.getAmount());
            goods.setPrice(get.getNewPrice()*get.getAmount());
            //根据当前登录用户名获取用户信息，保存到购物车的user_id字段
            user u = userService.findByUsername(principal.getName());
            goods.setUser_id(u.getUser_id());
            goods.setPicture(get.getPicture());
            model.addAttribute("username",principal.getName());
            model.addAttribute("addGoods",goods);//将封装好的购物车商品对象返回到商品详细页做参数
        }
        return "商品详细页面";
    }
}
