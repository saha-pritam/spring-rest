package com.example.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rest.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

}
