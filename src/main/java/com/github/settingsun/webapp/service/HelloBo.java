package com.github.settingsun.webapp.service;

/**
 * Created by settingsun1225 on 17/3/2.
 */
public class HelloBo {
    private int id;
    private String msg;

    public HelloBo() {}

    public HelloBo(int id, String msg) {
        this.id = id;
        this.msg = msg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
