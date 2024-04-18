package com.mycompany.principalrect;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author fsanj
 */
public class PrincipalRect{

    public static void main(String[] args){
        /*
        Rectangulo r1 = new Rectangulo(8, 3);
        Rectangulo r2 = new Rectangulo(4, 2);
        
        r1.mostrarDatos();
        r1.visualizar();
        System.out.println("Area: "+ r1.calcularArea());
        r1.visualizar(20);
        System.out.println();
        r1.setAncho(10);
        r1.setAlto(4);
        r1.mostrarDatos();
        r1.visualizar();
        System.out.println("Area: "+ r1.calcularArea());
        */
        /*
        System.out.println("------------------------------------");
        r2.mostrarDatos();
        r2.visualizar();
        System.out.println("Area: "+ r2.calcularArea());
        r2.visualizar(5);
        System.out.println();
        r2.setAncho(2);
        r2.setAlto(4);
        r2.mostrarDatos();
        r2.visualizar();
        System.out.println("Area: "+ r2.calcularArea());
        */
        /*
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        Rectangulo r3 = new Rectangulo(4, 4);
        r3.mostrarDatos();
        r3.visualizar();
        r3.calcularArea();
        */

        Scanner input = new Scanner(System.in);
        int lado, base;
        try{
            System.out.print("Introduce el lado del rectángulo: ");
            lado = input.nextInt();
            System.out.print("Introduce la base del rectángulo: ");
            base = input.nextInt();
            Rectangulo r1 = new Rectangulo(base, lado);
            r1.mostrarDatos();
            r1.visualizar();
            System.out.println("Area: " + r1.calcularArea());
        }catch(NumeroNegativo er){
            System.out.println(er.getMessage());
        }catch(InputMismatchException er2){
            System.out.println("No se ha introducido un número");
        }finally{
            System.out.println("----------------------------FIN----------------------------");
        }

    }
}
