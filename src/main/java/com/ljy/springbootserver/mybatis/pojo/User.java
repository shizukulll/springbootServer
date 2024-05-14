package com.ljy.springbootserver.mybatis.pojo;

public class User {
    private String  id;
    private String name;
    private String pwd;
    private String mobile;

    public User(String id, String name, String pwd,String mobile) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.mobile = mobile;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
