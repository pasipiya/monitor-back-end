package com.example.consumingrest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping(value = "test")
	public String test() {
		return "welcome";
	}
	
	@PostMapping(value = "test")
	public String testPost(@RequestBody LoginRequest loginRequest) {
		return loginRequest.username + " " + loginRequest.password;
	}
}
