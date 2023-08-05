package com.virtusa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	
	@GetMapping
	public String getMessage() {
		return "Welcom  to Spring Boot Rest Appliction...!!";
	}

}
