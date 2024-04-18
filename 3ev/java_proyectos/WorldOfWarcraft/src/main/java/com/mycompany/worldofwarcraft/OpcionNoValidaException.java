package com.mycompany.worldofwarcraft;

/**
 * @author fsanj
 */

/**
 * Excepción personalizada para manejar casos de opciones no válidas en el juego World of Warcraft.
 */
public class OpcionNoValidaException extends Exception{

    /**
     * Constructor de la clase OpcionNoValidaException.
     * @param mensaje Mensaje de error asociado a la excepción.
     */
    public OpcionNoValidaException(String mensaje){
        super(mensaje);
    }
    
}
