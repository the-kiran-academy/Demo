package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MurliController {

	@GetMapping("/Murli")
	public String demoApi() {
		return "Welcome to Git First API Murli";
	}
}
