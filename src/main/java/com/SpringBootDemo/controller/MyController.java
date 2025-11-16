package com.SpringBootDemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/std")
public class MyController {

	@GetMapping("/student")
	public List<Student> getStd() {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(1, "Zeeshan"));
		list.add(new Student(2, "Raza"));
		list.add(new Student(3, "anupam"));
		return list;
	}

	@GetMapping("/welcome")
	public String getMsg() {
		String str = "welcome Zeeshan Raza";
		System.out.println(str);
		return str;
	}

	@GetMapping("/home")
	public String getHome() {
		String str = "welcome Home Zeeshan Raza";
		System.out.println(str);
		return str;
	}

	@PostMapping("/cart")
	public String getCart() {
		String str = "Cart is empty5";
		System.out.println(str);
		return str;
	}
}
