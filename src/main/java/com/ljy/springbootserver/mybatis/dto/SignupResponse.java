package com.ljy.springbootserver.mybatis.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SignupResponse {

    private String status;

    private String message;
    private String id;

    public static SignupResponse success(String id,String message){
        SignupResponse sigupResponse = new SignupResponse();
        sigupResponse.id = id;
        sigupResponse.message = message;
        sigupResponse.status = "SUCCESS";
        return sigupResponse;
    }

    public static SignupResponse failure(String message){
        SignupResponse sigupResponse = new SignupResponse();
        sigupResponse.message = message;
        sigupResponse.status = "FAILURE";
        return sigupResponse;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
