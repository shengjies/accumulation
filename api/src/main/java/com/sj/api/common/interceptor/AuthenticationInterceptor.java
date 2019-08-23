package com.sj.api.common.interceptor;

import com.sj.api.common.annotation.PassToken;
import com.sj.api.common.utils.JwtUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

public class AuthenticationInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if(!(handler instanceof HandlerMethod)){
            return true;
        }
        Method method =((HandlerMethod) handler).getMethod();
        if(method.isAnnotationPresent(PassToken.class)){
            return true;
        }
        String token = request.getHeader("token");
        if(StringUtils.isEmpty(token))
            throw  new Exception("token失效!!");
        String username = JwtUtils.getUsername(token);
        if("ajie".equals(username)){
            return true;
        }
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
