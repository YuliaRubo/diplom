package com.example.pro.service;

import com.example.pro.dto.CoursesDto;

public interface StudentService {
    CoursesDto getCoursesWithStudentByCoursesId(int id);
}
