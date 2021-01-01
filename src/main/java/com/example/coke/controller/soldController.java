package com.example.coke.controller;

import com.example.coke.enity.sold;
import com.example.coke.service.BuyService;
import com.example.coke.service.SoldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/sold")
public class soldController {

    @Autowired
    SoldService service;
    @RequestMapping("/record")
    public String soldrecord(int user_id, Model model, Principal principal){
        List<sold> soldrecord = service.getsold(user_id);
        model.addAttribute("username",principal.getName());
        model.addAttribute("soldrecord",soldrecord);
        return "出售记录页面";
    }

    @RequestMapping("/delete")
    public String delete(int sold_id,int user_id){
        service.delete(sold_id);
        return "redirect:/sold/record?user_id=" + user_id;
    }
}
