package com.example.pro.rowMapper;

import com.example.pro.dto.CoursesDto;
import com.example.pro.dto.StudentDto;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CoursesStudentRowMapper implements ResultSetExtractor<CoursesDto> {

    @Override
    public CoursesDto extractData(ResultSet rs) throws SQLException, DataAccessException {
        CoursesDto coursesDto = new CoursesDto();
                while(rs.next()){
                    if(coursesDto.getId() == 0){
                        coursesDto.setId(rs.getInt("courses_id"));
                        coursesDto.setName(rs.getString("courses_name"));
                    }
                    StudentDto studentDto = new StudentDto();
                    studentDto.setId(rs.getInt("student_id"));
                    studentDto.setName(rs.getString("student_name"));
                    studentDto.setSurname(rs.getString("surname"));
                    studentDto.setAge(rs.getInt("age"));
                    List<StudentDto> students = coursesDto.getStudents();
                    students.add(studentDto);
                    coursesDto.setStudents(students);
                }



        return coursesDto;
    }
}
