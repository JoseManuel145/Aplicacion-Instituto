package org.manuel.dev.institutodescartes.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.manuel.dev.institutodescartes.App;
import org.manuel.dev.institutodescartes.models.Instituto;
import org.manuel.dev.institutodescartes.models.Server;
import org.manuel.dev.institutodescartes.models.Student;

public class MenuPrincipalController {

    @FXML
    private Button guardarBtn;

    @FXML
    private TextField idTxt;

    @FXML
    private TextField nameTxt;
    @FXML
    private ListView <String> lista;

    @FXML
    void guardarClick(MouseEvent event) {
        Instituto instituto = App.getInstituto();
        String name = nameTxt.getText();
        String id = idTxt.getText();
        Student student = new Student(id, name);

        Server dataBase = instituto.getDataBase();
        Server dataBaseCopy = instituto.getDataBaseCopy();
        Server dataBaseCopy2 = instituto.getDataBaseCopy2();
        dataBase.save(student);
        dataBaseCopy.save(student);
        dataBaseCopy2.save(student);

        lista.getItems().add(student.toString());
    }

}
