package org.manuel.dev.institutodescartes.models;

public class Instituto {

    Server dataBase = new DataBase();
    Server dataBaseCopy = new DataBaseCopy();
    Server dataBaseCopy2 = new DataBaseCopy2();
    public Server getDataBase() {
        return dataBase;
    }

    public boolean agregarStudent(Student student){
        boolean exito = false;
        if (student != null) {
            dataBase.save(student);
            dataBaseCopy.save(student);
            dataBaseCopy2.save(student);
            exito = true;
        }
        return exito;
    }
    public boolean actualizarStudent(String editar,String id,String name){
        boolean exito = false;
        if (editar != null){
            dataBase.update(editar,id,name);
            dataBaseCopy.update(editar,id,name);
            dataBaseCopy2.update(editar,id,name);
            exito = true;
        }
        return exito;
    }
}