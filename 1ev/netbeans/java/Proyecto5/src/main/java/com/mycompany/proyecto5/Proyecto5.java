/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto5;

import java.util.Scanner;

/**
 *
 * @author Nocturno
 */
public class Proyecto5 {
    public static int suma(){
        int cont, resul;
        cont = 10;
        resul = 0;
        while(cont<31){
            if(cont % 2 == 0){
                resul = resul + cont;
               
                }
            cont++;
        }
        return resul;
    }
    
    public static int mult(){
        int cont, resul2;
        cont = 10;
        
        resul2 = 1;
        while(cont<31){
            if(cont % 2 == 0){
                
                resul2 = resul2 * cont;
                }
            cont++;
        }
        return resul2;
    }
    
    public static void main(String[] args) {
        /*
        System.out.println("Suma y producto de números pares entre 10 y 30");
 
        System.out.println("La suma es: "+ suma());
        System.out.println("El producto es: "+ mult());
        */
        //CharAt
        /*String cadena ="IES María Moliner";
        System.out.print(cadena.charAt(4));
        System.out.println(cadena.length());
        */
        /*
        Scanner input=new Scanner(System.in);
        String cadena;
        int cont = 0;
        System.out.println("Introduce una frase");
        cadena = input.nextLine();
        for(int i = 0; i<cadena.length(); i++){
            switch(cadena.toLowerCase().charAt(i)){
                case 'a', 'e', 'i', 'o', 'u' -> cont++;
            }
        }
        System.out.println("En la frase \""+ cadena +"\" hay "+ cont +" vocales");
        System.out.print(cadena.toUpperCase());
        */
        //Indicar cifras numero entero
        @SuppressWarnings("resource")
        Scanner input=new Scanner(System.in);
        int num;
        String numString;
        System.out.println("Introduce una frase");
        num = input.nextInt();
        numString = String.valueOf(num);
        for(int i = 0; i< numString.length() ; i++){
            if (numString.length() == 1){
                System.out.println("Hay una cifra");
                break;
            }else if(numString.length() == 1){
            
        }
            
            
            
            
            
            
            }
        }
        
        
        
        
        
        
    }

