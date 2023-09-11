package com.xwb.flight.mapper;

import com.xwb.flight.domain.PassengerFt;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("passengerFtMapper")
public interface PassengerFtMapper {
    public List<PassengerFt> select();

    public void del(Integer pid);

    public void insert(PassengerFt passengerFt);
}
