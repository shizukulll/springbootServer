package com.ljy.springbootserver.mybatis.service.impl;

import com.ljy.springbootserver.mybatis.dto.LoginResponse;
import com.ljy.springbootserver.mybatis.dto.SignupResponse;
import com.ljy.springbootserver.mybatis.mapper.UserMapper;
import com.ljy.springbootserver.mybatis.pojo.User;
import com.ljy.springbootserver.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(String id) {
        return userMapper.findById(id);
    }

    @Override
    public LoginResponse login(String mobile, String pwd) {
        User user = userMapper.login(mobile, pwd);

        if (user != null) {
            System.out.println(user.toString());
            // 登录成功，返回包含用户ID的LoginResponse
            return LoginResponse.success(user.getId());
        } else {
            // 登录失败，返回失败的LoginResponse
            return LoginResponse.failure("用户名或密码错误");
        }
    }

    @Override
    public SignupResponse signup(String name, String pwd,String mobile) {
        User user = new User();
        user.setName(name);
        user.setPwd(pwd);
        user.setMobile(mobile);
        user.setId(UUID.randomUUID().toString());

        int rowsAffected = userMapper.signup(user.getId(),user.getName(), user.getPwd(),user.getMobile());

        if (rowsAffected > 0) {
            return SignupResponse.success(user.getId(), "注册成功");
        } else {
            return SignupResponse.failure("注册失败，请更换姓名");
        }
    }

}
