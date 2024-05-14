package com.ljy.springbootserver.controller;

import com.ljy.springbootserver.mybatis.dto.LoginRequest;
import com.ljy.springbootserver.mybatis.dto.LoginResponse;
import com.ljy.springbootserver.mybatis.dto.SignupRequest;
import com.ljy.springbootserver.mybatis.dto.SignupResponse;
import com.ljy.springbootserver.mybatis.pojo.User;
import com.ljy.springbootserver.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/mobile")
@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("/user/findById")
    public User findById(String id){
        return userService.findById(id);
    }


    @PostMapping(value = "/user/login", produces = MediaType.APPLICATION_JSON_VALUE)
    public String login(@RequestBody LoginRequest request){
        LoginResponse response = userService.login(request.getMobile(), request.getPwd());
        return response.toJson();
    }

    @PostMapping(value = "/user/signup", produces = MediaType.APPLICATION_JSON_VALUE)
    public String signup(@RequestBody SignupRequest request) {
        SignupResponse response = userService.signup(request.getName(), request.getPwd(), request.getMobile());
        return response.toJson();
    }



    }




