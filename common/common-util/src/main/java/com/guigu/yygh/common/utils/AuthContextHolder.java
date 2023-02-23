package com.guigu.yygh.common.utils;

import com.guigu.yygh.common.helper.JwtHelper;

import javax.servlet.http.HttpServletRequest;

//获取当前用户信息工具类
public class AuthContextHolder {
    //获取当前用户id
    public static  Long getUserId(HttpServletRequest request){
        //从header获取token
        String token = request.getHeader("token");
        //jwt从 token获取userId
        Long userId = JwtHelper.getUserId(token);
        return userId;
    }

    //获取当前用户名
    public static String getUserName(HttpServletRequest request){
        String token = request.getHeader("token");
        String userName = JwtHelper.getUserName(token);
        return userName;
    }
}
