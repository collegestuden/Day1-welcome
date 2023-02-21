package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Spring2 {
	@GetMapping("/hello")
	public String display()
	{
		return "Welcome to learn a RestAPI";
	}

}
