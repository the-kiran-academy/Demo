package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RohitController {
	
	
	@GetMapping("/Rohit-Mungase")
	public String ramChadar() {
		 
		
		return "Hello Rohit...!!";

	}
}
