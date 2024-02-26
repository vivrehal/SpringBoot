package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;



public class StudentDataModel {
    public String Id;
    public String name;
    public int age;
    public String aadhar;
    public String university;

    StudentDataModel(String Id, String name, int age, String aadhar, String university) {
        this.Id = Id;
        this.name = name;
        this.age = age;
        this.aadhar = aadhar;
        this.university = university;   
        
    }

}
