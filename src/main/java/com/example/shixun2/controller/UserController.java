package com.example.shixun2.controller;

import com.example.shixun2.bean.Tuser;
import com.example.shixun2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/login")
    public String login(Tuser tuser) {
        if(userService.login(tuser)){
            return "redirect:index";
        }
        return "redirect:/";
    }
    @RequestMapping("/register")
public String register(Tuser tuser){
        if(userService.register(tuser))
            return "redirect:/";
        return "redirect:/register";
    }
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}