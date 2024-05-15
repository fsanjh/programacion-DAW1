package com.mycompany.javafxsumar;

import Modulos.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;

/**
 * FXML Controller class
 *
 * @author fsanj
 */
public class CalculadoraController implements Initializable{

    @FXML
    private TextField num1;
    @FXML
    private TextField num2;
    @FXML
    private TextField resultField;
    @FXML
    private GridPane slctOperacion;
    @FXML
    private RadioButton rdSumar;
    @FXML
    private RadioButton rdMulti;
    @FXML
    private RadioButton rdRestar;
    @FXML
    private RadioButton rdDividir;
    @FXML
    private Button btnOperar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb){
        ToggleGroup tg = new ToggleGroup();
        rdSumar.setToggleGroup(tg);
        rdRestar.setToggleGroup(tg);
        rdMulti.setToggleGroup(tg);
        rdDividir.setToggleGroup(tg);
    }    

    @FXML
    private void operar(ActionEvent event){
        try{
            String a = num1.getText();
            double n1 = Double.parseDouble(num1.getText());
            double n2 = Double.parseDouble(num2.getText());
            double resultado = 0;
            if(rdSumar.isSelected()){
                Suma suma = new Suma(n1, n2);
                resultado = suma.sumar();
                resultField.setText(String.valueOf(resultado));
            }else if(rdRestar.isSelected()){
                Resta resta = new Resta(n1, n2);
                resultado = resta.restar();
                resultField.setText(String.valueOf(resultado));
            }else if(rdMulti.isSelected()){
                Multiplicacion mult = new Multiplicacion(n1, n2);
                resultado = mult.multiplicar();
                resultField.setText(String.valueOf(resultado));
            }else if(rdDividir.isSelected()){
                if(n2 != 0){
                    Division div = new Division(n1, n2);
                    resultado = div.dividir();
                    resultField.setText(String.valueOf(resultado));
                }else{
                    Alert alerta = new Alert(Alert.AlertType.ERROR);
                    alerta.setTitle("División entre 0");
                    alerta.setContentText("No se pueden realizar divisiones reales entre 0");
                    alerta.showAndWait();
                    resultField.setText("∞");
                }
            }
        
        }catch(NumberFormatException ex1){
            Alert alerta = new Alert(Alert.AlertType.WARNING);
            alerta.setTitle("Valores no permitidos");
            alerta.setContentText("Introduzca únicamente números");
            alerta.showAndWait();
        }
        
        
        
    }
    
}
