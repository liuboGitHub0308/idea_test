package com.yqdz.service.impl;


import com.yqdz.mapper.UsersMapper;
import com.yqdz.pojo.Users;
import com.yqdz.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public void addUser(Users users) {
    this.usersMapper.insertUser(users);
    }
}
