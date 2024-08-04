package com.drobysh.springstudents.service;

import com.drobysh.springstudents.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {
     List<Student> findAllStudents();
     Student saveStudents(Student student);
     Student findByEmail(String email);
     Student updateStudent(Student student);
     void deleteStudent(String email);
}
