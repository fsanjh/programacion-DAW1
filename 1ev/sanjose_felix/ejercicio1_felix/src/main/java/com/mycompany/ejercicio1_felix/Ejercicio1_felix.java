/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1_felix;

/**
 *
 * @author Félix San José Hernán
 */

import java.util.Scanner;   //Importo la libreria necesaria para el Scanner

public class Ejercicio1_felix {

    public static void solucion(int a, int b, int c){
        double resul; //Variable donde irá el resultado, al hacer directamente la operación en el println el resultado era erróneo
        
        //En caso de que el discrimentante sea menor que 0 muestra un mensaje
        if((Math.pow(b ,2) - 4*a*c) < 0){   
            System.out.println("El discriminante (b^2 - 4*a*c) es menor que 0, la ecuación no tiene soluciones reales");
        
        //En caso de que el discriminante sea igual a 0, muestra un mensaje con el resultado
        }else if ((Math.pow(b ,2) - 4*a*c) == 0){  
            resul = (-b/(2*a)); //Le asigno al resultado la operación
            System.out.println("El discriminante (b^2 - 4*a*c) es igual a 0, la operación sería -b/2*a= "+ resul );
        
        //En cualquier otro caso, es decir, discriminante mayor que 0, muestra las dos soluciones posibles con el resultado
        }else{ 
            System.out.println("El discriminante (b^2 - 4*a*c) es mayor que 0, las soluciones son:");
            //Operación con el "+"
            resul = ((-b) + Math.sqrt(Math.pow(b, 2) - (4*a*c))  ); //Le asigno al resultado la primera parte de la operación
            resul = resul / (2*a); //Termino de realiar la operación
            System.out.println("    1. Primera solución= "+ resul );

            //Operación con el "-"
            resul = ((-b) - Math.sqrt(Math.pow(b, 2) - (4*a*c))  ); //Le asigno al resultado la primera parte de la operación
            resul = resul / (2*a); //Termino de realiar la operación
            System.out.println("    2. Segunda solución= "+ resul );
        }
        System.out.println("Muchas gracias por utilizar la calculado, hasta luego"); //Mensaje de despedida
    }
    
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in); //Declaro el Scanner input para leer los datos introducidos por el usuario
        int a, b, c; //Variables a las que se le asignaran los numeros del usuario
        
        System.out.println("Bienvenido a la calculadora de ecuaciones cuadráticas"); //Mensaje de bienvenida
        //Pido al usuario valores
        System.out.println("Introduce los 3 valores ENTEROS [-1, 5, 0...] de la ecuación cuadrática (ax^2 + bx + c):");
        System.out.print("  Valor 'a': "); 
        a = input.nextInt();    //Leo el primer valor
        System.out.print("  Valor 'b': ");
        b = input.nextInt();    //Leo el segundo valor
        System.out.print("  Valor 'c': ");
        c = input.nextInt();    //Leo el terver valor
                
        solucion(a, b, c); //Llamada al procedimiento con los valores introducidos por el usuario
        
        
        
        
    }
}
