package com.sj.web.controller.user;

import com.sj.domain.user.User;
import com.sj.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("/user")
    public User findUserByUserName(String userName){
        return userService.findUserByUserName("ajie");
    }
}
