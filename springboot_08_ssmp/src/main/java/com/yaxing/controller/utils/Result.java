package com.yaxing.controller.utils;

import lombok.Data;

import java.lang.reflect.Member;

/**
 * @author yx
 * @date 2022/12/3
 */
@Data
public class Result {

    private Boolean success;
    private Object data;
    private String message;

    public Result() {
    }

    public Result(Boolean success) {
        this.success = success;
    }

    public Result(Boolean success, Object data) {
        this.success = success;
        this.data = data;
    }

    public Result(String message) {
        this.success = false;
        this.message = message;
    }

    public Result(Boolean success, Object data, String message) {
        this.success = success;
        this.data = data;
        this.message = message;
    }
}
