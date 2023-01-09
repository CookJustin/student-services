package com.in28minutes.springboot.web.service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.Queue;

@Service
public class AnotherService {
    RestTemplate restTemplate = new RestTemplate();

    @Value("${student.service.two}")
    private String student_service_two;

    public int add(){
        System.out.println(student_service_two);
        String t = restTemplate.getForObject("http://" + student_service_two + "/s2", String.class);
        System.out.println(t);
        return 5 + 6;
    }
}
