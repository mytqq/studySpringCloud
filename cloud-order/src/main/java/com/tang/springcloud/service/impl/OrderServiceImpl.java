package com.tang.springcloud.service.impl;

import com.tang.springcloud.dao.OrderMapper;
import com.tang.springcloud.entity.Order;
import com.tang.springcloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
    //java自己写的可以用这个注解注入
    @Autowired
    public OrderMapper orderMapper;

    /*@Autowired
    public RestTemplate restTemplate;*/

    @Override
    public Order getOrderById(Long id) {
        return orderMapper.getOrderById(id);
    }
}
