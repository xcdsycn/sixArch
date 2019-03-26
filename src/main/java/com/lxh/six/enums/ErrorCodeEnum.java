package com.lxh.six.enums;

import lombok.Getter;

/**
 * @author yangtao
 */
@Getter
public enum ErrorCodeEnum {
    INPUT_INVALID(400, "输入错误！"),
    NOT_FOUND(404, "资源未找到！"),
    INTERNAL_ERROR(500, "服务器内部异常"),


    ;

    private Integer errorCode;
    private String message;

    ErrorCodeEnum(Integer errorCode, String message) {
        this.message = message;
        this.errorCode = errorCode;
    }
}
