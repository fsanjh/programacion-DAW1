
package com.mycompany.ejexcepciones2nums;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author fsanj
 */
public class EjExcepciones2Nums {
    
    public static int leerEntero(){
        do{
            System.out.print("Introduce un número entero: ");
            try{
                return input.nextInt();
            }catch(InputMismatchException er1){
                System.out.println("ERROR: valor no permitido");
            }finally{
                input.nextLine();
            }
        }while(true);
    }
    public static double leerDouble(){
        do{
            System.out.print("Introduce un número con decimales: ");
            try{
                return input.nextDouble();
            }catch(InputMismatchException er2){
                System.out.println("ERROR: valor no permitido");
            }finally{
                input.nextLine();
            }
        }while(true);
    }
    
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int x = leerEntero();
        int y = leerEntero();
        double m = leerDouble();
        double n = leerDouble();
        System.out.print("Introduce una cadena de texto: ");
        String s = input.nextLine();
        
        System.out.println();
        System.out.println("Primer int introducido-> "+ x);
        System.out.println("Segundo int introducido-> "+ y);
        System.out.println("Primer double introducido-> "+ m);
        System.out.println("Segundo double introducido-> "+ n);
        System.out.println("String introducido-> "+ s);
        
        
        
        
        
        
    }
}
