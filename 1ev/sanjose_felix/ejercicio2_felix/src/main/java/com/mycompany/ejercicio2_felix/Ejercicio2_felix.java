/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2_felix;

/**
 *
 * @author Félix San José Hernán
 */

import java.util.Random; //importo el Random
import java.util.Scanner; //importo el Scanner

public class Ejercicio2_felix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Declaro el escaner
        Random rnd = new Random(); //Declaro el randomiador
        final int intentos = 7; //Numero de intentos
        int opcion; //Variable que elije que opcion del array se elije
        
        String respuesta; //Respuesta del usuario
        String [] palabras = new String[5]; //Array de palabras
        char caracter; //Caracter de la respuesta
        boolean acierto = false; //variable booleana que indica si se gana o se pierde
        palabras[0]="JAVA"; palabras[1]="PASCAL"; palabras[2]="RUBY"; palabras[3]="JAVASCRIPT"; palabras[4]="HTML"; //Valores del array
        do{
            opcion = rnd.nextInt(5);
            String palabra = palabras[opcion], palabra2 = ""; //Palabra elegida
            char [] guiones = new char [palabra.length()]; //Array de guiones que se muestran
            for(int i = 0; i<guiones.length; i++){ //asigno los guiones en funcion del largo de la palabra
                guiones[i] = '_';
            }
            System.out.println("¡Adivina el lenguaje de programación o de marcado!");
            for(int l = 0; l < guiones.length; l++){ //muestro por primera ve los guiones 
                System.out.print(guiones[l] +" ");
            }
            System.out.println();
            for(int j = 0; j<intentos; j++){
                //Pido una letra
                System.out.print("Introduce una letra: ");
                respuesta = input.next();
                respuesta = respuesta.toUpperCase();
                 //En cualquier otro caso
                    caracter = respuesta.charAt(0); //caracter de la respuesta en la primera posicion
                    for(int k = 0; k < palabra.length(); k++){ //miro si ese caracter existe
                        if(caracter == palabra.charAt(k)){ //si existe cambio en guiones el "_" por la letra acertada
                            guiones[k] = caracter;
                            acierto =  true; //acierto = true para que el contador de intentos después no aumente
                        }
                    }
                if(acierto){ //al haber hacertado aún se tienen intentos
                    j--;
                }
                acierto = false; //para evitar errores reasigno acierto al false original
                palabra2 = "";
                for(int m = 0; m < palabra.length(); m++){
                    System.out.print(guiones[m] + " ");
                    palabra2 = palabra2 + guiones[m];
                }
                System.out.println();
                if(palabra2.equals(palabra)){ //Si se acertara finalmente la palabra
                    acierto = true;
                    break;
                }
            }
            //Si se sale del for con acierto = true muestro la victoria
            if(acierto){
                System.out.println("¡Enhorabuena! Has acetado la palabra "+ palabra);
            //Si se sale del for con acierto = false muestro la derrota
            }else{
                System.out.println("¡Oh vaya!¡Lo siento1 Agotaste tus intentos. La palabra era: "+ palabra);
            }
            System.out.println("Quiere continuar?? [s/n]");
            respuesta = input.next();
        }while(!"n".equals(respuesta));    
        
           
        
        
        
        
    }
}
