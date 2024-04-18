/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto4;
import java.util.Scanner;

/**
 *
 * @author Nocturno
 */
public class Proyecto4 {
public static int calcularFibnonacciIterativo(int repeticiones){
int numpr=0; int numseg=1; int numtre; int cont=0;
while (cont<repeticiones){
         System.out.println(numpr +  "");
         numtre=numpr+numseg;
         numpr=numseg;
         numseg=numtre;
           
         
         cont++;
     }
    return 0;
}
    public static void main(String[] args) {
 /*       Scanner input = new Scanner (System.in);
        System.out.println("Numeros primos del 1 al 100");
        int RangoMen = 0; int RangoMay=100; 
      
        for(cont = RangoMen;cont<=100; RangoMen++){
           if (RangoMen%2!=0){
               System.out.println(RangoMen+  " ");
               
           }     
           
        }
     * 
        do {
            RangoMen++;
            if (RangoMen%2==0){
                System.out.println(RangoMen);
                }
        } while (RangoMen!=RangoMay); {
    }
  
     */  /*
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
        
     */
     
     Scanner input = new Scanner (System.in);
     System.out.println("Cuantos numeros de la sucesion de fibonacci quieres ver?"); 
    // int cont, numpr; cont = numpr = 0;
    //  int numseg=1; int numtre;
     int repeticiones;
     repeticiones = input.nextInt();
     if (repeticiones < 0){
         System.out.println("Repeticiones negativas no permitidas");     
     }else if (repeticiones == 0){
         System.out.println("No hay valores en una repetición de 0");
     }else if (repeticiones == 1){
         System.out.println("0");
    }else if(repeticiones == 2){
        System.out.println("0 1");
    }else{
     calcularFibnonacciIterativo (repeticiones);
    }
        
     
     
     
     
    }
   }
