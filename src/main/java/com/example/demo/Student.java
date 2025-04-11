package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student {
	
	public static void main(String[] args) {
		SpringApplication.run(Student.class, args);
		
		System.out.println("hi");}
	
@GetMapping("/SuchitaBante")
public String Addition() {
	
return "Hello Suchita";
}
}
	