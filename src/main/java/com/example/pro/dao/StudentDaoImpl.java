package com.example.pro.dao;

import com.example.pro.dto.CoursesDto;
import com.example.pro.dto.StudentDto;
import com.example.pro.rowMapper.CoursesRowMapper;
import com.example.pro.rowMapper.CoursesStudentRowMapper;
import com.example.pro.rowMapper.StudentRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Repository
public class StudentDaoImpl implements StudentDao{

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    private String GET_COURSES_WITH_STUDENT_BY_COURSES_ID = "select  courses.id as courses_id , courses.name as courses_name,"+
    " student.id as student_id , student.name as student_name ," +
    " student.surname, student.age  from courses join student on courses.id = student.coursesId where courses.id = :id";

    private String GET_STUDENT_BY_ID = "SELECT * FROM student WHERE id = :id";

    private String SAVE_STUDENT= "insert into  student (name, surname, age) values (:name, :surname, :age)";
    private  String UPDATE_STUDENT = "update student set name=:name where id=:id ";

    private String DELETE_STUDENT = "Delete from student where id=:id";

    @Autowired
    public StudentDaoImpl(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    @Override
    public CoursesDto getCoursesWithStudentByCoursesId(int id) {
        Map<String, Object> params = new HashMap<>();
        params.put("id", id);
        return namedParameterJdbcTemplate.query(GET_COURSES_WITH_STUDENT_BY_COURSES_ID, params,new CoursesStudentRowMapper());
    }

    @Override
    public StudentDto getStudentById(int id) {
        Map<String, Object> params = new HashMap<>();
        params.put("id", id);
        return namedParameterJdbcTemplate.queryForObject(GET_STUDENT_BY_ID, params, new StudentRowMapper());
    }

    @Override
    public void saveOrUpdate(StudentDto studentDto) {
        Map<String, Object> params = new HashMap<>();
        params.put("name", studentDto.getName());
        params.put("surname", studentDto.getSurname());
        params.put("age", studentDto.getAge());
        if(studentDto.getId()==0){
            namedParameterJdbcTemplate.update(SAVE_STUDENT, params);
        }
        else{
            params.put("id", studentDto.getId());
            namedParameterJdbcTemplate.update(UPDATE_STUDENT, params);
        }
    }

    @Override
    public void delete(int id) {
        Map<String, Object> params = new HashMap<>();
        params.put("id", id);
        namedParameterJdbcTemplate.update(DELETE_STUDENT,params);
    }
}



