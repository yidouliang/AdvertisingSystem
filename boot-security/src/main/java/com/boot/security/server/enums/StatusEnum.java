package com.boot.security.server.enums;

public enum StatusEnum {

    SUCCESS(200,"成功"),
    FAIL(500,"失败"),
    ;

    private Integer code;

    private String msg;

    StatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
