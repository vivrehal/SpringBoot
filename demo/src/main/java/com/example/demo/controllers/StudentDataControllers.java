package com.example.demo.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;

import com.example.demo.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentDataControllers {
    
    private Map<String, Student> studentMap = new HashMap<>();
    
    @PostMapping("/create")
    public String createStudent(@RequestBody String name, @RequestBody int age, @RequestBody String aadhar, @RequestBody String university) {
        String id = generateId();
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        student.setAadhar(aadhar);
        student.setUniversity(university);
        student.setId(id);
        studentMap.put(id, student);
        return id;
    }
    
    @GetMapping("/find")
    public Student findStudentById(@RequestBody String id) {
        return studentMap.getOrDefault(id, null);
    }
    
    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return new ArrayList<>(studentMap.values());
    }
    
    private String generateId() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
}


