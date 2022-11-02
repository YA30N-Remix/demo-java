package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    private StudentService _studentService;
    @Autowired
    public StudentController(StudentService studentService) {
        _studentService = studentService;
    }
    @GetMapping
    public Student getStudent(){
    return _studentService.getStudent();
    }
}
