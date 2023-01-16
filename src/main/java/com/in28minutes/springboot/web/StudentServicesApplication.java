package com.in28minutes.springboot.web;

import com.in28minutes.springboot.web.multithreading.MultiThreadThing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.in28minutes.springboot.web")
public class StudentServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentServicesApplication.class, args);
		for(int i = 0; i < 5; i++){
			MultiThreadThing myThing = new MultiThreadThing(i);
			Thread myThread = new Thread(myThing);
			myThread.start();
			myThread.isAlive(); //stop executing until thread completes
		}
	}
}