module com.mycompany.javafxcalculadora {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.javafxcalculadora to javafx.fxml;
    exports com.mycompany.javafxcalculadora;
}
