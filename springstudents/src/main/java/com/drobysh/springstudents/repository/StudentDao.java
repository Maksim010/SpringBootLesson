package com.drobysh.springstudents.repository;

import com.drobysh.springstudents.model.Student;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
@Repository
public class StudentDao {
    private final List<Student> STUDENTS=new ArrayList<>();
    public List<Student> findAllStudents() {
        return STUDENTS;
    }

    public Student saveStudents(Student student) {
        STUDENTS.add(student);
        return student;
    }


    public Student findByEmail(String email) {
        return STUDENTS.stream().filter(p->p.getEmail().equals(email)).findAny().orElse(null);
    }


    public Student updateStudent(Student student) {
        var studentIndex= IntStream.range(0,STUDENTS.size()).filter(index->STUDENTS.get(index)
                .getEmail().equals(student.getEmail())).findFirst().orElse(-1);
        if(studentIndex>-1){
            STUDENTS.set(studentIndex,student);
            return student;
        }
        return null;
    }


    public void deleteStudent(String email) {
        var student=findByEmail(email);
        if(student!=null){
            STUDENTS.remove(student);
        }
    }
}

