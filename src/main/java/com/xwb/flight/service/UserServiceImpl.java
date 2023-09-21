package com.xwb.flight.service;

import com.xwb.flight.domain.UserFt;
import com.xwb.flight.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

    @Autowired
    UserMapper userMapper;

    public UserFt getUserFtByUsernameAndPassword(String username, String password){
        return userMapper.getUserFtByUsernameAndPassword(username, password);
    }

    public int updatePwdByUsernameAndPwd(String username,String password,String newPwd){
        return userMapper.updatePwdByUsernameAndPwd(username, password, newPwd);
    }
}