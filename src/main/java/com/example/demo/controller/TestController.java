package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/Priyanka-S-More")
	public String priyankaSMore() {
		return "Hello Priyanka";
	}

}
