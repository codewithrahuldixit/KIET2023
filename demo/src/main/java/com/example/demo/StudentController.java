package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class StudentController {
StudentService service;

public StudentController(StudentService service) {
	super();
	this.service = service;
}
@GetMapping("/students/{id}")
public Student getStudent(@PathVariable int id ) {
	return service.getById(id);
}
}
