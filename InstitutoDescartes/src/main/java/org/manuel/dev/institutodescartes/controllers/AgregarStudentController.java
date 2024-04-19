package org.manuel.dev.institutodescartes.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import org.manuel.dev.institutodescartes.App;
import org.manuel.dev.institutodescartes.models.Instituto;
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

        if (name.isEmpty() || id.isEmpty()){
            App.showAlert(Alert.AlertType.ERROR,"Error","Fallo al agregar.\nTodos los campos deben de llenarse.");
            return;
        }
        Student student = new Student(id, name);
        boolean exito = instituto.agregarStudent(student);

        if (exito){
            App.showAlert(Alert.AlertType.INFORMATION,"Exito","El estudiante se agrego correctamente");
        }else {
            App.showAlert(Alert.AlertType.ERROR,"Error","Fallo al agregar, intentelo de nuevo.");
        }
    }
    @FXML
    void volverClick(MouseEvent event){
        App.nuevaVentana(event,"MenuPrincipal","Descartes");
    }

}
