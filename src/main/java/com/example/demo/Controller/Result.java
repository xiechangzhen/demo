package com.example.demo.Controller;

import java.io.Serializable;

/**
 * @author yyt
 * @date 2019/9/20 11:46:30
 * @description
 */
public class Result implements Serializable {

    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
