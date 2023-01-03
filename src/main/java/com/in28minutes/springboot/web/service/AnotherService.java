package com.in28minutes.springboot.web.service;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Service
public class AnotherService {
    URI uri = new URI("https://localhost:8080/doSomething");
    RestTemplate restTemplate = new RestTemplate("https://localhost:8080/doSomething");
    public int add(){
        return 5 + 5;
    }
}
