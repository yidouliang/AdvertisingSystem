package com.boot.security.server.dto;

import com.boot.security.server.enums.StatusEnum;

public class ResponseData<T>{

    private static final long serialVersionUID = -4417715614021482064L;

    private Integer code;
    private String message;
    private T data;

    public ResponseData(StatusEnum status, T t) {
        this.code = status.getCode();
        this.message = status.getMsg();
        this.data = t;
    }

    public static<T> ResponseData<T> ok(){
        return new ResponseData<>(StatusEnum.SUCCESS,null);
    }

    public static<T> ResponseData<T> success(T t){
        return new ResponseData<>(StatusEnum.SUCCESS,t);
    }

    public static<T> ResponseData<T> fail(T t){
        return new ResponseData<>(StatusEnum.FAIL,t);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
