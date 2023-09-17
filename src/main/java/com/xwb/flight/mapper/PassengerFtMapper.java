package com.xwb.flight.mapper;

import com.xwb.flight.domain.PassengerFt;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("passengerFtMapper")
public interface PassengerFtMapper {
    public List<PassengerFt> select();

    public void del(Integer pid);

    public void insert(PassengerFt passengerFt);

    public List<PassengerFt> getPassByNameOrPhone(@Param("pname") String pname, @Param("phone") String phone);
    public List<PassengerFt> getPassengerFtByUsername(String username);
}
