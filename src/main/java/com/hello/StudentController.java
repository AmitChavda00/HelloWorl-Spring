package com.hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("GetStudent")
	public Student getStudent() {
		return new Student("Tony", "Stark");
	}
	
	@GetMapping("GetStudents")
	public List<Student> getStudents(){
		List<Student> studentList = new ArrayList();
		
		studentList.add(new Student("Mike","Scott"));
		studentList.add(new Student("Tony ","Stark"));
		studentList.add(new Student("Ragnar","Lorthbrok"));
		studentList.add(new Student("John","Cena"));
		studentList.add(new Student("Scarlet","Wilson"));
		return studentList;
	}
}
