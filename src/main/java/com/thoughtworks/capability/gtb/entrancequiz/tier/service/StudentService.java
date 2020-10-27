package com.thoughtworks.capability.gtb.entrancequiz.tier.service;

import com.thoughtworks.capability.gtb.entrancequiz.entity.Student;
import com.thoughtworks.capability.gtb.entrancequiz.entity.StudentsDataProvider;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private final StudentsDataProvider studentList;
    private final Integer groupNumber = 6;

    public StudentService() {
        this.studentList = new StudentsDataProvider();
    }

    public List<Student> findAllStudent() {
        return studentList.getStudentList();
    }

    public List<List<Student>> getDividedStudent() {
        List<List<Student>> listGroup = new ArrayList<>();
        List<Student> studentList = this.studentList.getStudentList();
        int listSize = studentList.size();
        int toIndex = (int) Math.floor(listSize / groupNumber) + 1;
        for (int i = 0; i < listSize; i += 2) {
            if (i + 2 > listSize) {
                toIndex = listSize - i;
            }
            List<Student> newList = studentList.subList(i, i + toIndex);
            listGroup.add(newList);
        }
        System.out.println(listGroup);
        return listGroup;
    }
}
