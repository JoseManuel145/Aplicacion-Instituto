module org.manuel.dev.institutodescartes {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.manuel.dev.institutodescartes to javafx.fxml;
    exports org.manuel.dev.institutodescartes;
    exports org.manuel.dev.institutodescartes.controllers;
    opens org.manuel.dev.institutodescartes.controllers to javafx.fxml;
    exports org.manuel.dev.institutodescartes.models;
    opens org.manuel.dev.institutodescartes.models to javafx.fxml;
}