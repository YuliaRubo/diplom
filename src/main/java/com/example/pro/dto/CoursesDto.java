package com.example.pro.dto;

import java.util.ArrayList;
import java.util.List;

public class CoursesDto {

    private int id;
    private String name;
    private List<StudentDto> students;

    public CoursesDto() {
    students = new ArrayList<>();
    }

    public CoursesDto(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<StudentDto> getStudents() {
        return students;
    }

    public void setStudents(List<StudentDto> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "CoursesDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
