package com.mycompany.javafxregistro;

import Modelos.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author fsanj
 */
public class RegistroController implements Initializable{

    @FXML
    private TextField fieldName;
    @FXML
    private TextField fieldEmail;
    @FXML
    private PasswordField fieldPass;
    @FXML
    private Button btnRegis;
    @FXML
    private RadioButton rdBD;
    @FXML
    private RadioButton rdFile;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb){
        ToggleGroup tg = new ToggleGroup();
        rdBD.setToggleGroup(tg);
        rdFile.setToggleGroup(tg);
    }    

    @FXML
    private void registrar(ActionEvent event){
        Cuenta cuenta = new Cuenta(fieldName.getText(), fieldEmail.getText(), fieldPass.getText());
        if(rdBD.isSelected()){
            registroBD(cuenta);
        }else if(rdFile.isSelected()){
            registroFichero(cuenta);
        }
        
        fieldName.setText("");
        fieldEmail.setText("");
        fieldPass.setText("");
        rdBD.setSelected(false);
        rdFile.setSelected(false);
    }
    
    private void registroBD(Cuenta cuenta){
        Alert alerta = new Alert(Alert.AlertType.NONE);
        BD bd = new BD();
        if(bd.insertar(cuenta)){
            alerta.setAlertType(Alert.AlertType.CONFIRMATION);
            alerta.setTitle("Éxito");
            alerta.setContentText("La cuenta se ha registrado correctamente en la base de datos");
            alerta.showAndWait();
        }else{
            alerta.setAlertType(Alert.AlertType.ERROR);
            alerta.setTitle("ERROR");
            alerta.setContentText("La cuenta ya se encuentra registrada en la base de datos");
            alerta.showAndWait();
        }
    }
    
    private void registroFichero(Cuenta cuenta){
        Alert alerta = new Alert(Alert.AlertType.NONE);
        Fichero fichero = new Fichero();
        if(fichero.escribir(cuenta)){
            alerta.setAlertType(Alert.AlertType.CONFIRMATION);
            alerta.setTitle("Éxito");
            alerta.setContentText("La cuenta se ha registrado correctamente en el fichero");
            alerta.showAndWait();
        }else{
            alerta.setAlertType(Alert.AlertType.ERROR);
            alerta.setTitle("ERROR");
            alerta.setContentText("La cuenta ya se encuentra registrada en el fichero");
            alerta.showAndWait();
        }
    
    }
    
}
