package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restapi/")
public class DemoRestApiBasic {
	
	@GetMapping("hi")
	public String helloWorld() {
		return "Hello world! How is it going?";
	}
}
