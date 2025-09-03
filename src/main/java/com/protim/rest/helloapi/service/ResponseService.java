package com.protim.rest.helloapi.service;

import com.protim.rest.helloapi.dao.BasicResponse;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ResponseService {

    public String defaultMessage(){
        return "Welcome to Hello API";
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
