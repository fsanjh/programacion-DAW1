module com.mycompany.javafxholamundo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.javafxholamundo to javafx.fxml;
    exports com.mycompany.javafxholamundo;
}
