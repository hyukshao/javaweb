package com.example.coke.controller;

import com.example.coke.enity.user;
import com.example.coke.service.UserService;
import com.example.coke.util.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.security.Principal;
import java.util.UUID;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;
//用户控制器，关于用户的操作基本在这里完成
@Controller
@RequestMapping(value = "/user")
public class userController {
    @Autowired
    UserService service;


    @RequestMapping("/person")
    //用username查找用户信息，返回个人页面（username为参数）
    public String person(String username,Model model){
        user get = service.getUserByName(username);
        model.addAttribute("getUser",get);
        return "个人页面";
    }

    //根据用户id查找用户信息，返回用户详细页面
    @GetMapping(value = "/detail")
    public String getUser(int userId, Model model, Principal principal){
        model.addAttribute("username",principal.getName());
          user get = service.getUser(userId);
          model.addAttribute("getUser",get);
        return "个人详细页面";
    }

    //根据用户id查找用户信息，返回信息修改页面
    @GetMapping("/alter")
    public String alter(int id, Model model){
        user get = service.getUser(id);
        model.addAttribute("getUser",get);
        return "信息修改页面";
    }

    @PostMapping("/alter2")
    public String alter2(int id, Model model,@RequestParam("file") MultipartFile alterPhoto) throws Exception {
        user get = service.getUser(id);
        String fileName = alterPhoto.getOriginalFilename();//图片名
        // 防止图片名字相同而出现bug，使用 uuid 加密
        String hToken = UUID.randomUUID().toString();
        // 4. 加密后的图片名字：uuid + 图片名字
        String HeadName = hToken + fileName;
        String filePath = "E:\\coke\\coke_springboot（11）\\src\\main\\resources\\static\\picture\\";  // 图片存放的文件夹地址
        String fileAddress = filePath + fileName;
        FileUtil.uploadFile(alterPhoto.getBytes(),filePath,HeadName);
        get.setPhoto(HeadName);
        service.alterUserName(get);//更改信息
        model.addAttribute("getUser",get);
        return "redirect:/user/alter?id=" + get.getUser_id();
    }

    //修改信息点击确认后返回到个人详细页面
    @PostMapping(value = "/detail2")
    public String getUser2(int userId,
                           @RequestParam("alterUserName") String alterUserName,
                           @RequestParam("alterUserAddress") String alterUserAddress,
                           @RequestParam("alterUserNumber") String alterUserNumber,
                           @RequestParam("alterQuestion") String alterQuestion,
                           @RequestParam("alterAnswer") String alterAnswer,Model model,
                           user u) throws Exception {
        //@RequestParam用于接收修改信息页面填入文本框的数据
        //u存储修改前的信息
        u = service.getUser(userId);
        //判断是否修改了信息，修改了则信息则存入u中
        if(alterUserName != ""){
            u.setUsername(alterUserName);
        }
        if(alterUserAddress != ""){
            u.setAddress(alterUserAddress);
        }
        if(alterUserNumber != ""){
            u.setUser_number(alterUserNumber);
        }
        if(alterQuestion != ""){
            u.setQuestion(alterQuestion);
        }
        if(alterAnswer != ""){
            u.setAnswer(alterAnswer);
        }
//        String fileName = alterPhoto.getOriginalFilename();//图片名
//        // 防止图片名字相同而出现bug，使用 uuid 加密
//        String hToken = UUID.randomUUID().toString();
//        // 4. 加密后的图片名字：uuid + 图片名字
//        String HeadName = hToken + fileName;
//        String filePath = "E:\\photo\\";  // 图片存放的文件夹地址
//        String fileAddress = filePath + fileName;
//        FileUtil.uploadFile(alterPhoto.getBytes(),filePath,HeadName);
//        u.setPhoto(fileAddress);

        service.alterUserName(u);//更改信息
        user get = service.getUser(userId);
        model.addAttribute("getUser",get);
        return "个人详细页面";
    }

    //根据用户id查找用户信息，返回卖家信息页面
    @GetMapping(value = "/sellerDetail")
    public String getSeller(int userId,Model model){
        user get = service.getUser(userId);
        model.addAttribute("getUser",get);
        log.print("看这里："+get);
        return "卖家信息页面";
    }
}
