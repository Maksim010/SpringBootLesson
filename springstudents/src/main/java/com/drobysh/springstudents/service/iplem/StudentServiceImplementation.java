package com.drobysh.springstudents.service.iplem;

import com.drobysh.springstudents.model.Student;
import com.drobysh.springstudents.repository.StudentDao;
import com.drobysh.springstudents.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class StudentServiceImplementation implements StudentService {
    private final StudentDao repository;
    @Override
    public List<Student> findAllStudents() {
        return repository.findAllStudents();
    }

    @Override
    public Student saveStudents(Student student) {
        return repository.saveStudents(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
         repository.deleteStudent(email);
    }
}
