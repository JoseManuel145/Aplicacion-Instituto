package org.manuel.dev.institutodescartes.models;

import java.util.ArrayList;

public class StudentArrayList implements Instituto{
    private final ArrayList <Student> students = new ArrayList<>();

    public ArrayList<Student> getStudents() {
        return students;
    }

    @Override
    public void save(String id,Student student) {
        students.add(student);
    }

    @Override
    public void update(Student student, String update, String updateId, String updateName) {
        for (Student i:students){
            if (update.equals(i.getId())){
                i.setName(updateName);
                i.setId(updateId);
                break;
            } else if (update.equalsIgnoreCase(i.getName())){
                i.setName(updateName);
                i.setId(updateId);
                break;
            }
        }
    }
}
