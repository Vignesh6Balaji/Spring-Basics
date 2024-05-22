package com.vignesh.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddController {
	
	@GetMapping("/add")
	public void addController() {
		System.out.println("Hello");
	}

}
