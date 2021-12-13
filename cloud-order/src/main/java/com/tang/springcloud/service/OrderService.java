package com.tang.springcloud.service;

import com.tang.springcloud.entity.Order;
import org.apache.ibatis.annotations.Param;

public interface OrderService {
    Order getOrderById(@Param("id") Long id);
}
