package org.manuel.dev.institutodescartes.models;

public class Instituto {

    Server dataBase = new DataBase();
    Server dataBaseCopy = new DataBaseCopy();
    Server dataBaseCopy2 = new DataBaseCopy2();
    public Server getDataBase() {
        return dataBase;
    }

    public Server getDataBaseCopy() {
        return dataBaseCopy;
    }

    public Server getDataBaseCopy2() {
        return dataBaseCopy2;
    }

}