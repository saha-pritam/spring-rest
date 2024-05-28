package com.example.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.rest.entity.Student;
import com.example.rest.repository.StudentRepository;
@Component
public class CommandLinerRunnerImpl implements CommandLineRunner {
	
	@Autowired
	private StudentRepository studentRepository; 

	@Override
	public void run(String... args) throws Exception {
		studentRepository.save(new Student("Agradip","Banik"));
		studentRepository.save(new Student("Agniva","Paul"));
		studentRepository.save(new Student("Nilesh","Roy Chowdhury"));
		studentRepository.save(new Student("Shitij","Bhadra"));

	}

}
