
package com.mycompany.excepciones1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author fsanj
 */
public class Excepciones1 {

    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        int num = 0;
        do{
            try{
                System.out.print("Escribe un numero, maricón: ");
                num = input.nextInt();
            }catch(InputMismatchException er){
                System.out.println("Puto analfabeto, mira que error a salido: "+ er);
                input.next();
                System.out.println("--------------------------------------------------------------------------");
            }finally{
                System.out.println("KOMANCHE LA CABRA ");
            }
        }while(num != 1234);
        */
        Scanner input = new Scanner(System.in);
        int numerador = 0;
        int denominador = 0;
        int resultado = 0;
        do{
            try{
                System.out.print("Introduce el numerador: ");
                numerador = input.nextInt();
                System.out.print("Introduce el denominador: ");
                denominador = input.nextInt();
                resultado = numerador / denominador;
            }catch(InputMismatchException er1){
                System.out.println("Debe introducir dos números enteros");
                resultado = 0;
                input.next();
            }catch(ArithmeticException er2){
                System.out.println("No se puede dividir entre 0");
                resultado = 0;
                //input.next();
            }
        }while(resultado == 0);
        System.out.println(numerador +"/"+ denominador+"= "+resultado);
    }
}
