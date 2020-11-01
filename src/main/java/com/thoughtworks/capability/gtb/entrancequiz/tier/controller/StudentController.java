package com.thoughtworks.capability.gtb.entrancequiz.tier.controller;

import com.thoughtworks.capability.gtb.entrancequiz.entity.Student;
import com.thoughtworks.capability.gtb.entrancequiz.tier.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/student")
    public void addNewStudent(@RequestBody Student student) {
        studentService.save(student);
    }

    @GetMapping(value = "/students")
    public ResponseEntity<StudentsResponse> getStudents() {
        try {
            List<Student> students = studentService.findAllStudent();
            return ResponseEntity.ok(new StudentsResponse(students));
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping(value = "/dividedStudent")
    public ResponseEntity<DividedStudentResponse> getDividedStudent() {
        try {
            List<List<Student>> dividedStudents = studentService.getDividedStudent();
            return ResponseEntity.ok(new DividedStudentResponse(dividedStudents));
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

}
