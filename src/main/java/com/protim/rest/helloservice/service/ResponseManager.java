package com.protim.rest.helloservice.service;

import com.protim.rest.helloservice.dao.BasicResponse;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ResponseManager {

    public String defaultMessage(){
        return "Welcome to Hello Service";
    }

    public BasicResponse sayHelloToName(String name){
        return BasicResponse.builder()
                .id(UUID.randomUUID().toString())
                .message("Hello, " + name + "!").build();
    }

    public BasicResponse sayHello(){
        return BasicResponse.builder()
                .id(UUID.randomUUID().toString())
                .message("Hello, user!").build();
    }
}
