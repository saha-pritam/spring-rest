package com.example.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.rest.entity.Student;
import com.example.rest.entity.Teacher;
import com.example.rest.repository.StudentRepository;
import com.example.rest.repository.TeacherRepository;
@Component
public class CommandLinerRunnerImpl implements CommandLineRunner {
	
	@Autowired
	private StudentRepository studentRepository; 
	
	@Autowired
	private TeacherRepository teacherRepository;

	@Override
	public void run(String... args) throws Exception {
		studentRepository.save(new Student("Agradip","Banik"));
		studentRepository.save(new Student("Agniva","Paul"));
		studentRepository.save(new Student("Nilesh","Roy Chowdhury"));
		studentRepository.save(new Student("Shitij","Bhadra"));
		
		teacherRepository.save(new Teacher("Pritam","Saha"));
		teacherRepository.save(new Teacher("Amalesh","Pradhan"));
		teacherRepository.save(new Teacher("Ankur","Chakraborty"));

	}

}
