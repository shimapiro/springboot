package com.example.demo.comtroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloSpringContoller {
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
}
