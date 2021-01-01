package com.example.coke.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/login")
//自定义的登录页面，在SecurityConfig里写入对应路径
public class loginController {
    @GetMapping()
    public String login(){
        return "登录页面";
    }
}

