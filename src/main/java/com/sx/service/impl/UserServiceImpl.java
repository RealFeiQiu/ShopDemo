package com.sx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sx.dao.UserMapper;
import com.sx.pojo.User;
import com.sx.service.UserService;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    /**
     * 获取信息
     */
    @Override
    public User getByTel(String telephone) {
        // TODO Auto-generated method stub
        return userMapper.getByTel(telephone);
    }

}
