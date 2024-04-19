package org.manuel.dev.institutodescartes.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
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
        if (buscar.isEmpty()){
            App.showAlert(Alert.AlertType.ERROR,"Error","Ingresa el nombre/matricula del estudiante a editar.");
            return;
        }
        if (nombre.isEmpty() || id.isEmpty()){
            App.showAlert(Alert.AlertType.ERROR,"Error","Si vas a modificar algo llena los dos campos");
            return;
        }

        boolean exito = instituto.actualizarStudent(buscar,id,nombre);
        if (exito){
            App.showAlert(Alert.AlertType.INFORMATION,"Actualizar estudiante","El estudiante se actualizo con exito");
        }else {
            App.showAlert(Alert.AlertType.ERROR,"Actualizar estudiante","No se pudo actualizar, no se encontro el estudiante");
        }
    }

    @FXML
    void volverClick(MouseEvent event) {
        App.nuevaVentana(event,"MenuPrincipal","Descartes");
    }

}