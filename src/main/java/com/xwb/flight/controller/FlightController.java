package com.xwb.flight.controller;

import com.xwb.flight.domain.Flight;
import com.xwb.flight.service.FlightServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/flight")
public class FlightController {
    // 注入业务
    @Autowired@Qualifier("FlightService")

    private FlightServiceImpl flightService;
    // 查询所有的航班
    @RequestMapping("/list")
    public String list(Model model){
        List<Flight> flights = flightService.select();

        model.addAttribute("list",flights);
        return "flight/list";
    }
}
