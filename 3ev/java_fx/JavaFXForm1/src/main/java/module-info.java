module com.mycompany.javafxform1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.javafxform1 to javafx.fxml;
    exports com.mycompany.javafxform1;
}
