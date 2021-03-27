package com.ddm.common;

import org.springframework.http.ResponseEntity;
/**
 * @author Jqy
 */
public class DDMResponse<T> {
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private int code;
    private T data;
    private String message;

    public DDMResponse(DDMResponseCode code, T data) {
        this.message = code.getMsg();
        this.code = code.getCode();
        this.data = data;
    }

    public static <T> ResponseEntity success() {
        return ResponseEntity.status(200).body(new DDMResponse<Void>(DDMResponseCode.SUCCESS, null));
    }

    public static <T> ResponseEntity success(T data) {
        return ResponseEntity.status(200).body(new DDMResponse<T>(DDMResponseCode.SUCCESS, data));
    }

    public static <T> ResponseEntity success(DDMResponseCode code, T data) {
        return ResponseEntity.status(200).body(new DDMResponse<T>(code, data));
    }

    public static <T> ResponseEntity failure(DDMResponseCode code, T data) {
        return ResponseEntity.status(500).body(new DDMResponse<T>(code, data));
    }

    public static <T> ResponseEntity failure(T data) {
        return ResponseEntity.status(500).body(new DDMResponse<T>(DDMResponseCode.INTERNAL_ERROR, data));
    }

    public static <T> ResponseEntity failure() {
        return ResponseEntity.status(500).body(new DDMResponse<Void>(DDMResponseCode.INTERNAL_ERROR, null));
    }
}
