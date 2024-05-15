package com.mycompany.javafxform1;

import java.io.IOException;
import java.io.ObjectInputStream;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField fieldNombre;
    @FXML
    private TextField fieldApellido;
    @FXML
    private ChoiceBox<?> selectYear;
    @FXML
    private Button btnMostrar;
    @FXML
    private TextArea fieldDatos;
    
       

    
    @FXML
    private void mostrarDatos(ActionEvent event){
        fieldDatos.setText("Nombre: "+ fieldNombre.getText() +" | Apellido: "+ fieldApellido.getText() +" | Año Nacimiento: "+ selectYear.getAccessibleText());
        
    }

    
    
    
    
}
