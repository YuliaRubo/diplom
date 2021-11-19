package com.example.pro.service;

import com.example.pro.dao.StudentDao;
import com.example.pro.dto.CoursesDto;
import com.example.pro.dto.StudentDto;
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

    @Override
    public StudentDto getStudentById(int id) {
        return studentDao.getStudentById(id);
    }

    @Override
    public void saveOrUpdateStudent(StudentDto studentDto) {
        studentDao.saveOrUpdateStudent(studentDto);
    }


    @Override
    public void deleteStudent(int id) {
    studentDao.deleteStudent(id);
    }
}
