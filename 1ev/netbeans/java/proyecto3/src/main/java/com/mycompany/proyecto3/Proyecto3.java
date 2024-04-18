/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto3;

import java.util.Scanner;

/**
 *
 * @author Nocturno
 */
public class Proyecto3 {

    public static void main(String[] args) {
        /*int prim, num, resul, divisores;
        num = resul = divisores = 0;
        prim = 1;
        while(prim<51){
            for (int i=1; i<=num; i++){
                if(num % i == 0){
                    divisores++;
                }
            }
            if(divisores == 2){
                System.out.print(prim +": "+resul +" + "+ num +"= ");
                resul = resul + num;
                System.out.println(resul);
                prim++;
                }
            num++;
            divisores = 0;
        }
        System.out.println("La suma de los primeros 50 números primos es: "+ resul);*/
        /*
        int cont, num, resul;
        num = resul = 0;
        cont = 1;
        System.out.println("Suma primeros 50 números impares");
        while(cont<51){
            if(num % 2 != 0){
                System.out.print(cont +": "+ resul +" + "+ num +"= ");
                resul = resul + num;
                System.out.println(resul);
                cont++;
                }
            num++;
        }
        System.out.println("La suma de los primeros 50 números impares es: "+ resul);
        */
        /*
        Scanner input = new Scanner (System.in);
        int num1, divisores;
        divisores = 0;
        
        System.out.print("Dime un número entero: ");
        num1 = input.nextInt();
        for(int i = 2; i<num1 + 1; i++){
            if (num1%i == 0){
                divisores ++;
                if (divisores > 1){
                    break;
                }
            }
        }
        if (divisores == 1){
            System.out.println(num1 +" es un número primo");
        }else{
            System.out.println(num1 +" no es un número primo");
        }
        */
        
        
        Scanner input = new Scanner (System.in);
        int num1, num2, sum1, sum2;
        sum1 = sum2 = 0;
        
        System.out.println("Dime un número:");
        num1 = input.nextInt();
        System.out.println("Dime otro número:");
        num2 = input.nextInt();
        
        System.out.println("Divisores de "+ num1);
        for (int i=1; i<num1; i++){
            if (num1 % i == 0){
                System.out.print("  "+ i);
                sum1= sum1 + i;
            }
        }
        System.out.println("= "+ sum1);
        System.out.println("Divisores de "+ num2);
        for (int i=1; i<num2; i++){
            if (num2 % i == 0){
                System.out.print("  "+ i);
                sum2= sum2 + i;
            }
        }
        System.out.println("= "+ sum2);
        if ((sum1 == num2) && (sum2 == num1)){
            System.out.println("Los números "+ num1 +" y "+ num2 +" son números amigos");
        }else{
            System.out.println("Los números "+ num1 +" y "+ num2 +" NO son números amigos");
        }
        
        /*
        String cadena = "abcdefg";
        System.out.println(cadena.charAt(0)); //Imprime la a
        System.out.println(cadena.charAt(2)); //Imprime c
        */
        
        
        
        
        
        
        
        
        
        
    }
}
