package com.in28minutes.springboot.web.service;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Queue;

@Service
public class AnotherService {
    RestTemplate restTemplate = new RestTemplate();

    public int add(){
        String t = restTemplate.getForObject("Http://localhost:8082/s2", String.class);
        System.out.println(t);
        return 5 + 5;
    }
}
