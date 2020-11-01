package com.thoughtworks.capability.gtb.entrancequiz.tier.controller;

import com.thoughtworks.capability.gtb.entrancequiz.entity.Student;
import com.thoughtworks.capability.gtb.entrancequiz.tier.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
//TODO GTB-完成度: - StudentController.java:14 缺少添加学员、获取分组等接口
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
            //TODO GTB-工程实践: - StudentController.java:27 一般特定的业务异常场景，在service中进行throw
            return ResponseEntity.notFound().build();
        }
    }
//TODO GTB-知识点: * 了解下restful规范
//TODO GTB-知识点: - StudentController.java:31 path一般不使用驼峰形式，使用中划线"-"连接
//TODO GTB-知识点: - StudentController.java:32 path中不包含动词
    //TODO GTB-知识点: * 如果不是特定的自定义返回结果，ResponseEntity可以省略
    //TODO GTB-完成度: - StudentController.java:35 自动分组应该是随机的，每次结果应该不一样
    @GetMapping(value = "/dividedStudent")
    public ResponseEntity<DividedStudentResponse> getDividedStudent() {
        try {
            //TODO GTB-工程实践: - StudentController.java:36 变量名需要使用驼峰形式
            List<List<Student>> dividedstudents = studentService.getDividedStudent();
            return ResponseEntity.ok(new DividedStudentResponse(dividedstudents));
        } catch (Exception e) {
            //TODO GTB-知识点: * 了解下@ResponseStatus的用法
            return ResponseEntity.notFound().build();
        }
    }

}
