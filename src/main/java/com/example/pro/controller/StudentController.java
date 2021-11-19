package com.example.pro.controller;

import com.example.pro.dto.CoursesDto;
import com.example.pro.dto.StudentDto;
import com.example.pro.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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

    @GetMapping ("/get-student")
    public void getAllStudent(@RequestParam int id){
        System.out.println(studentService.getStudentById(id));
    }

    @GetMapping("/add-new-student")
    public String addNewStudentForm(Model model){
        model.addAttribute("student", new StudentDto());
        return "saveStudent";
    }

//    @GetMapping("/update-student")
//    public String updateStudentForm(@RequestParam int id, Model model){
//        model.addAttribute("student", studentService.getStudentById(id));
//        return "saveStudent";
//    }
    @PostMapping("/save-student")
    public String  saveStudent(@ModelAttribute("student") StudentDto studentDto){
        studentService.saveOrUpdate(studentDto);
        return "redirect:/get_courses_with_student";
    }

//    @GetMapping("/delete")
//    public  String deleteStudent(@RequestParam int id){
//        studentService.deleteStudent(id);
//        return "redirect:/get_courses_with_student";
//    }

}
