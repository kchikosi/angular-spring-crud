package com.example.angular.spring.crud.angularspringcrud.service;

import com.example.angular.spring.crud.angularspringcrud.model.Student;

import java.util.List;

public interface StudentService {
    public boolean saveStudent(Student student);
    public List<Student> getStudents();
    public boolean deleteStudent(Student student);
    public List<Student> getStudentByID(Student student);
    public boolean updateStudent(Student student);
}
