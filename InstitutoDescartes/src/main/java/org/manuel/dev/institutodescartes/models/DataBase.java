package org.manuel.dev.institutodescartes.models;

import java.util.ArrayList;

public class DataBase implements Server {
    private final ArrayList <Student> students = new ArrayList<>();

    public ArrayList<Student> getStudents() {
        return students;
    }

    @Override
    public void save(Student student) {
        students.add(student);
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
