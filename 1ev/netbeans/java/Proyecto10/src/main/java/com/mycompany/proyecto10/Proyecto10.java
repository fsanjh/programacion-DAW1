/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto10;

import java.util.Scanner;

/**
 *
 * @author Nocturno
 */
public class Proyecto10 {
    public static int contarPalabras(String frase){
        int contLetras, contPalabras;
        contLetras = 0;
        if (frase.length()== 0){
            contPalabras = 0;
        }else{
            contPalabras = 1;
            while (frase.length() > contLetras){
                if(frase.charAt(contLetras) == ' '){
                    contPalabras ++;
                }
                contLetras ++;
            }
        }
        return contPalabras;
    }
    public static void main(String[] args) {
        /*Scanner sc = new Scanner (System.in);
        String frase;
        System.out.println("Digita una frase para contar las palabras");
        frase = sc.nextLine();
        frase = frase.trim();
        
        System.out.println("En la frase \""+ frase +"\" hay "+ contarPalabras(frase) +" palabra/s");*/
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String frase, frase2;
        frase2 = "";
        char letra;

        System.out.println("Escribe una frase:");
        frase = sc.nextLine();
        frase = frase.trim();

        for (int i = 0; i < frase.length(); i++) {
            if (i == 0 || frase.charAt(i - 1) == ' ') {
                letra = Character.toUpperCase(frase.charAt(i));
            } else {
                letra = frase.charAt(i);
            }
            frase2 = frase2 + letra;
        }
        System.out.println("La cadena transformada es:\n" + frase2);

        
    }
}