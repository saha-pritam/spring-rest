package com.example.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.entity.Teacher;
import com.example.rest.repository.TeacherRepository;

@RestController
public class MyController {
	@Autowired
	private TeacherRepository teacherRepository;
	
	@GetMapping("/teachers/{id}")
	public Teacher getTeacherById(@PathVariable int id) {
		return teacherRepository.findById(id).orElse(null);
	}
}
