package com.xwb.flight.mapper;

import com.xwb.flight.domain.Order;
import org.springframework.stereotype.Repository;

@Repository("orderMapper")
public interface OrderMapper {

    //插入
    public int insertOrder(Order order);
    public Order getOneOrder(String oid);


    public int updateOrderStatusByOidInt(String oid);
}
