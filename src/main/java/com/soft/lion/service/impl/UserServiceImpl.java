package com.soft.lion.service.impl;

import com.soft.lion.mapper.UserMapper;
import com.soft.lion.model.User;
import com.soft.lion.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAll() throws Exception {
        List<User> list = userMapper.selectAll();
        return list;
    }
}
