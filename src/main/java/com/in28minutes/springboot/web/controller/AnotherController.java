package com.in28minutes.springboot.web.controller;


import com.in28minutes.springboot.web.service.AnotherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AnotherController {
    @Autowired
    AnotherService anotherService;
    @GetMapping("/doSomething")
    public ResponseEntity<String> doSomething(){
        int number = anotherService.add();
        return new ResponseEntity<String>("hi" + number, HttpStatus.ACCEPTED);
    }
}
