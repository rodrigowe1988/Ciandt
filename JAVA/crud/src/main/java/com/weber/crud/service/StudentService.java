package com.weber.crud.service;

import com.weber.crud.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);


    List<Student> getAllStudents();
}
