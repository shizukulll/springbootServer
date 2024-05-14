package com.ljy.springbootserver.mybatis.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LoginResponse {
    private String userId;
    private String status;


    public static LoginResponse success(String userId) {
        LoginResponse response = new LoginResponse();
        response.setUserId(userId);
        response.setStatus("SUCCESS");
        return response;
    }

    public static LoginResponse failure(String errorMessage) {
        LoginResponse response = new LoginResponse();
        response.setStatus("FAILURE");
        return response;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String toJson() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace(); // 或者处理异常
            return null;
        }
    }
}