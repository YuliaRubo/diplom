package com.example.pro.service;

import com.example.pro.dto.CoursesDto;
import com.example.pro.dto.StudentDto;

public interface StudentService {
    CoursesDto getCoursesWithStudentByCoursesId(int id);
    StudentDto getStudentById(int id);
    void saveOrUpdateStudent(StudentDto studentDto);
    void deleteStudent(int id);
}
