package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {

	@GetMapping("/9nath")
	public String nathKorde() {
		return "Hello Navnath Korde";
	}
}
