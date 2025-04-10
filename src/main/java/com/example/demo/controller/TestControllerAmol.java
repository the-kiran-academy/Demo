package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControllerAmol {
	
	@GetMapping("/amol")
	public String demoApi() {
		return "amol gadkari";
	}

}
