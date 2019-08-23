package com.sj.service.user.impl;

import com.sj.domain.user.User;

import com.sj.mapper.main.user.UserMapper;
import com.sj.service.user.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 根据用户名称查询对应的用户信息
     * @param userName 用户名称
     * @return
     */
    @Override
    public User findUserByUserName(String userName) {
        return userMapper.selectUser(userName);
    }
}
