package com.mycompany.trabajandoconenumerados;

import java.util.Scanner;

/**
 *
 * @author fsanj
 */
public class TrabajandoConEnumerados {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char res;
        Mazo mazo = new Mazo();
        
        mazo.imprimirMazo();
        
        int puntos = 0;
        do{
            System.out.print("¿Quieres sacar una carta del mazo? [S/n]: ");
            res = input.next().toLowerCase().charAt(0);
            if(res != 's'){
                break;
            }
            puntos += mazo.sacarCarta();
        }while(res == 's');
        System.out.println("\nHas conseguido un total de "+ puntos +" puntos");
        
    }
}
