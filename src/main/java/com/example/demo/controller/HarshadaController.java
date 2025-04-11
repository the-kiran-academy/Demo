package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HarshadaController {
	
	@GetMapping("/Harshada-Bamnote")
	public String Harshada() {
		return"Harshada";
	}

}
