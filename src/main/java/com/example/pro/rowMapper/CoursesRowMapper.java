package com.example.pro.rowMapper;

import com.example.pro.dto.CoursesDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CoursesRowMapper implements RowMapper<CoursesDto> {
    @Override
    public CoursesDto mapRow(ResultSet rs, int rowNum) throws SQLException {
        CoursesDto coursesDto = new CoursesDto();
        coursesDto.setId(rs.getInt("id"));
        coursesDto.setName(rs.getString("name"));
        return coursesDto;
    }
}
