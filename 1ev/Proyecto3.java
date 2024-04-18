/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto3;

/**
 *
 * @author Nocturno
 */
public class Proyecto3 {

    public static void main(String[] args) {
    
        int prim, num, resul, divisores;
        prim = resul = num = divisores = 0;
        while(prim<51){
            for (int i=1; i<=num; i++){
                if(num % i == 0){
                    divisores ++;
                }
            }
            if(divisores == 2){
                System.out.print(resul +" + "+ num +"= ");
                resul = resul + num;
                System.out.println(resul);
                prim++;
                }
            num++;
        }
        System.out.println("La suma de los primeros 50 números primos es: "+ resul);
    }
}
