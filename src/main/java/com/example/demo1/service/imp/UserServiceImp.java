package com.example.demo1.service.imp;

import com.example.demo1.mapper.UserMapper;
import com.example.demo1.entity.User;
import com.example.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public int insertUser(User user) {
        int m = userMapper.insertUser(user);
        return 0;
    }
}
