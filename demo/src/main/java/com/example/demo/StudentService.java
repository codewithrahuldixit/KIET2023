package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	StudentRepository repository;

	public StudentService(StudentRepository repository) {
		super();
		this.repository = repository;
		repository.save(new Student(101,"Rahul","Email"));
	}

	public Student getById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}
	
}
