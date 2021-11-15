package com.example.pro.service;

import com.example.pro.dto.CoursesDto;

import java.util.List;

public interface CoursesService {
    List<CoursesDto> getAllCourses();
    CoursesDto getCoursesById(int id);
}
