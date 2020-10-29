package com.thoughtworks.capability.gtb.entrancequiz.tier.service;

import com.thoughtworks.capability.gtb.entrancequiz.entity.Student;
import com.thoughtworks.capability.gtb.entrancequiz.entity.StudentsDataProvider;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private final StudentsDataProvider studentList;
    //TODO GTB-工程实践: + StudentService.java:13 有提取Magic Number的意识
    //TODO GTB-工程实践: - StudentService.java:14 常量名称一般是大写，组合词用"_"连接
    private final Integer groupNumber = 6;

    public StudentService() {
        this.studentList = new StudentsDataProvider();
    }

    public List<Student> findAllStudent() {
        return studentList.getStudentList();
    }

    public List<List<Student>> getDividedStudent() {
        List<List<Student>> listGroup = initDividedStudent();
        List<Student> studentList = this.studentList.getStudentList();
        int listSize = studentList.size();
        for (int i = 0; i < listSize; i++) {
            listGroup.get(i % groupNumber).add(studentList.get(i));
        }
        System.out.println(listGroup);
        return listGroup;
    }

    private List<List<Student>> initDividedStudent() {
        List<List<Student>> initialDividedStudent = new ArrayList<>();
        for (Integer i = 0; i < groupNumber; i++) {
            initialDividedStudent.add(new ArrayList<>());
        }
        return initialDividedStudent;
    }
}
