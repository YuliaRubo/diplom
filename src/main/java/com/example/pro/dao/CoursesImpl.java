package com.example.pro.dao;

import com.example.pro.dto.CoursesDto;
import com.example.pro.rowMapper.CoursesRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CoursesImpl implements CoursesDao{

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private String GET_ALL_COURSES = "SELECT * FROM courses";
    private String GET_COURSES_BY_ID = "SELECT * FROM courses WHERE id = :id";

    private String SAVE_COURSES= "insert into  courses (name) values (:name)";
    private  String UPDATE_COURSES = "update courses set name=:name where id=:id ";

    private String DELETE_COURSES = "Delete from courses where id=:id";

    @Autowired
    public CoursesImpl(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    @Override
    public List<CoursesDto> getAllCourses() {
        return namedParameterJdbcTemplate.query(GET_ALL_COURSES,new CoursesRowMapper());
    }

    @Override
    public CoursesDto getCoursesById(int id) {
        Map<String, Object> params = new HashMap<>();
        params.put("id", id);
        return namedParameterJdbcTemplate.queryForObject(GET_COURSES_BY_ID, params, new CoursesRowMapper());
    }

    @Override
    public void saveOrUpdate(CoursesDto coursesDto) {
        Map<String, Object> params = new HashMap<>();
        params.put("name", coursesDto.getName());
        if(coursesDto.getId()==0){
            namedParameterJdbcTemplate.update(SAVE_COURSES, params);
        }
        else{
            params.put("id", coursesDto.getId());
            namedParameterJdbcTemplate.update(UPDATE_COURSES, params);
        }
    }

    @Override
    public void delete(int id) {
        Map<String, Object> params = new HashMap<>();
        params.put("id", id);
        namedParameterJdbcTemplate.update(DELETE_COURSES,params);


    }


}
