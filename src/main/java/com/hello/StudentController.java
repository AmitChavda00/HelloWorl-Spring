package com.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("GetStudent")
	public Student getStudent() {
		return new Student("Tony", "Stark");
	}
}
