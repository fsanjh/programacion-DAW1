package com.mycompany.javafxcalculadora;

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

/**
 * FXML Controller class
 *
 * @author fsanj
 */
public class PrimaryController implements Initializable{

    @FXML
    private TextField fieldNum1;
    @FXML
    private TextField fieldNum2;
    @FXML
    private RadioButton radSum;
    @FXML
    private RadioButton radMult;
    @FXML
    private RadioButton radResta;
    @FXML
    private RadioButton radDiv;
    @FXML
    private Button btnCalc;
    @FXML
    private TextField fieldResult;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb){
        ToggleGroup tg = new ToggleGroup();
        radSum.setToggleGroup(tg);
        radResta.setToggleGroup(tg);
        radMult.setToggleGroup(tg);
        radDiv.setToggleGroup(tg);
    }

    @FXML
    private void calcular(ActionEvent event){
        Alert alerta = new Alert(Alert.AlertType.NONE);
        try{
            double n1 = Double.parseDouble(fieldNum1.getText());
            double n2 = Double.parseDouble(fieldNum2.getText());
            double res = 0;

            if(radSum.isSelected()){
                res = n1 + n2;
                fieldResult.setText(String.valueOf(res));
            }else if(radResta.isSelected()){
                res = n1 - n2;
                fieldResult.setText(String.valueOf(res));
            }else if(radMult.isSelected()){
                res = n1 * n2;
                fieldResult.setText(String.valueOf(res));
            }else if(radDiv.isSelected()){
                if(n2 == 0){
                    alerta.setAlertType(Alert.AlertType.WARNING);
                    alerta.setTitle("División entre 0");
                    alerta.setContentText("No se pueden realizar divisiones entre 0");
                    alerta.showAndWait();
                    fieldResult.setText("∞");
                }else{
                    res = n1 / n2;
                    fieldResult.setText(String.valueOf(res));
                }
            }
        }catch(NumberFormatException ex1){
            alerta.setAlertType(Alert.AlertType.ERROR);
            alerta.setTitle("Valores no permitidos");
            alerta.setContentText("Solo se pueden realizar operaciones con números");
            alerta.showAndWait();
        }

    }

}
