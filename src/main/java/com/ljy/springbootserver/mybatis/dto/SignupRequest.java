package com.ljy.springbootserver.mybatis.dto;

public class SignupRequest {
    private String name;
    private String pwd;
    private String mobile;


    public SignupRequest() {
    }

    public SignupRequest(String name, String pwd, String mobile) {
        this.name = name;
        this.pwd = pwd;
        this.mobile = mobile;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    // Getter 和 Setter 方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

}
