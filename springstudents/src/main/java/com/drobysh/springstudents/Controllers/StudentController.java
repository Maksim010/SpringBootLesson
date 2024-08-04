package com.drobysh.springstudents.Controllers;


import com.drobysh.springstudents.model.Student;
import com.drobysh.springstudents.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/students")
@RestController
@AllArgsConstructor
public class StudentController {

   private final StudentService service;
@GetMapping
    public List<Student> findAllStudents() {
        return service.findAllStudents();
}
@PostMapping("/save_student")
    public Student saveStudent(@RequestBody Student student){
        return service.saveStudents(student);
}
@GetMapping("/{email}")
    public Student findStudent(@PathVariable String email){
        return  service.findByEmail(email);
}
@PostMapping("/update_student")
    public Student updateStudent( Student student){
        return service.updateStudent(student);
}
@DeleteMapping("/delete_student/{email}")
public void deleteStudent(@PathVariable String email){
    service.deleteStudent(email);
}
}
