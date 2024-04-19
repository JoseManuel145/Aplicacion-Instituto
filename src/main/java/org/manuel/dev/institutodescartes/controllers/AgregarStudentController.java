<<<<<<<< HEAD:InstitutoDescartes/src/main/java/org/manuel/dev/institutodescartes/controllers/MenuPrincipalController.java
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
========
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
>>>>>>>> c686be66a30907b9899f90e60ae4dde7203989f4:src/main/java/org/manuel/dev/institutodescartes/controllers/AgregarStudentController.java
