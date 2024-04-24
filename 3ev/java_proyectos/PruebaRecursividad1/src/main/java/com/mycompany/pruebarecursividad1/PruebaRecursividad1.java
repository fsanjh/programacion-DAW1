package com.mycompany.pruebarecursividad1;

import java.util.Scanner;

/**
 *
 * @author fsanj
 */
public class PruebaRecursividad1{

    public static void cuentaAtras(int n){
        if(n == 0){
            System.out.println("FINAL");
        }else{
            System.out.println(n);
            cuentaAtras(n - 1);
        }
    }

    public static int factorial(int n){
        n = Math.abs(n);
        int res = n;
        if(n == 1){
            return res;
        }else if(n == 0){
            return 1;
        }else{
            return res * factorial(n - 1);
        }
    }
    
    public static int suma(int n){
        return (n <= 1)?n : n+suma(n - 1);
    }
    
    public static void numsSuma(int n){
        System.out.print(n + " ");
        if(n != 1){
            numsSuma(n - 1);
        }
    }

    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int n;
        
        System.out.print("Introduce un número entero: ");
        n = input.nextInt();
        cuentaAtras(n);
        System.out.print("Factorial de "+ n +"-> "+ factorial(n));
        System.out.println("\nSuma de los numeros desde "+ n +" hasta 1: "+ suma(n));
        System.out.print("Números recorridos para la suma: ");
        numsSuma(n);
    }
}
