package com.xwb.flight.controller;

import com.xwb.flight.domain.UserFt;
import com.xwb.flight.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("system")
public class SystemController {
    @Autowired
    OrderServiceImpl orderService;
    @RequestMapping("/index")
    public String index(HttpSession session, Model model){
        UserFt user = (UserFt) session.getAttribute("user");
        model.addAttribute("user",user);
        return "system/index";
    }

    @RequestMapping("/systemIndex")
    public String systemIndex(HttpSession session, Model model){
        UserFt user = (UserFt) session.getAttribute("user");
int count = orderService.getOrderStatusCountByUsername(user.getUsername());
        model.addAttribute("orderCount",count);
        return "system/system_index";
    }

    @RequestMapping("/exit")
    public String exit(HttpSession session){
        session.removeAttribute("user");
        return "redirect:/";
    }
}
