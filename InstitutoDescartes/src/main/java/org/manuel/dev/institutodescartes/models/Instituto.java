package org.manuel.dev.institutodescartes.models;

public interface Instituto {
    void save(String id, Student student);
    void update(Student student, String update, String id, String name);
}
