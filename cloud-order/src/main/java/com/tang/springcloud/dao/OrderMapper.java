package com.tang.springcloud.dao;

import com.tang.springcloud.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderMapper {
    public Order getOrderById(@Param("id")Long id);
}
