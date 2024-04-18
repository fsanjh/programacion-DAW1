package com.mycompany.ejtriangulo;

//import java.util.Scanner;
/**
 *
 * @author fsanj
 */
public class EjTriangulo{

    public static void main(String[] args){
        /*
        Scanner input = new Scanner(System.in);
        double num;
        
        System.out.print("Escribe un número: ");
        num = Math.abs(input.nextDouble());
        //Triangulo
        for(int i = 0; i <= (int)num; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Triangulo invertido
        System.out.println();
        for(int i = (int)num - 1; i >= 0; i--){
            for(int j = i; j >= 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        //Triangulo invertido desplazado
        System.out.println();
        for(int i = (int)num - 1; i>= 0; i--){
            for(int k = 1; k < (int)num - i; k++){
                System.out.print(" ");
            }
            for(int j = i; j >= 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        //Triangulo desplazado
        for(int i = 0; i <= (int)num; i++){
            for(int k = (int)num - i; k > 0; k--){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
         */

        Triangulo t1 = new Triangulo(6);
        t1.mostrarDatos();
        System.out.println("----------------------CERO---------------------");
        t1.visualizar();
        System.out.println("---------------------NOVENTA-------------------");
        t1.rotar();
        t1.visualizar();
        System.out.println("-----------------CIENTO OCHENTA----------------");
        t1.rotar();
        t1.visualizar();
        System.out.println("---------------DOSCIENTOS SETENTA--------------");
        t1.rotar();
        t1.visualizar();
        System.out.println("----------------------CERO---------------------");
        t1.rotar();
        t1.visualizar();
        
        System.out.println("-----------------CIENTO OCHENTA----------------");
        t1.establecerRotacion(Triangulo.CIENTO_OCHENTA);
        t1.visualizar();
        System.out.println("---------------DOSCIENTOS SETENTA--------------");
        t1.rotar();
        t1.visualizar();
        
        System.out.println("----------------------OTRO---------------------");
        t1.establecerRotacion(789456);
        t1.visualizar();
        
        System.out.println("===============================================");
        
        Triangulo t2 = new Triangulo(3);
        t2.mostrarDatos();
        System.out.println("----------------------CERO---------------------");
        t2.visualizar();
        System.out.println("---------------------NOVENTA-------------------");
        t2.rotar();
        t2.visualizar();
        System.out.println("-----------------CIENTO OCHENTA----------------");
        t2.rotar();
        t2.visualizar();
        System.out.println("---------------DOSCIENTOS SETENTA--------------");
        t2.rotar();
        t2.visualizar();
        System.out.println("----------------------CERO---------------------");
        t2.rotar();
        t2.visualizar();
        
        System.out.println("-----------------CIENTO OCHENTA----------------");
        t2.establecerRotacion(Triangulo.CIENTO_OCHENTA);
        t2.visualizar();
        System.out.println("---------------DOSCIENTOS SETENTA--------------");
        t2.rotar();
        t2.visualizar();
        
        System.out.println("----------------------OTRO---------------------");
        t2.establecerRotacion(789456);
        t2.visualizar();

    }
}
