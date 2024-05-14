package com.ljy.springbootserver.mybatis.service;

import com.ljy.springbootserver.mybatis.dto.LoginResponse;
import com.ljy.springbootserver.mybatis.dto.SignupResponse;
import com.ljy.springbootserver.mybatis.pojo.User;

public interface UserService {
    public User findById(String id);
    public LoginResponse login(String  mobile, String pwd);
    public SignupResponse signup(String name, String pwd,String mobile);

}
