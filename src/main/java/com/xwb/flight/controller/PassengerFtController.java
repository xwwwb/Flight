package com.xwb.flight.controller;

import com.xwb.flight.domain.PassengerFt;
import com.xwb.flight.domain.UserFt;
import com.xwb.flight.service.PassengerFtServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/passengerFt")
public class PassengerFtController {

    @Autowired@Qualifier("passengerFtService")
    private PassengerFtServiceImpl passengerFtService;
    @RequestMapping("/pindex")
    public String pindex(HttpSession session, Model model){
        UserFt user = (UserFt) session.getAttribute("user");
        model.addAttribute("user",user);
        return "passenger/pindex";
    }

    @RequestMapping("/list")
    public String list(Model model) {
        List<PassengerFt> list = passengerFtService.select();
        model.addAttribute("list", list);
        return "passenger/list";
    }

    @RequestMapping("/del")
    public String del(Integer pid ,Model model ) {
        passengerFtService.del(pid);
        model.addAttribute("msg","删除成功");
        return "passenger/success";
    }

    @RequestMapping("/add")
    public String add(String pname,String cardnum,String phone,Model model){
        PassengerFt passengerFt = new PassengerFt();
        passengerFt.setPname(pname);
        passengerFt.setCardnum(cardnum);
        passengerFt.setPhone(phone);
        passengerFtService.save(passengerFt);
        model.addAttribute("msg","添加成功");
        return "passenger/success";
    }

    @RequestMapping("/toAdd")
    public String toAdd(){
        return "passenger/add";
    }

    @RequestMapping("/getPassByNameOrPhone")
    public String getPassByNameOrPhone(String pname,String phone, Model model) {
        List<PassengerFt> list = passengerFtService.getPassByNameOrPhone(pname, phone);
        model.addAttribute("list", list);
        return "passenger/list";
    }
}
