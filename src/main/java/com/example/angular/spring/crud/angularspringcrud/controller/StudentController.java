package com.example.angular.spring.crud.angularspringcrud.controller;

import com.example.angular.spring.crud.angularspringcrud.model.Student;
import com.example.angular.spring.crud.angularspringcrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(value="/api")
public class StudentController {
    @Autowired
    private StudentService studentservice;

    @PostMapping("save-student")
    public boolean saveStudent(@RequestBody Student student) {
        return studentservice.saveStudent(student);
    }

    @GetMapping("students-list")
    public List<Student> getStudents() {
        return studentservice.getStudents();
    }

    @DeleteMapping("delete-student/{student_id}")
    public boolean deleteStudent(@PathVariable("student_id") int student_id,Student student) {
        student.setStudent_id(student_id);
        return studentservice.deleteStudent(student);
    }

    @GetMapping("student/{student_id}")
    public List<Student> getStudentByID(@PathVariable("student_id") int student_id,Student student) {
        student.setStudent_id(student_id);
        return studentservice.getStudentByID(student);
    }

    @PostMapping("update-student/{student_id}")
    public boolean updateStudent(@RequestBody Student student,@PathVariable("student_id") int student_id) {
        student.setStudent_id(student_id);
        return studentservice.updateStudent(student);
    }
}
