package com.sj.common.utils;

import java.util.HashMap;

public class ResultAjax extends HashMap<String, Object> {
    private static final int SUCCESS_CODE = 1;
    private static final int ERROR_CODE = 0;

    private static final String SUCCESS_MSG = "操作成功...";
    private static final String ERROR_MSG = "操作失败...";

    public ResultAjax() {
    }

    public static ResultAjax error(int code,String msg){
        ResultAjax ajax = new ResultAjax();
        ajax.put("code", code);
        ajax.put("msg", msg);
        return ajax;
    }

    public static ResultAjax success(String msg) {
        ResultAjax ajax = new ResultAjax();
        ajax.put("code", SUCCESS_CODE);
        ajax.put("msg", msg);
        return ajax;
    }

    public static ResultAjax error(String msg) {
        return error(ERROR_CODE,msg);
    }

    public static ResultAjax success() {
        return success(SUCCESS_MSG);
    }

    public static ResultAjax error() {
        return error(ERROR_MSG);
    }

    public static ResultAjax toData(Object data) {
        ResultAjax ajax = new ResultAjax();
        ajax.put("code", SUCCESS_CODE);
        ajax.put("msg", SUCCESS_MSG);
        ajax.put("data", data);
        return ajax;
    }
}
