package com.mycompany.javafxgestionarpersonas;

import Models.Persona;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author fsanj
 */
public class PersonaController implements Initializable{

    @FXML
    private TextField fieldNombre;
    @FXML
    private TextField fieldApellido;
    @FXML
    private TextField fieldEdad;
    @FXML
    private Button btnAdd;
    @FXML
    private TableView<Persona> tablaPersonas;
    @FXML
    private TableColumn<Persona, String> colNombre;
    @FXML
    private TableColumn<Persona, String> colApellidos;
    @FXML
    private TableColumn<Persona, Integer> colEdad;
    
    private ObservableList<Persona> personas;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb){
        personas = FXCollections.observableArrayList();
        tablaPersonas.setItems(personas);
        this.colNombre.setCellValueFactory(new PropertyValueFactory("nombre"));
        this.colApellidos.setCellValueFactory(new PropertyValueFactory("apellidos"));
        this.colEdad.setCellValueFactory(new PropertyValueFactory("edad"));
        
        
        
    }    

    @FXML
    private void agregarPersona(ActionEvent event){
        Alert alerta = new Alert(Alert.AlertType.NONE);
        try{
            String nombre = fieldNombre.getText();
            String apellidos = fieldApellido.getText();
            int edad = Integer.parseInt(fieldEdad.getText());
            
            Persona p = new Persona(nombre, apellidos, edad);
            if(!personas.contains(p)){
                personas.add(p);
                tablaPersonas.setItems(personas);
            }else{
                alerta.setAlertType(Alert.AlertType.WARNING);
                alerta.setTitle("Persona repetida");
                alerta.setContentText("Los datos introducidos ya se encuentran en la tabla");
                alerta.showAndWait();
            }
        
        }catch(NumberFormatException nfe1){
            
        }
    }
    
}
