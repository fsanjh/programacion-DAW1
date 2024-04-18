/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.palabras;

import java.util.Scanner;

/**
 *
 * @author Nocturno
 */
public class Palabras {

    public static void main(String[] args) {
        /*
        String Texto = "En Maria Moliner no hay Maria";
        String TextoBuscado = "Maria";
        int cont = 0;

        while (Texto.indexOf(TextoBuscado)>-1){
            Texto = Texto.substring(Texto.indexOf(TextoBuscado) + TextoBuscado.length(), Texto.length());
            cont ++;
        }
        System.out.println("En el María moliner hay "+ cont + " gramos de Maria");
        */
        /*        
        String textOriginal = "Este es un ejemplo motherfucker";
        String textReemplazado = textOriginal.replace("motherfucker", "de texto");
        System.out.println("Texto reemplazado "+textReemplazado);
        */
        
        Scanner input = new Scanner (System.in);
        String palabra;
        String palabra2 = "";
        
        System.out.print("Escriba una palabra: ");
        palabra = input.nextLine();
        for(int i = palabra.length(); i > 0; i--){
            palabra2 = palabra2 + palabra.charAt(i-1);
        }
        if (palabra.equalsIgnoreCase(palabra2)){
            System.out.println("\""+ palabra +"\" es una palabra/frase palíndroma ");
        }else {
            System.out.println("\""+ palabra +"\" NO es una palabra/frase palíndroma");
        }
        
    }
}
