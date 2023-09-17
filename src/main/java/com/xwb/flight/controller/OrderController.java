package com.xwb.flight.controller;

import com.xwb.flight.domain.Order;
import com.xwb.flight.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderServiceImpl orderServiceImpl;

    @RequestMapping("/step3")
    public String step3(int fid,int pid,Model model){

        Order order = orderServiceImpl.insertOrder(fid, pid);
        model.addAttribute("order",order);
        return "order/step3";
    }

    @RequestMapping("/pay")
    public String pay(String oid, HttpSession session){
        //根据oid取查询出该订单的所有的信息
        Order order = orderServiceImpl.getOneOrder(oid);
        //把订单的信息保存到session ->jsp
        session.setAttribute("order",order);
        return "order/pay";
    }

    @RequestMapping("/returnurl")
    public String returnurl(HttpServletRequest request){
        String oid = request.getParameter("out_trade_no");
        //根据oid订单的编号修改订单的状态
        int i = orderServiceImpl.updateOrderStatusByOidInt(oid);
        return "order/returnurl";
    }
}
