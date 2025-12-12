package com.demo.RestWebApIServiceSpringBoot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/h")
	public String sayHello() {
		
		System.out.println("Hello");
		return "Hello";
	}

}
