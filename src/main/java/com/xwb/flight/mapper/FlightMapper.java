package com.xwb.flight.mapper;

import com.xwb.flight.domain.Flight;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("flightMapper")
public interface FlightMapper {
    public List<Flight> select();

    public List<Flight> getFlightByAddressAndTime(Flight flight);

    public Flight getOneFlightByFid(int fid);
}
