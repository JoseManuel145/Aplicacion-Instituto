package org.manuel.dev.institutodescartes.models;

import java.util.ArrayList;

public class DataBaseCopy2 implements Server{
    private ArrayList <Student> students;

    public DataBaseCopy2() {
        this.students = new ArrayList<>();
    }

    @Override
    public void save(Student student) {
        this.students.add(student);
    }

    @Override
    public void update(String update, String id, String name) {
        for (Student i: this.students){
            if (update.equals(i.getId())){
                i.setId(id);
                i.setName(name);
            }else if (update.equalsIgnoreCase(i.getName())){
                i.setId(id);
                i.setName(name);
            }
        }
    }
}
