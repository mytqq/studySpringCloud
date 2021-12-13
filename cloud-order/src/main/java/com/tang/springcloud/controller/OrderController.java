package com.tang.springcloud.controller;

import com.tang.springcloud.entity.CommonResult;
import com.tang.springcloud.entity.Order;
import com.tang.springcloud.entity.User;
import com.tang.springcloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class OrderController {
    @Autowired
    public OrderService orderService;
    @Autowired
    public RestTemplate restTemplate;

    @RequestMapping("/order/{id}")
    public CommonResult getByID(@PathVariable("id") Long id){
        Order order = orderService.getOrderById(id);
        //利用RestTemplate发起请求，获取订单对应的用户
        String url="http://localhost:8002/user/"+order.getUserId();
        System.out.println(url);
        User user=restTemplate.getForObject(url,User.class);
        order.setUser(user);

        if (order!=null){
            System.out.println(order);
            return new CommonResult(200,"查询成功！",order);
        }else {
            return new CommonResult(440,"查询查询失败！");
        }
    }
}
