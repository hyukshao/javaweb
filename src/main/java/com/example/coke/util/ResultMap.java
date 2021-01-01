package com.example.coke.util;

//返回数据的模板类，暂时没有用到
public class ResultMap {
    private int code;
    private String msg;
    private Object data;

    public ResultMap(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static ResultMap success(Object data){
        return new ResultMap(200,"success",data);
    }
}
