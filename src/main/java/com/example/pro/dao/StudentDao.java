package com.example.pro.dao;

import com.example.pro.dto.CoursesDto;

public interface StudentDao {
    CoursesDto getCoursesWithStudentByCoursesId(int id);
}
