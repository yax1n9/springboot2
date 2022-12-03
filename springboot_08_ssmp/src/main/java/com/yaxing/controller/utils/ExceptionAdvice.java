package com.yaxing.controller.utils;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author yx
 * @date 2022/12/3
 */
@RestControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler
    public Result doExceptionHandler(Exception e) {
        // 出现异常的处理函数
        // 数据层，业务层的异常最终都会抛到表现层，在表现层捕获异常并返回一个Result格式的结果
        e.printStackTrace(); // 在控制台打印异常信息
        return new Result("系统错误，请稍后再试！");
    }
}
