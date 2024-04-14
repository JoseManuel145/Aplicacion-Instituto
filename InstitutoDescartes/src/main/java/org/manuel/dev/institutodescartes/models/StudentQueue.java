package org.manuel.dev.institutodescartes.models;

import java.util.Stack;

public class StudentQueue implements Instituto{
    private final Stack <Student> studentStack = new Stack<>();

    public Stack<Student> getStudentStack() {
        return studentStack;
    }

    @Override
    public void save(String id, Student student) {
        studentStack.push(student);
    }

    @Override
    public void update(Student student, String update, String updateId, String updateName) {
        for (Student i:studentStack){
            if (update.equals(i.getId())){
                i.setId(updateId);
                i.setName(updateName);
                break;
            }else if (update.equalsIgnoreCase(i.getName())){
                i.setId(updateId);
                i.setName(updateName);
                break;
            }
        }
    }
}
