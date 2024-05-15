module com.mycompany.javafxgestionarpersonas {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.javafxgestionarpersonas to javafx.fxml;
    opens Models to javafx.base;
    exports com.mycompany.javafxgestionarpersonas;
}
