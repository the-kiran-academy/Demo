package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShubhamController {
	
	@GetMapping("/shubham-tiwari")
	public String shubhamTiwari() {
		return "Shubham Tiwari's APLi";
	}
	

}
