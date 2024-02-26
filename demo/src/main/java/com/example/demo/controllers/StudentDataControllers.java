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
    public String createStudent(@RequestBody Student student) {
        String id = generateId();
        student.setId(id);
        studentMap.put(id, student);
        return id;
    }
    
    @PostMapping("/find")
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


