package com.thoughtworks.capability.gtb.entrancequiz.tier.controller;

import com.thoughtworks.capability.gtb.entrancequiz.entity.Student;

import java.util.List;

public class StudentsResponse {
    private final List<Student> students;

    public StudentsResponse(List<Student> students) {
        this.students = students;
    }
//TODO GTB-工程实践: - StudentsResponse.java:13 删掉未使用的代码
    public List<Student> getStudents() {
        return students;
    }
}
