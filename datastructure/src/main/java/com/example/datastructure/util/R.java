package com.example.datastructure.util;

/**
 * 公共响应类
 * @param <T>
 */
public class R<T> {

    private static final int CODE_SUCCESS = 200;
    private static final int CODE_FAIL = 500;
    private static final int CODE_ERROR = 500;
    private static final int CODE_NO_LOGIN = 300;
    private int code;
    private String msg;
    private T data;

    public R(int code, String msg, T data) {
        this.setCode(code);
        this.setMsg(msg);
        this.setData(data);
    }

    public static <T> R<T> success() {
        return new R<>(CODE_SUCCESS, "success", null);
    }
    public static <T> R<T> success(String message) {
        return new R<>(CODE_SUCCESS, message, null);
    }
    public static <T> R<T> success(T data) {
        return new R<>(CODE_SUCCESS, "success", data);
    }
    public static <T> R<T> success(String message, T data) {
        return new R<>(CODE_SUCCESS, message, data);
    }

    public static <T> R<T> error() {
        return new R<>(CODE_ERROR, "fail", null);
    }
    public static <T> R<T> error(String message) {
        return new R<>(CODE_ERROR, message, null);
    }
    public static <T> R<T> error(T data) {
        return new R<>(CODE_ERROR, "fail", data);
    }
    public static <T> R<T> error(String message, T data) {
        return new R<>(CODE_ERROR, message, data);
    }

    public static <T> R<T> badrequest() {
        return new R<>(CODE_FAIL, "no identifier arguments", null);
    }
    public static <T> R<T> badrequest(String message) {
        return new R<>(CODE_FAIL, message, null);
    }
    public static <T> R<T> badrequest(T data) {
        return new R<>(CODE_FAIL, "no identifier arguments", data);
    }
    public static <T> R<T> badrequest(String message, T data) {
        return new R<>(CODE_FAIL, message, data);
    }

    public static <T> R<T> noLogin(String message) {
        return new R<>(CODE_NO_LOGIN, message, null);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}