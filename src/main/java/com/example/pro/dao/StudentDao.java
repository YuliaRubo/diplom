package com.example.pro.dao;

import com.example.pro.dto.CoursesDto;
import com.example.pro.dto.StudentDto;

public interface StudentDao {
    CoursesDto getCoursesWithStudentByCoursesId(int id);
    StudentDto getStudentById(int id);

    void saveOrUpdate(StudentDto studentDto);
    void delete(int id);
}
