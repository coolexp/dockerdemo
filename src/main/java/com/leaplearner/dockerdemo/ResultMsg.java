package com.leaplearner.dockerdemo;

public class ResultMsg {
    public static int SUCCESS=1000;

    private int code;
    private Object data;
    private String msg;
    private Object extData;

    public Object getExtData() {
        return extData;
    }

    public void setExtData(Object extData) {
        this.extData = extData;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static ResultMsg create(int code,Object data){
        ResultMsg msg = new ResultMsg();
        msg.setCode(code);
        msg.setData(data);
        return msg;
    }
}
