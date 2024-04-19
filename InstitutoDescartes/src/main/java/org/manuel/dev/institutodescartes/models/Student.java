package org.manuel.dev.institutodescartes.models;


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


    public String imprimirAlumn() {
        StringBuilder alumno = new StringBuilder();
        alumno.append("---------------\n");
        alumno.append("Matricula: ").append(id).append("\n");
        alumno.append("Nombre: ").append(name).append("\n");
        alumno.append("---------------").append("\n");
        return alumno.toString();
    }
}
