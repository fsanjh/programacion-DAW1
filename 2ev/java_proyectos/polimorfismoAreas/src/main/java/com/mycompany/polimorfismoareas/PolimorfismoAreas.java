/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polimorfismoareas;

import java.util.Scanner;

/**
 *
 * @author Nocturno
 */
public class PolimorfismoAreas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int res = 0;
        
        while(res < 5){
            System.out.println("De que figura quieres calcular su área:");
            System.out.println("    1- Rectángulo");
            System.out.println("    2- Triángulo");
            System.out.println("    3- Círculo");
            System.out.println("    4- Otro");
            System.out.println("   +5- Salir");
            System.out.print("Respuesta: ");
            res = input.nextInt();
            switch(res){
                case 1 -> {
                    Figura f1 = new Rectangulo();
                    f1.area();
                    break;
                }
                
                case 2 -> {
                    Figura f2 = new Triangulo();
                    f2.area();
                    break;
                }
                    
                case 3 -> {
                    Figura f3 = new Circulo();
                    f3.area();
                    break;                    
                }
                case 4 -> {
                    Figura f4 = new Figura();
                    f4.area();
                    break;
                }
                default -> System.out.println("xao");
            }
        }
        
        
        
        
        
    }
}
