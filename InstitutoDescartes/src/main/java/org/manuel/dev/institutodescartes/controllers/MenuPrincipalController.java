package org.manuel.dev.institutodescartes.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import org.manuel.dev.institutodescartes.App;
import org.manuel.dev.institutodescartes.models.DataBase;
import org.manuel.dev.institutodescartes.models.Student;

public class MenuPrincipalController {
    @FXML
    private Button agregarBtn;

    @FXML
    private Button editarBtn;

    @FXML
    private ListView<String> tabla;
    @FXML
    void initialize(){
        DataBase db = (DataBase) App.getInstituto().getDataBase();
        tabla.getItems().clear();

        for (Student i: db.getStudents()){
            tabla.getItems().add(i.imprimirAlumn());
        }
    }
    @FXML
    void agregarClick(MouseEvent event){
        App.nuevaVentana(event,"Agregar-Student","Agrega un estudiante");
    }
    @FXML
    void editarClick(MouseEvent event){
        App.nuevaVentana(event,"Editar-Student","Edita un estudiante");
    }
}