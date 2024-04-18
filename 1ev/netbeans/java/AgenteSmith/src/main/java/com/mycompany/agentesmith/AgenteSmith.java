/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.agentesmith;

import java.util.Scanner;

/**
 *
 * @author Nocturno
 */
public class AgenteSmith {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nombre, respuesta;
        double gasto1, gasto2, gasto3;
        
        System.out.println("Smith- Bienvenido. ¿cómo se llama?");
        System.out.print("Usuario- ");
        nombre = input.next();
        
        System.out.println("Smith- Buenos días, "+ nombre);
        System.out.println("Smith- ¿Qué tal día ha tenido? (Bueno/malo)");
        System.out.print(nombre +"- ");
        respuesta = input.next();
        respuesta = respuesta.toLowerCase();
        if ("bueno".equals(respuesta)){
            System.out.println("Smith- Me alegro mucho");
        }else if("malo".equals(respuesta)){
            System.out.println("Smith- Vaya, lo siento");
        }else{
            System.out.println("Smith- No entiendo, si es algo bueno me alegro, si es algo malo lo siento mucho");
        }
        System.out.println("");
        
        do{
            System.out.println("Smith- Bueno, ¿qué tarea desea hacer ahora? (a, b o c)");
            System.out.println("       (a) Agenda.");
            System.out.println("       (b) Ver gastos.");
            System.out.println("       (c) El tiempo.");
            System.out.print(nombre +"- ");
            respuesta = input.next();
            respuesta = respuesta.toLowerCase();

            switch (respuesta) {
                case "a" -> {
                    System.out.println("         AGENDA");
                    System.out.println("----------------------------");
                    System.out.println("Iván:    666 66 66 66");
                    System.out.println("Elena:   676 76 76 76");
                    System.out.println("Alan:    999 99 99 99");
                    System.out.println("Georgi:  696 96 96 96");
                }
                
                case "b" -> {
                    gasto1 = 2.50;
                    gasto2 = 3.50;
                    gasto3 = 1.60;
                    System.out.println("         GASTOS");
                    System.out.println("----------------------------");
                    System.out.println("1- Patatas:     "+ String.format("%.2f", gasto1) +"€");
                    System.out.println("2- Tomates:     "+ String.format("%.2f", gasto2) +"€");
                    System.out.println("3- Zanahorias:  "+ String.format("%.2f", gasto3) +"€");
                    System.out.println("    -----------------------");
                    System.out.println("         SUMA: "+ String.format("%.2f", (gasto1+gasto2+gasto3)) +"€");
                    System.out.println("    Desglose");
                    System.out.println("       de IVA: "+ String.format("%.2f", (gasto1+gasto2+gasto3)-((gasto1+gasto2+gasto3)/1.21)) +"€");
                    System.out.println("    -----------------------");
                    System.out.println("         TOTAL: "+ String.format("%.2f", (gasto1+gasto2+gasto3)/1.21)  +"€");
                }
                
                case "c" -> {
                    System.out.println("Smith- ¿El tiempo lo quieres para Segovia o para Cádiz?");
                    System.out.print(nombre +"- ");
                    respuesta = input.next();
                    respuesta = respuesta.toLowerCase();
                    if ("segovia".equals(respuesta)){
                        System.out.println("Smith- En Segovia hace una temperatura de 8.0ºC y hay un 22% de precipitaciones.");
                    }else if("cadiz".equals(respuesta) || "cádiz".equals(respuesta)){
                        System.out.println("Smith- En Cádiz hace una temperatura de 18.0ºC y hay un 2% de precipitaciones.");
                    }else {
                        System.out.println("Smith- No tengo datos de esa ciudad.");
                    }
                }
                
                default -> System.out.println("Smith- No es una opción válida");
            }
            
            System.out.println("_____________________________________");
            System.out.println("Smith- ¿Desea realizar algo más?[S/n]");
            respuesta = input.next();
            respuesta = respuesta.toLowerCase();
            System.out.println("");
        
        }while("s".equals(respuesta));
        System.out.println("Smith- Gracias por utilizar mis servicios, "+ nombre +". Que tenga un buen día.");
        
        
        
        
    }
}
