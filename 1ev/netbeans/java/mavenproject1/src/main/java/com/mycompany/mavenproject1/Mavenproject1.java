/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author Nocturno
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        
        //Calcular porcentaje chicos y chicas
        /*
        Scanner input = new Scanner (System.in);
        float ninas , ninos;
        System.out.println("¿Cuántos alumnos hay?");
        ninos = input.nextFloat();
        System.out.println("¿Cuántos alumnas hay?");
        ninas = input.nextFloat(); 
        float total = ninos + ninas;
        float porNinos = (ninos/total) * 100;
        System.out.println("Total de alumn@s es: " + Math.round(total) + ", el porcentaje de chicos es: " + Math.round(porNinos) + "% y de chicas es: " + Math.round((100 - porNinos)) + "%" );
        */
    /*-----------------------------------------------------------------------*/
        //Calcular IMC
        /*
        Scanner input = new Scanner (System.in);
        double masa, altura, imc;
        
        System.out.print("Introduce tu altura en cm: ");
        altura = input.nextFloat() / 100; //Pasa la altura a metros
        System.out.print("Introduce tu peso en kg: ");
        masa = input.nextFloat();
        
        imc = masa / (Math.pow(altura, 2));
        
        System.out.println("Su Indice de Masa Corporal es de: " + String.format("%.2f", imc));
        */
    /*-----------------------------------------------------------------------*/    
       /* //Temperatura en Celsius a Fahrenheit
        Scanner input = new Scanner (System.in);
        Double t;
         System.out.println("Dime la temperatura en Celsius: ");
        t = input.nextDouble();
         System.out.println("La temperatura en Fahrenheit sería: " + (t * 9/5 + 32) + "ºF");
        
     /*--------------------------------------------------------------------*/
       /*
       Scanner input= new Scanner (System.in);
        double h;
        System.out.print("Cuantas horas al dia trabajas?");
        h = input.nextDouble();
        double Euro=(h*9);
        double M= (Euro*6)*4;
        System.out.println("Al mes cobras: "+ M +"y al año: " + M*12 + "€");
       */
       /*
        Scanner input = new Scanner (System.in);
        double horas, total;
        System.out.print("Número de horas trabajadas al día: ");
        horas = input.nextDouble();
        total = horas * 9;
        
        System.out.println("Al día cobras: " + total + "€");
        total = total * 6;
        System.out.println("A la semana cobras: " + total + "€");
        total = total * 4;
        System.out.println("Al mes cobras: " + total + "€");
        total = total * 12;
        System.out.println("Al año cobras: " + total + "€");
         */      
    /*--------------------------------------------------------------------*/
    
        //Math. sen, cos y toRadians
        /*
        double numero = 90;
        
        System.out.println("El seno de " + numero + "º es " + String.format("%.2f", Math.sin(numero)));
        System.out.println("El cos de " + numero + "º es " + String.format("%.2f", Math.cos(numero)));
        System.out.println("El Radians de " + numero + "º es " + String.format("%.2f", Math.toRadians(numero)));
        
        System.out.println("El seno de " + numero + "º es " + Math.round(Math.sin(numero)));
        System.out.println("El cos de " + numero + "º es " + Math.round(Math.cos(numero)));
        System.out.println("El Radians de " + numero + "º es " + Math.round(Math.toRadians(numero)));
        //
        System.out.println("\n");
        
        double num= 50.4;
        System.out.println("Round: "+Math.round(num));
        System.out.println("Ceil: " + Math.ceil(num));
        System.out.println("Floor: " + Math.floor(num));
       */
    /*---------------------------------------------------------------------------------------------*/
        //Area de una elipse
        /*
        Scanner input = new Scanner (System.in);
        double r1, r2;
        
        System.out.print("Primer radio de la elipse: ");
        r1 = input.nextDouble();
        System.out.print("Segundo radio de la elipse: ");
        r2 = input.nextDouble();
        
        System.out.print("El área de la elipse es " + String.format("%.2f",Math.PI * r1 * r2));
        */
    /*-----------------------------------------------------------------------------*/    
        //Area de un sector circular
        Scanner input = new Scanner (System.in);
        double r, g;
        
        System.out.print("Radio del círculo: ");
        r = input.nextDouble();
        System.out.print("Grados del sector: ");
        g = input.nextDouble();
        System.out.print("El area del sector circular es de " + (Math.PI * Math.pow(r, 2) * g / 360));
    }  
}