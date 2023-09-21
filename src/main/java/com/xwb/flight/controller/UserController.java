package com.xwb.flight.controller;

import com.xwb.flight.domain.UserFt;
import com.xwb.flight.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserServiceImpl userService;
    @RequestMapping("/login")
    public String login(String username, String password, HttpSession session, Model model){
        UserFt userFt = userService.getUserFtByUsernameAndPassword(username, password);
        if (userFt == null){
            return "redirect:../login.html";
        }else{
            model.addAttribute("user",userFt);
            session.setAttribute("user",userFt);
            return "index";
        }
    }

    @RequestMapping("/pwd")
    public String pwd(HttpSession session,Model model){
        UserFt user = (UserFt) session.getAttribute("user");
        model.addAttribute("user",user);
        return "system/pwd";
    }
}
