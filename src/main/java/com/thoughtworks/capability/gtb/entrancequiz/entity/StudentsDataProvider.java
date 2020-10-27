package com.thoughtworks.capability.gtb.entrancequiz.entity;

import java.util.Arrays;
import java.util.List;

public class StudentsDataProvider {
    private List<Student> studentList;

    public StudentsDataProvider() {
        this.studentList = Arrays.asList(
                new Student(1, "成吉思汗"),
                new Student(2, "鲁班七号"),
                new Student(3, "太乙真人"),
                new Student(4, "钟无艳"),
                new Student(5, "花木兰"),
                new Student(6, "雅典娜"),
                new Student(7, "芈月"),
                new Student(8, "白起"),
                new Student(9, "刘禅"),
                new Student(10, "庄周"),
                new Student(11, "马超"),
                new Student(12, "刘备"),
                new Student(13, "哪吒"),
                new Student(14, "大乔"),
                new Student(15, "蔡文姬")
        );
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addNewStudent(Student newStudent) {
        this.studentList.add(newStudent);
    }

}
