package com.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestStudent {
	
	@GetMapping("/SuchitaBante")
public String SuchitaBante() {
	return "Hello Suchita";
}
}
