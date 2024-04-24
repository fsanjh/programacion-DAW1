
package com.mycompany.palabrainvertidapilas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author fsanj
 */
public class PalabraInvertidaPilas {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        Stack<Character> pilaPalabra = new Stack<Character>();
        Queue <Character> colaPalabra = new LinkedList<>();
        String palabra;
        
        System.out.print("Introduce una cadena: ");
        palabra = input.nextLine();
        
        System.out.print("Cadena invertida con pilas: ");
        for(int i = palabra.length() - 1; i > -1 ; i--){
            pilaPalabra.push(palabra.charAt(i));
            System.out.print(pilaPalabra.pop());
        }
        
        System.out.print("\nCadena invertida con colas: ");
        for(int i = palabra.length() - 1; i > -1 ; i--){
            colaPalabra.add(palabra.charAt(i));
            System.out.print(colaPalabra.poll());
        }
    }
}
