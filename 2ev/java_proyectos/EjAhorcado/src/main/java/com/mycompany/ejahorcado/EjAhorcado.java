package com.mycompany.ejahorcado;

import java.util.Scanner;

/**
 *
 * @author fsanj
 */
public class EjAhorcado{

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Ahorcado a = new Ahorcado();
        while(true){
            String opcion = a.menu();
            if(opcion.equals("1")){
                a.juego();
            }else if(opcion.equals("2")){
                break;
            }else{
                System.out.println("Ingrese una opción válida");
            }
        }
        input.close();
        
        
        

    }
}
