package com.sj.api.project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    /**
     * 登录测试
     * @return
     */
    @RequestMapping("/login")
    public String login(){
        return "登录成功";
    }
}
