package com.example.pro.controller;

import com.example.pro.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    private StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("get_courses_with_student")
    public void getCoursesWithStudentByCoursesId(int id){
        System.out.println(studentService.getCoursesWithStudentByCoursesId(id));
    }
}
