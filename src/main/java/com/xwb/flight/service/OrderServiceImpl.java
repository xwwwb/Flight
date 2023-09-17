package com.xwb.flight.service;

import com.xwb.flight.domain.Flight;
import com.xwb.flight.domain.PassengerFt;
import com.xwb.flight.mapper.FlightMapper;
import com.xwb.flight.mapper.OrderMapper;
import com.xwb.flight.mapper.PassengerFtMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.xwb.flight.domain.Order;
import java.util.UUID;

@Service
public class OrderServiceImpl {
    @Qualifier("flightMapper")
    @Autowired
    FlightMapper flightMapper;
    @Qualifier("passengerFtMapper")
    @Autowired
    PassengerFtMapper passengerFtMapper;

    @Autowired
    @Qualifier("orderMapper")
    OrderMapper orderMapper;


    public Order insertOrder(int fid, int pid) {
        Flight flight = flightMapper.getOneFlightByFid(fid);
        PassengerFt passengerFt = passengerFtMapper.getPassengerFtByPid(pid);
        String uuid = UUID.randomUUID().toString().replaceAll("-", "");

        Order order = new Order();
        order.setOid(uuid);
        order.setOrderAmount(flight.getTicketPrice());
        // 之前这里写的pname
        order.setUsername(passengerFt.getUsername());
        order.setFid(fid);
        order.setPid(pid);
        int i = orderMapper.insertOrder(order);
        if(i>0){
            return  orderMapper.getOneOrder(uuid);
        }
        return null;
    }

    public Order getOneOrder(String oid){
        return orderMapper.getOneOrder(oid);
    }

    // 支付成功
    public int updateOrderStatusByOidInt(String oid){
        return orderMapper.updateOrderStatusByOidInt(oid);
    }
}
