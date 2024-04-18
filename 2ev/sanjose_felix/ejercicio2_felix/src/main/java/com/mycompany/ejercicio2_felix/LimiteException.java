package com.mycompany.ejercicio2_felix;

/**
 *
 * @author fsanj
 */

//Excepcion personalizada del metodo probabilidadesVictoria de la clase Partido
public class LimiteException extends Exception{

    public LimiteException(String mensaje){
        super(mensaje);
    }
    
}
