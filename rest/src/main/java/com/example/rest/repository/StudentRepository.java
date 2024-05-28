package com.example.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rest.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
