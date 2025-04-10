package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test2Controller {

	@GetMapping("/rushikesh")
	public String demoApi() {
		return "rushikesh-bhadage";
	}
}
