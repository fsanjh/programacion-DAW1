package com.mycompany.ejerciciolegislador;

/**
 *
 * @author Nocturno
 */
public class Diputado extends Legislador{

   
    public Diputado(String nombre, String apellido, int Edad, String provincia){
        super(nombre, apellido, Edad, provincia);
    }
    
    public String getCamara(){
        return "Diputado";
    }
    
    
    
    
    
    
}
