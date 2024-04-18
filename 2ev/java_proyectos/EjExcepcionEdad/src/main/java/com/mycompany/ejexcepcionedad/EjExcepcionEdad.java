package com.mycompany.ejexcepcionedad;

/**
 *
 * @author fsanj
 */
public class EjExcepcionEdad{

    public static void main(String[] args){
        try{
            Persona p = new Persona();
            p.setEdad(-20);
            System.out.println("Edad añadida");

        }catch(EdadInvalidaException ex){
            System.out.println("ERROR - Razón: " + ex.getMessage());

        }finally{
            System.out.println("Creación de persona terminada");
        }
    }
}
