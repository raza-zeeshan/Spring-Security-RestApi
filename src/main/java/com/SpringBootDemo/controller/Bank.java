package com.SpringBootDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Bank {

	@GetMapping("/welcome")
	public String welcome() {
		return "welcome to security project";
	}

	@GetMapping("/home")
	public String home() {
		return "home security project";
	}

	@GetMapping("/login")
	public String login() {
		return "Login page";
	}

	@GetMapping("/balance")
	public String balance() {
		return "balance : 88465215";
	}

	@GetMapping("/deposint")
	public String deposit() {
		return "deposit the money";
	}

	@GetMapping("/about")
	public String about() {
		return "Zeeshan Raza :contact 7044349224";
	}

	@GetMapping("/contact")
	public String contact() {
		return "contact:7044349224";
	}

	@GetMapping("/loan")
	public String loan() {
		return "loan page";
	}

	@GetMapping("/change")
	public String change() {
		return "change page";
	}
}
