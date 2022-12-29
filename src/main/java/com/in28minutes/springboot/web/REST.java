package com.in28minutes.springboot.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class REST {
    @GetMapping
    public static ResponseEntity<String> getHello(){
        return new ResponseEntity<>("Hi", HttpStatus.ACCEPTED);
    }

}
