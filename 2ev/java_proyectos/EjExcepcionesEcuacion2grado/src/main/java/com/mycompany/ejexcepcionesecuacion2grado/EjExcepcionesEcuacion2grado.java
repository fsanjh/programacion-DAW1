package com.mycompany.ejexcepcionesecuacion2grado;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author fsanj
 */
public class EjExcepcionesEcuacion2grado{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double a, b, c;
        char res = ' ';
        System.out.println("Introduce los valores de la ecuación de segundo grado [ax^2 + bx + c]");
        try{
            System.out.print("Valor de a: ");
            a = input.nextDouble();
            System.out.print("Valor de b: ");
            b = input.nextDouble();
            System.out.print("Valor de c: ");
            c = input.nextDouble();
            if(a == 0){
                throw new Exception("No es una ecuación de segundo grado");
            }
            try{
                if((Math.pow(b, 2) - 4 * a * c) > 0){
                    throw new Exception("La ecuación tiene dos soluciones posibles ¿Quiere continuar?[S/n]");
                }else{
                    System.out.println("Solución: " + String.format("%.2f", -b/(2*a)));
                }
            }catch(Exception ex2){
                do{
                    System.out.println(ex2.getMessage());
                    System.out.print("Respuesta: ");
                    res = input.next().toLowerCase().charAt(0);
                    if(res != 's' && res != 'n'){
                        System.out.println("Introduzca una respuesta válida [S/n]");
                    }
                }while(res != 's' && res != 'n');
                if(res == 's'){
                    System.out.println("Primera solución: " + String.format("%.2f", ((-b) + Math.sqrt(Math.pow(b, 2) - (4*a*c))) / (2*a)));
                    System.out.println("Segunda solución: " + String.format("%.2f", ((-b) - Math.sqrt(Math.pow(b, 2) - (4*a*c))) / (2*a)));
                }
            }
        }catch(InputMismatchException er){
            System.out.println("ERROR - Razón: Introduzca un valor válido");
            input.nextLine();
        }catch(Exception ex){
            System.out.println("Excepción: " + ex.getMessage());
        }

    }
}
