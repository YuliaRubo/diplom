package com.example.pro.dao;

import com.example.pro.dto.CoursesDto;

import java.util.List;

public interface CoursesDao {
    List<CoursesDto> getAllCourses();
    CoursesDto getCoursesById(int id);
    void saveOrUpdate(CoursesDto coursesDto);
    void delete(int id);

}
