package com.tang.springcloud.dao;

import com.tang.springcloud.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public User getUserById(Integer id);
}
