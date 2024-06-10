package com.example.spring_boot_security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

	@GetMapping("/")
	public String home() {
		return("<h1>Welcome</h1>");
	}
	
	@GetMapping("/user")
	public String user() {
		System.out.println("hddjdj");
		return("<h1>WelcomeUser</h1>");
	}
	
	@GetMapping("/admin")
	public String admin() {
		System.out.println("hddjdj");
		return("<h1>WelcomeAdmin</h1>");
	}
}
