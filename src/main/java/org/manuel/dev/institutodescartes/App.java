package org.manuel.dev.institutodescartes;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.manuel.dev.institutodescartes.models.Instituto;

import java.io.IOException;

public class App extends Application {
    private static final Instituto instituto = new Instituto();

    public static Instituto getInstituto() {
        return instituto;
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("MenuPrincipal.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Descartes");
        stage.setScene(scene);
        stage.show();
    }
    public static void nuevaVentana(MouseEvent event, String fxmlFile, String stageTitle) {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxmlFile + ".fxml"));

        try {
            Pane root = fxmlLoader.load();
            Scene scene = new Scene(root);
            stage.setTitle(stageTitle);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Node source = (Node) event.getSource();
        stage = (Stage) source.getScene().getWindow();stage.close();
    }
    public static void main(String[] args) {
        launch();
    }
}