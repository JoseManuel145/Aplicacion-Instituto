package org.manuel.dev.institutodescartes.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.manuel.dev.institutodescartes.App;
import org.manuel.dev.institutodescartes.models.DataBase;
import org.manuel.dev.institutodescartes.models.Instituto;
import org.manuel.dev.institutodescartes.models.Student;

public class EditarStudentController {

    @FXML
    private Button guardarBtn;

    @FXML
    private TextField matriculaTxt;

    @FXML
    private TextField nombreTxt;

    @FXML
    private TextField update;

    @FXML
    private Button volverBtn;

    @FXML
    void guardarClick() {
        Instituto instituto = App.getInstituto();
        String buscar = update.getText();
        String id = matriculaTxt.getText();
        String nombre = nombreTxt.getText();

        instituto.getDataBase().update(buscar,id,nombre);
        instituto.getDataBaseCopy().update(buscar,id,nombre);
        instituto.getDataBaseCopy2().update(buscar,id,nombre);
    }

    @FXML
    void volverClick(MouseEvent event) {
        App.nuevaVentana(event,"MenuPrincipal","Descartes");
    }

}
