package com.example.demo.repository;
import com.example.demo.model.StudentDataModel;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

@Component
public class StudentDataRepository {
    private Map<String, StudentDataModel> studentDataMap;

    public StudentDataRepository() {
        studentDataMap = new HashMap<>();
    }

    public StudentDataModel getStudentById(final String id) {
        return studentDataMap.getOrDefault(id, null);
    }

    public List<StudentDataModel> getAllStudents() {
        return new ArrayList<>(studentDataMap.values());
    }


    public String createStudent(final String id, final String name, final int age, final String aadhar, final String university) {
        StudentDataModel newStudentDataModel = new StudentDataModel(id, name, age, aadhar, university);
        studentDataMap.put(id, newStudentDataModel);
        return id;
    }
}