package com.example.pro.controller;

import com.example.pro.service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CoursesController {

    private CoursesService coursesService;
    @Autowired
    public CoursesController(CoursesService coursesService) {
        this.coursesService = coursesService;
    }

    @GetMapping ("/get-all-courses")
//    public void getAllCourses(){
//    System.out.println(coursesService.getAllCourses());
        public String getAllCourses(Model model){
        model.addAttribute("courses",coursesService.getAllCourses());
        return "courses";
        }

    @GetMapping ("/get-courses")
    public void getAllCourses(@RequestParam int id){
        System.out.println(coursesService.getCoursesById(id));
    }
}
