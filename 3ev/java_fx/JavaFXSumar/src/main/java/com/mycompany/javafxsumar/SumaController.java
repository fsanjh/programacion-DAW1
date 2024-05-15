package com.mycompany.javafxsumar;

import Modulos.Suma;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author fsanj
 */
public class SumaController implements Initializable{

    @FXML
    private TextField num1;
    @FXML
    private TextField num2;
    @FXML
    private Button btnSumar;
    @FXML
    private TextField resultField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb){
        // TODO
    }    

    @FXML
    private void sumar(ActionEvent event){
        try{
            double n1 = Double.parseDouble(num1.getText());
            double n2 = Double.parseDouble(num2.getText());
            Suma suma = new Suma(n1, n2);
            double resultado = suma.sumar();
            resultField.setText(String.valueOf(resultado));

            
        
        }catch(NumberFormatException e1){
            Alert alerta = new Alert(Alert.AlertType.WARNING);
            alerta.setTitle("Te has cagado encima");
            alerta.setContentText("Eso no son numeros, notas");
            alerta.showAndWait();
        
        }
        
        
        
    }
    
}
