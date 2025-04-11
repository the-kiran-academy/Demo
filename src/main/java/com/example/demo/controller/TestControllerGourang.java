package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControllerGourang {
	@GetMapping ("/Gourang_pandey")
public String demoAPI() {
	return "Gourang_Pandey";
	
}
}
