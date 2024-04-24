/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto6;


/**
 *
 * @author Nocturno
 */
public class Proyecto6 {
    
    public static void main(String[] args) {
       // Funcion que sume dos numeros enteros
       int num1=5;
       int num2=8;
       int resultado = sumarNumeros (num1, num2);
       //Optimizacion
       System.out.println ("El resultado de la suma de "+num1+ " y "+num2+ " es "+resultado);
       System.out.println ("El resultado de la suma de "+num1+ " y "+num2+ " es "+sumarNumeros(num1, num2));
  }
    //Funciones por gramatica en Java, van debajo del "public static void main"
    public static int sumarNumeros(int num1, int num2){
        return num1+num2;      
    }
}
