package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Service
public class StudentService {
    public Student getStudent(){
        Student student = new Student();
        student.name="Yas";
        student.lastName="Asad";
        student.email="ya@y.com";
        student.age = 30;
        return student;
    }

//    public List<Student> getAllStudents(){
//
//        List<Student> myList = new List();
//        Student student = new Student();
//        student.name="Yas";
//        student.lastName="Asad";
//        student.email="ya@y.com";
//        student.age = 30;
//        myList.add(student);
//        student = new Student();
//        student.name="Keyvan";
//        student.lastName="Soleimani";
//        student.email="Keyvan@y.com";
//        student.age = 33;
//        myList.add(student); 
//        return myList;
//    }
}
