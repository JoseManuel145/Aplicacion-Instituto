package org.manuel.dev.institutodescartes.models;

import java.util.HashMap;

public class StudentHashMap implements Instituto{
    HashMap <String,Student> studentHashMap = new HashMap<>();

    public HashMap<String, Student> getStudentHashMap() {
        return studentHashMap;
    }

    @Override
    public void save(String id, Student student) {
        studentHashMap.put(id, student);
    }

    @Override
    public void update(Student student, String update, String id, String name) {
        studentHashMap.put(update,student);
    }
}
