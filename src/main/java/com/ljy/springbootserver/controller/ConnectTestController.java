package com.ljy.springbootserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConnectTestController {
    @RequestMapping("/connectTest")
    public String hello(){
        return "Server is online ~";
    }
}
