package com.drobysh.springstudents.repository;

import com.drobysh.springstudents.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
    void deleteByEmail(String email);
    Student findStudentByEmail(String email);

}
