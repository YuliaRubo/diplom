package com.example.pro.service;

import com.example.pro.dao.StudentDao;
import com.example.pro.dto.CoursesDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    private StudentDao studentDao;
    @Autowired
    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public CoursesDto getCoursesWithStudentByCoursesId(int id) {
        return studentDao.getCoursesWithStudentByCoursesId(id);
    }
}
