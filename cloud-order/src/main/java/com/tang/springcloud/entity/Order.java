package com.tang.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order implements Serializable {
    private Long id;
    private Long userId;
    private String name;
    private Long price;
    private Integer num;

    private User user;
}
