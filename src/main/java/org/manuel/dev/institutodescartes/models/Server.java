package org.manuel.dev.institutodescartes.models;

import java.util.ArrayList;

public interface Server {

    void save(Student student);
    void update(String update, String id, String name);
}
