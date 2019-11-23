package com.qunar.qtalk.ss.utils;

/**
 * @author yunhai.hu
 * @date 2017/7/26
 */
public class CustomRuntimeException extends RuntimeException {

    public CustomRuntimeException() {
        super();
    }

    public CustomRuntimeException(String message) {
        super(message);
    }
    public CustomRuntimeException(Throwable cause) {
        super(cause);
    }

    public CustomRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}
