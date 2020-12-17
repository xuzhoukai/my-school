package com.omen.myschool.controller;

import com.omen.myschool.StudentService;
import com.omen.myschool.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostConstruct
    public void start(){
        System.out.println("StudentController start");
    }

    @GetMapping("/student")
    public String getStudent(@RequestParam int id){
        Student student = studentService.findStudent(id);
        return student.getName();
    }

    @GetMapping("/addStudent")
    public String addStudent(@RequestParam int id){
        Student student = new Student();
        student.setName("徐蒙恩"+id);
        student.setAge(4);
        student.setGrade("小一班");
        int result = studentService.insertStudent(student);
        return result+"";
    }

    @GetMapping("/addListStudent")
    public String addStudentList(){
        int result = studentService.insertStudentBatch();
        return result+"";
    }
}
