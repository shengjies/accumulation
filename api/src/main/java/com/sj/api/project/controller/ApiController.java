package com.sj.api.project.controller;

import com.sj.api.common.annotation.PassToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApiController {

    @PassToken
    @RequestMapping("/api")
    public String api(){
        return "api";
    }
}
