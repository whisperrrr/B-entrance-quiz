package com.thoughtworks.capability.gtb.entrancequiz.tier.service;

import com.thoughtworks.capability.gtb.entrancequiz.entity.Student;
import com.thoughtworks.capability.gtb.entrancequiz.entity.StudentsDataProvider;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentsDataProvider studentList;

    public StudentService() {
        this.studentList = new StudentsDataProvider();
    }

    public List<Student> findAllStudent() {
        return studentList.getStudentList();
    }
}
