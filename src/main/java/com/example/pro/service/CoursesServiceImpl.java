package com.example.pro.service;

import com.example.pro.dao.CoursesDao;
import com.example.pro.dto.CoursesDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CoursesServiceImpl implements CoursesService{

    private CoursesDao coursesDao;
    @Autowired
    public CoursesServiceImpl(CoursesDao coursesDao) {
        this.coursesDao = coursesDao;
    }


    @Override
    public List<CoursesDto> getAllCourses() {
        return coursesDao.getAllCourses();
    }

    @Override
    public CoursesDto getCoursesById(int id) {
        return coursesDao.getCoursesById(id);
    }

    @Override
    public void saveOrUpdate(CoursesDto coursesDto) {
        coursesDao.saveOrUpdate(coursesDto);
    }

    @Override
    public void delete(int id) {
        coursesDao.delete(id);
    }
}
