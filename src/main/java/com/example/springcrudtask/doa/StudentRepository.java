package com.example.springcrudtask.doa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springcrudtask.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
