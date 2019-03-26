package com.lxh.six.exception;

import com.lxh.six.enums.ErrorCodeEnum;
import lombok.Data;

@Data
public class SixException extends RuntimeException {
    protected int errorCode = -1;
    protected String message;

    public SixException(String message) {
        super(message);
        this.message = message;
    }

    public SixException(int errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
        this.message = message;
    }

    public SixException(ErrorCodeEnum errorCodeEnum) {
        super(errorCodeEnum.getMessage());
        this.errorCode = errorCodeEnum.getErrorCode();
        this.message = errorCodeEnum.getMessage();
    }


    public SixException(int errorCode, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
        this.message = message;
    }

    public SixException(Throwable cause) {
        super(cause);
    }

    @Override
    public Throwable fillInStackTrace() {
        return this;
    }
}
