package com.example.pro.controller;

import com.example.pro.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

    private StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/get_courses_with_student")
    public String getCoursesWithStudentByCoursesId(Model map, @RequestParam int id){
        map.addAttribute("courses",studentService.getCoursesWithStudentByCoursesId(id));
       return "student";
    }
}
