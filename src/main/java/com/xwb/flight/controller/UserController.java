package com.xwb.flight.controller;

import com.xwb.flight.domain.UserFt;
import com.xwb.flight.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserServiceImpl userService;
    @RequestMapping("/login")
    public String login(String username,String password){
        UserFt userFt = userService.getUserFtByUsernameAndPassword(username, password);
        if (userFt == null){
            return "redirect:../login.html";
        }else{
            return "index";
        }
    }
}
