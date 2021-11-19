package com.example.pro.service;

import com.example.pro.dto.CoursesDto;
import com.example.pro.dto.StudentDto;

public interface StudentService {
    CoursesDto getCoursesWithStudentByCoursesId(int id);
    StudentDto getStudentById(int id);
    void saveOrUpdate(StudentDto studentDto);
    void deleteStudent(int id);
}
