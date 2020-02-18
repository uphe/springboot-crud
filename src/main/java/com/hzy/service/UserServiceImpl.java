package com.hzy.service;

import com.hzy.mapper.UserMapper;
import com.hzy.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public int addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public User queryUserByName(String username) {
        return userMapper.queryUserByName(username);
    }

    @Override
    public List<User> queryAllUser() {
        return userMapper.queryAllUser();
    }
}
