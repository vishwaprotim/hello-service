package com.protim.rest.helloservice.controller;


import com.protim.rest.helloservice.dao.BasicResponse;
import com.protim.rest.helloservice.service.ResponseManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final ResponseManager responseManagerService;

    @Autowired
    HelloController(ResponseManager responseManagerService){
        this.responseManagerService = responseManagerService;
    }

    @GetMapping("/")
    public ResponseEntity<String> welcome(){
        return ResponseEntity.ok(responseManagerService.defaultMessage());
    }

    @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BasicResponse> sayHello(){
        return ResponseEntity.ok(responseManagerService.sayHello());
    }

    @GetMapping("/hello/{name}")
    public ResponseEntity<BasicResponse> sayHelloToName(@PathVariable String name){
        return ResponseEntity.ok(responseManagerService.sayHelloToName(name));
    }

}
