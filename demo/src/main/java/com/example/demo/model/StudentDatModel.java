package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


class Student {
    private String id;
    private String name;
    private int age;
    private String aadhar;
    private String university;
    
    // Getters and setters
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getAadhar() {
        return aadhar;
    }
    
    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }
    
    public String getUniversity() {
        return university;
    }
    
    public void setUniversity(String university) {
        this.university = university;
    }
}