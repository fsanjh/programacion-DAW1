/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto11;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nocturno
 */
public class Proyecto11 {

    public static void main(String[] args) {
        //Numeros aleatorios entre el 5 y el 25
        /*
        int cont = 0;
        int rand;
        String resul = "";
        
        while(cont != 200){
            rand = (int)(Math.floor(Math.random()*(25-5+1)+5));
            resul = resul + " " + rand;
            
            cont++;
        }
        System.out.println(resul);
        */
        
        //Numeros aleatorios con libreria
        /*Random random = new Random();
        int rand;
        int cont = 0;
        while(cont != 50){
            rand = random.nextInt(100) + 1;
            System.out.println(rand);
            cont++;
        }
        */
        
        //Dados
        /*
        Random random = new Random();
        int rand;
        int cont = 0;
        while(cont < 5){
            rand = random.nextInt(6) + 1;
            System.out.println(rand);
            cont++;
        }*/
        
        //13 cerillas
        Random random = new Random();
        Scanner input = new Scanner (System.in);
        int num, cerillas = 13;
        boolean ganar=false;
        
        do{
            //Humano
            System.out.println("¿Cúantas cerillas quieres quitar?[1-3] \nRestantes: "+ cerillas);
            for(int i = 0; i < cerillas; i++){
                System.out.print("¡"); //Imprime las cerillas visualmente
            }
            System.out.println(); //Separación
            do{ //Verifica que la respuesta es entre 1 y 3
                num = input.nextInt();
                if (num>3 || num<1){
                    System.out.println("Valor no válido");
                }
            }while(num>3 || num<1);
            cerillas = cerillas - num; //Resta a las cerillas
            if (cerillas <= 0){ //Si las cerillas llegan a 0 o menos después del humano se pierde y se sale
                ganar = false;
                break;
            }
            //Máquina
            num = random.nextInt(3) + 1; //Número random
            System.out.println("Máquina- Yo quito "+ num );
            cerillas = cerillas - num; //Resta a las cerillas
            if (cerillas <= 0){ //Si las cerillas llegan a 0 o menos después de la máquina pierde y se sale
                ganar = true;
                break;
            }
        }while(cerillas > 0);
        
        if (ganar == false){
            System.out.println("Humano pierde, JA JA JA!");
        }else{
            System.out.println("Humano gana");
        }
        
        
        
        
    }
}
