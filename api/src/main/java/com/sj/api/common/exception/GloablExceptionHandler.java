package com.sj.api.common.exception;

import com.sj.common.utils.ResultAjax;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 捕获全局异常
 */
@ControllerAdvice
public class GloablExceptionHandler {

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public ResultAjax handleException(Exception e){
       String msg = e.getMessage();
       if(StringUtils.isEmpty(msg)){
           msg = "系统异常";
       }
       return ResultAjax.error(500,msg);
    }
}
