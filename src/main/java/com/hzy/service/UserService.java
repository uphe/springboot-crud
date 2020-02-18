package com.hzy.service;

import com.hzy.pojo.User;

import java.util.List;

public interface UserService {
    int addUser(User user);
    User queryUserByName(String username);
    List<User> queryAllUser();
}
