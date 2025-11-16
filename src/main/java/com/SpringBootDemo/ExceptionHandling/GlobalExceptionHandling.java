package com.SpringBootDemo.ExceptionHandling;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandling {
	public String ExceptionHandling(Exception ex) {
		System.out.println(ex.getMessage());
		return "Exception handled";
	}
}
