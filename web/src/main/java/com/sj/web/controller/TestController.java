package com.sj.web.controller;

import com.sj.api.common.annotation.PassToken;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @PassToken
    @ResponseBody
    @RequestMapping("/web")
    public String web() throws Exception{
        String a = null;
        if(StringUtils.isEmpty(a)){
            throw new Exception("web模块异常");
        }
        return "我是web模块";
    }

    @PassToken
    @RequestMapping("/web/page")
    public String webPage(){
        return "web";
    }
}
