package com.mycompany.ejexcepcionedad;

/**
 *
 * @author fsanj
 */
public class Persona{
    private int edad;

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad) throws EdadInvalidaException{
        if(edad < 0){
            throw new EdadInvalidaException("La edad no puede ser negativa");
        }else{
            this.edad = edad;
        }
    }
    
    
    
    
}
