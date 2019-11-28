package com.yqdz.mapper;

import com.yqdz.pojo.Users;

import java.util.List;

/**
 * @Auther: http://www.yqdz.work
 * @Date: 2019/11/27 0027
 * @Description: 刘博
 * @version: 1.0
 */
public interface UsersMapper {
    void insertUser(Users users);
    List<Users> selectUserAll();
}
