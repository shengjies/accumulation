package com.sj.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {


    @ResponseBody
    @RequestMapping("/web")
    public String web() throws Exception{
        return "我是web模块";
    }


    @RequestMapping("/web/page")
    public String webPage(){
        return "web";
    }
}
