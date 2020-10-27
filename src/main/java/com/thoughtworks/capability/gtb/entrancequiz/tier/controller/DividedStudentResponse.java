package com.thoughtworks.capability.gtb.entrancequiz.tier.controller;

import com.thoughtworks.capability.gtb.entrancequiz.entity.Student;

import java.util.List;

public class DividedStudentResponse {
    private final List<List<Student>> dividedStudent;

    public DividedStudentResponse(List<List<Student>> dividedStudent) {
        this.dividedStudent = dividedStudent;
    }

    public List<List<Student>> getDividedStudent() {
        return dividedStudent;
    }
}
