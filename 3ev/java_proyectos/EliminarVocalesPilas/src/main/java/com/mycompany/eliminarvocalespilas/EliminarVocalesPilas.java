
package com.mycompany.eliminarvocalespilas;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author fsanj
 */
public class EliminarVocalesPilas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Character> pilaCadena = new Stack();
        String cadena;
        
        System.out.print("Introduce una cadena: ");
        cadena = input.nextLine();
        
        System.out.print("Cadena sin vocales: ");
        for(int i = 0; i < cadena.length() ; i++){
            pilaCadena.push(cadena.charAt(i));
            if("aeiouAEIOU".contains(String.valueOf(pilaCadena.peek()))){
                pilaCadena.pop();
            }else{
                System.out.print(pilaCadena.peek());
            }
        }
        
        
        
        
    }
}
