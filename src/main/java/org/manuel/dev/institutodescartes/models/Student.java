package org.manuel.dev.institutodescartes.models;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Student {
    private String id;
    private String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

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

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
    public static ObservableList<Student> getStudents() {
        ObservableList<Student> students = FXCollections.observableArrayList();
        // Agrega estudiantes a la lista
        return students;
    }
}
