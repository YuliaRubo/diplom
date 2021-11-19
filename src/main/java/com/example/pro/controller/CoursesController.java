package com.example.pro.controller;

import com.example.pro.dto.CoursesDto;
import com.example.pro.service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CoursesController {

    private CoursesService coursesService;
    @Autowired
    public CoursesController(CoursesService coursesService) {
        this.coursesService = coursesService;
    }

    @GetMapping ("/get-all-courses")
        public String getAllCourses(Model model){
        model.addAttribute("courses",coursesService.getAllCourses());
        return "courses";
        }

    @GetMapping ("/get-courses")
    public void getAllCourses(@RequestParam int id){
        System.out.println(coursesService.getCoursesById(id));
    }

    @GetMapping("/add-new-courses")
    public String addNewCoursesForm(Model model){
        model.addAttribute("courses", new CoursesDto());
        return "saveCourses";
    }

    @GetMapping("/update-courses")
    public String updateCoursesForm(@RequestParam int id, Model model){
        model.addAttribute("courses", coursesService.getCoursesById(id));
        return "saveCourses";
    }

    @PostMapping("/save-courses")
    public String  saveCourses(@ModelAttribute("courses") CoursesDto coursesDto){
        coursesService.saveOrUpdate(coursesDto);
        return "redirect:/get-all-courses";
    }

    @GetMapping("/delete")
    public  String deleteCourses(@RequestParam int id){
    coursesService.delete(id);
    return "redirect:/get-all-courses";
    }

}
