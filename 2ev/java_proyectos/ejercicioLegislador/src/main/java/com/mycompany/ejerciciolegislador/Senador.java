package com.mycompany.ejerciciolegislador;

/**
 *
 * @author Nocturno
 */
public class Senador extends Legislador{


    public Senador(String nombre, String apellido, int Edad, String provincia){
        super(nombre, apellido, Edad, provincia);
    }
   
    
    public String getCamara(){
        return "Senador";
    }
    
}
