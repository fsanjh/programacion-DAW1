package com.mycompany.javafxholamundo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author fsanj
 */
public class PrimaryController implements Initializable{

    @FXML
    private Label labelHolaMundo;
    @FXML
    private Label labelPregunta;
    @FXML
    private TextField fieldNombre;
    @FXML
    private Button btnHola;
    @FXML
    private Label labelSaludo;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb){
        // TODO
    }

    @FXML
    private void saludar(ActionEvent event){
        String nombre = fieldNombre.getText();
        labelSaludo.setText("Hola "+ nombre);
        
    }
    
    
    
}
