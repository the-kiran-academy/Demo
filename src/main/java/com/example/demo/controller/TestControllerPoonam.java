package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControllerPoonam
 {
	@GetMapping("/poonam")
	public String demoApi() 
	{
		return "poonam limbore";
	}
 }


