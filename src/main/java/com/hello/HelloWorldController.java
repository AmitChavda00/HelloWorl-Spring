package com.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {
	
	@GetMapping("/helloworld")
	public String helloworld() {
		return "<h1><>Hello World!</h1>";
	}
}
