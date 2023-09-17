package com.xwb.flight.service;

import com.xwb.flight.domain.PassengerFt;
import com.xwb.flight.mapper.PassengerFtMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("passengerFtService")
public class PassengerFtServiceImpl {

    @Autowired@Qualifier("passengerFtMapper")
    private PassengerFtMapper passengerFtMapper;

    public List<PassengerFt> select() {
        return passengerFtMapper.select();
    }

    public void del(Integer pid) {
        passengerFtMapper.del(pid);
    }

    public void save(PassengerFt passengerFt) {
        passengerFtMapper.insert(passengerFt);
    }

    public List<PassengerFt> getPassByNameOrPhone(String pname, String phone) {
        return passengerFtMapper.getPassByNameOrPhone(pname, phone);
    }

    public  List<PassengerFt> getPassengerFtByUsername(String username){
        return  passengerFtMapper.getPassengerFtByUsername(username);
    }
}
