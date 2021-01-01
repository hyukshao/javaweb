package com.example.coke.controller;

import com.example.coke.enity.goods;
import com.example.coke.enity.user;
import com.example.coke.service.GoodsService;
import com.example.coke.service.UserService;
import com.example.coke.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.security.Principal;
import java.util.UUID;


@Controller
@RequestMapping("/sell")
public class SellGoods {
    @Autowired
    UserService userservice;

    @Autowired
    GoodsService goodsservice;

    @RequestMapping("/goods")
    public String add(Principal principal, Model model){
        user u = userservice.getUserByName(principal.getName());
        model.addAttribute("user_id",u.getUser_id());
        return "出售商品页面";
    }
    @PostMapping
    public String addok(@RequestParam("file") MultipartFile alterPhoto,
                        @RequestParam("goods_name") String goods_name,
                        @RequestParam("newPrice") String newPrice,
                        @RequestParam("oldPrice") String oldPrice,
                        @RequestParam("amount") String amount,
                        @RequestParam("commodity_type") String type,
                        Model model, Principal principal
                         ) throws Exception {
        user u = userservice.getUserByName(principal.getName());

        goods g = new goods();
        g.setName(goods_name);
        g.setNewPrice(Double.parseDouble(newPrice));
        g.setOldPrice(Double.parseDouble(oldPrice));
        g.setAmount(Integer.parseInt(amount));
        g.setOnsale(true);
        g.setSellerId(u.getUser_id());
        g.setType(type);
//        添加图片
        String fileName = alterPhoto.getOriginalFilename();//图片名
        // 防止图片名字相同而出现bug，使用 uuid 加密
        String hToken = UUID.randomUUID().toString();
        // 4. 加密后的图片名字：uuid + 图片名字
        String HeadName = hToken + fileName;
        String filePath = "E:\\coke\\coke_springboot（11）\\src\\main\\resources\\static\\picture\\";  // 图片存放的文件夹地址
        String fileAddress = filePath + fileName;
        FileUtil.uploadFile(alterPhoto.getBytes(),filePath,HeadName);
        String photo = "/picture/"+ HeadName;
        g.setPicture(photo);
        goodsservice.addGoods(g);
        return "redirect:/sold/record?user_id=" + u.getUser_id();
    }
}
