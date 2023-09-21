package com.xwb.flight.mapper;

import com.xwb.flight.domain.UserFt;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    public UserFt getUserFtByUsernameAndPassword(@Param("username") String username, @Param("password") String password);
}
