module com.mycompany.javafxregistro {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;

    opens com.mycompany.javafxregistro to javafx.fxml;
    exports com.mycompany.javafxregistro;
}
