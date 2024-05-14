package com.ljy.springbootserver.mybatis.dto;

public class LoginRequest {
    private String mobile;
    private String pwd;

    public LoginRequest(String mobile, String pwd) {
        this.mobile = mobile;
        this.pwd = pwd;
    }

    public LoginRequest() {
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
