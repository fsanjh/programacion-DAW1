package com.mycompany.ejarraysexcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author fsanj
 */
public class EjArraysExcepciones{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int res = 0;
        boolean error;
        do{
            error = false;
            try{
                do{
                    error = false;
                    try{
                        System.out.print("Escriba el tamaño del array: ");
                        res = input.nextInt();
                    }catch(InputMismatchException er1){
                        System.out.println("Por favor, introduzca un número entero positivo");
                        error = true;
                        input.next();
                    }
                }while(error);
                int[] numeros = new int[res];
                for(int i = 0; i < numeros.length; i ++){
                    do{
                        error = false;
                        try{
                            System.out.print("Introduce un valor para la posición " + (i + 1) + ": ");
                            res = input.nextInt();
                        }catch(InputMismatchException er2){
                            System.out.println("Por favor, introduzca un número entero válido");
                            error = true;
                            input.next();
                        }
                        numeros[i] = res;
                    }while(error);
                }
                System.out.println("Array creado: ");
                System.out.print("  ");
                for(int i = 0; i < numeros.length; i ++){
                    System.out.print(numeros[i] + " ");
                }
                System.out.println();

            }catch(NegativeArraySizeException er3){
                System.out.println("Por favor, introduzca un número entero positivo");
                error = true;
            }
        }while(error);

        
        
        
        
        
    }
}
