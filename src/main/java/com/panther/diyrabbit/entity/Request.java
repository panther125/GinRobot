package com.panther.diyrabbit.entity;

public class Request {

    private String key = "free";

    private String appid = "0";

    private String msg = "";

    public Request(){
    }

    public Request(String msg){

        this.msg = msg;
    }

    public String getKey() {

        return key;
    }

    public void setKey(String key) {

        this.key = key;
    }

    public String getAppid() {

        return appid;
    }

    public void setAppid(String appid) {

        this.appid = appid;
    }

    public String getMsg() {

        return msg;
    }

    public void setMsg(String msg) {

        this.msg = msg;
    }
}

