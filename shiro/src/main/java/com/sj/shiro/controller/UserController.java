package com.sj.shiro.controller;

import com.sj.shiro.domain.User;
import com.sj.shiro.exception.UnauthorizedException;
import com.sj.shiro.service.test1.ITest1UserService;
import com.sj.shiro.service.test2.ITest2UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private ITest1UserService userService;

    @Autowired
    private ITest2UserService test2UserService;

    @RequestMapping("/test1/users")
    public List<User> selectTest1AllUser() {
        return userService.selectTest1AllUser();
    }

    @RequestMapping("/test2/users")
    public List<User> selectTest2AllUser() throws UnauthorizedException {
        throw new UnauthorizedException();
//        return test2UserService.selectTest1AllUser();
    }
}
