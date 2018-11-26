package com.scp.simple.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping(value="/xyz")
	public String m1() {
		return "Monali";
	}
}