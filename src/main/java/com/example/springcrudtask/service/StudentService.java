package com.example.springcrudtask.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springcrudtask.doa.StudentRepository;
import com.example.springcrudtask.model.Student;


@Service
@Transactional
public class StudentService {

	@Autowired
    private StudentRepository objStudentRepository;
     
	// Get All Student List
    public List<Student> getAllStudentList() {
        return objStudentRepository.findAll();
    }
    
    // Get Single Student Detail By Id
    public Student getStudentById(int id) {
        return objStudentRepository.findById(id).get();
    }
    
    // Save New Student Detail in Db
    public void createStudent(Student objStudent) {
        objStudentRepository.save(objStudent);
    }
    
    // Delete Student by Id
    public void deleteStudentById(int id) {
        objStudentRepository.deleteById(id);
    }
    
    public void deleteAllStudent() {
        objStudentRepository.deleteAll();
    }
}
