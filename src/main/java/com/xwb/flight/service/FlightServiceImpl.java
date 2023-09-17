package com.xwb.flight.service;

import com.xwb.flight.domain.Flight;
import com.xwb.flight.mapper.FlightMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("FlightService")
public class FlightServiceImpl {

    @Autowired@Qualifier("flightMapper")
    private FlightMapper flightMapper;
    // 查询所有航班的业务
    public List<Flight> select(){
        return flightMapper.select();
    }

    public List<Flight> getFlightByAddressAndTime(Flight flight){
        return flightMapper.getFlightByAddressAndTime(flight);
    }

    public Flight getOneFlightByFid(int fid){
        Flight flight = flightMapper.getOneFlightByFid(fid);
        return flight;
    }
}
