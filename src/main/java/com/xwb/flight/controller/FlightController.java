package com.xwb.flight.controller;

import com.xwb.flight.domain.Flight;
import com.xwb.flight.domain.PassengerFt;
import com.xwb.flight.service.FlightServiceImpl;
import com.xwb.flight.service.PassengerFtServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.xwb.flight.domain.UserFt;


import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/flight")
public class FlightController {
    // 注入业务
    @Autowired@Qualifier("FlightService")
    private FlightServiceImpl flightService;

    @Autowired
    private PassengerFtServiceImpl passengerFtServiceImpl;


    @RequestMapping("/findex")
    public String findex(HttpSession session, Model model){
        UserFt user = (UserFt) session.getAttribute("user");
        model.addAttribute("user", user);
        return "flight/findex";
    }

    // 查询所有的航班
    @RequestMapping("/list")
    public String list(Model model){
        List<Flight> flights = flightService.select();

        model.addAttribute("list",flights);
        return "flight/list";
    }

    @RequestMapping("/getFlightByAddressAndTime")
    public String getFlightByAddressAndTime(@DateTimeFormat(pattern = "yyyy-MM-dd") Flight flight, Model model){

        List<Flight> flights = flightService.getFlightByAddressAndTime(flight);
        System.out.println(flights);
        model.addAttribute("list",flights);
        return "flight/list";
    }

    @RequestMapping("/step2")
    public String step2(int fid,Model model){
        Flight flight = flightService.getOneFlightByFid(fid);
        List<PassengerFt> list = passengerFtServiceImpl.getPassengerFtByUsername("ls");
        model.addAttribute("ft",flight);
        model.addAttribute("list",list);
        return  "flight/step2";
    }


}
