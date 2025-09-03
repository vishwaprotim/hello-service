package com.protim.rest.helloapi.controller;


import com.protim.rest.helloapi.dao.BasicResponse;
import com.protim.rest.helloapi.service.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final ResponseService responseService;

    @Autowired
    HelloController(ResponseService responseService){
        this.responseService = responseService;
    }

    @GetMapping("/")
    public ResponseEntity<String> welcome(){
        return ResponseEntity.ok(responseService.defaultMessage());
    }

    @GetMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<BasicResponse> sayHello(){
        return ResponseEntity.ok(responseService.sayHello());
    }

    @GetMapping("/hello/{name}")
    public ResponseEntity<BasicResponse> sayHelloToName(@PathVariable String name){
        return ResponseEntity.ok(responseService.sayHelloToName(name));
    }

}
