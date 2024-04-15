package org.manuel.dev.institutodescartes.controllers;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.manuel.dev.institutodescartes.App;
import org.manuel.dev.institutodescartes.models.Instituto;
import org.manuel.dev.institutodescartes.models.Server;
import org.manuel.dev.institutodescartes.models.Student;

public class AgregarStudentController {

    @FXML
    private Button guardarBtn;

    @FXML
    private TextField matriculaTxt;

    @FXML
    private TextField nombreTxt;

    @FXML
    private Button volverBtn;

    @FXML
    void guardarClick() {
        Instituto instituto = App.getInstituto();
        String name = nombreTxt.getText();
        String id = matriculaTxt.getText();
        Student student = new Student(id, name);

        Server dataBase = instituto.getDataBase();
        Server dataBaseCopy = instituto.getDataBaseCopy();
        Server dataBaseCopy2 = instituto.getDataBaseCopy2();
        dataBase.save(student);
        dataBaseCopy.save(student);
        dataBaseCopy2.save(student);

        ObservableList<Student> students = Student.getStudents();
        students.add(student);
    }
    @FXML
    void volverClick(MouseEvent event){
        App.nuevaVentana(event,"MenuPrincipal","Descartes");
    }

}
