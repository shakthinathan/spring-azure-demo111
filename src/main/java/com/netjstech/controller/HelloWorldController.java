package com.netjstech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class HelloWorldController {

	@GetMapping(value="/message/{name}")
	public String displaygreeting(@PathVariable String name) {
		return "Hello World!"+name;
	}
	
}
