package com.ddm.common;
/**
 * @author Jqy
 */
public enum DDMResponseCode {
    SUCCESS(200, "success"),
    INTERNAL_ERROR(500, "Internal Error");

    private int code;
    private String msg;
    private DDMResponseCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }

}
