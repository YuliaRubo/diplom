package com.example.pro.rowMapper;

import com.example.pro.dao.StudentDao;
import com.example.pro.dto.StudentDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<StudentDto> {
    @Override
    public StudentDto mapRow(ResultSet rs, int rowNum) throws SQLException {
        StudentDto studentDto=new StudentDto();
        studentDto.setId(rs.getInt("id"));
        studentDto.setName(rs.getString("name"));
        studentDto.setSurname(rs.getString("surname"));
        studentDto.setAge(rs.getInt("age"));
        return studentDto;
    }
}
