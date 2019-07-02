package com.sj.api.project.controller;


import com.sj.api.common.annotation.PassToken;
import com.sj.api.common.utils.JwtUtils;
import com.sj.api.common.utils.ServletUtils;
import com.sj.api.project.domain.User;
import com.sj.common.utils.ResultAjax;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class LoginController {
    /**
     * 登录测试
     * @return
     */
    @PassToken
    @RequestMapping("/login")
    public ResultAjax login() throws Exception{
//        String a =null;
//        if(StringUtils.isEmpty(a)){
//            throw new Exception("操作异常");
//        }
        User u = new User();
        u.setId(1);
        u.setUsername("ajie");
        u.setPassword("123123");
        return ResultAjax.toData(JwtUtils.sign(u.getUsername(),u.getPassword()));
    }
}
