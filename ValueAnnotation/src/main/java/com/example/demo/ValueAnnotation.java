package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueAnnotation {
	
	@Value("SKCET")
	public String name;
	
	@GetMapping("/name")
	public String name() {
		return "Welcome to "+name+"!";
	}

}
