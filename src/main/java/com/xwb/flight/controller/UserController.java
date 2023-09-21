package com.xwb.flight.controller;

import com.xwb.flight.domain.UserFt;
import com.xwb.flight.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

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

    @RequestMapping("/updatePwd")
    public void updatePwd(UserFt userFt, String newPwd1, String newPwd2, HttpServletResponse response) throws IOException {

        //获取一个out对象
        PrintWriter out = response.getWriter();
        //1.判断两次密码是否一样
        if (newPwd1.equals(newPwd2)){ //两次密码是一样的
            int i = userService.updatePwdByUsernameAndPwd(userFt.getUsername(), userFt.getPassword(), newPwd1);
            //修改成功：退出登录-》重新的进行登陆
            if (i>0){
                //return "redirect:../login.html";
                //js
                out.print("<script>");
                out.print("if(self != top){ var newWin = window; while (newWin.parent != newWin){ newWin = newWin.parent;} newWin.location.href = '../login.html';}");
                out.print("</script>");
            }else{ //修改失败-》返回到修改密码的页面
                //return "system/pwd";
                out.print("<script>");
                out.print("location.href='../user/pwd';");
                out.print("</script>");
            }
        }else{ //两次密码是不一样的 -> 返回到修改密码的页面
            out.print("<script>");
            out.print("location.href='../user/pwd';");
            out.print("</script>");
        }


    }
}
