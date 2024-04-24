
package com.mycompany.ejparking;

import java.util.Scanner;

/**
 *
 * @author fsanj
 */
public class EjParking {

    public static void main(String[] args) {
        /*
        Parking p1 = new Parking("prueba", 50);
        System.out.println(p1.getNombre());
        p1.entrada("1", 0);
        p1.entrada(null, 0);
        p1.entrada("2874GMF", 22);
        p1.entrada("5215TRS", 0);
        p1.entrada("2874GMF", 2);
        System.out.println();
        System.out.println("Se ha liberado la plaza: "+ p1.salida("5215TRS"));
        System.out.println("Se ha liberado la plaza: "+ p1.salida("2874GMF"));
        System.out.println();
        System.out.println("Plazas totales: "+ p1.getPlazasTotales());
        System.out.println("Plazas ocupadas: "+ p1.getPlazasOcupadas());
        System.out.println("Plazas libres: "+ p1.getPlazasLibres());
        System.out.println();
        System.out.println(p1.toString());
        */
        
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        String res;
        Parking park = new Parking("Parking Centro", 50);
        do{
            System.out.println("Qué quiere realizar:");
            System.out.println("    1) Entrada de coche");
            System.out.println("    2) Salida de coche");
            System.out.println("    3) Mostrar Parking");
            System.out.println("    4) Salir del programa");
            System.out.print("Respuesta: ");
            res = input.nextLine();
        
            switch(Integer.parseInt(res)){
                case 1 -> {
                    try{
                        System.out.print("Ha elegido \"Entrada de coche\", introduzca la matrícula: ");
                        res = input.nextLine();
                        String matriculaTemp = res;
                        System.out.print("Introduzca la plaza [0-"+ (park.getPlazasTotales()-1) +"]: ");
                        res = input.nextLine();
                        if(Integer.parseInt(res) < 0 || (Integer.parseInt(res) > (park.getPlazasTotales()-1) )){
                            throw new Exception("Ha ocurrido un error: numero de plaza fuera del rango");
                        }
                        park.entrada(matriculaTemp, Integer.parseInt(res));
                    }catch(NumberFormatException nf1){
                        System.out.println("Ha ocurrido un error: numero de plaza introduzido incorrectamente");
                    }catch(Exception ex1){
                        System.out.println(ex1.getMessage());
                    }finally{
                        res = "5";
                    }                    
                }
                case 2 -> {
                    System.out.print("Ha elegido \"Salida de coche\", introduzca la matrícula: ");
                    res = input.nextLine();
                    if(park.salida(res) != -1){
                        System.out.println("Salida de coche realizada correctamente");
                        System.out.println("Plazas totales: "+ park.getPlazasTotales());
                        System.out.println("Plazas ocupadas: "+ park.getPlazasOcupadas());
                        System.out.println("Plazas libres: "+ park.getPlazasLibres());
                    }
                    res = "5";
                }
                case 3 -> {
                    System.out.println(park.toString());
                }
                case 4 -> {
                    System.out.println("Adiós");
                }
                default ->{
                    System.out.println("Introduzca una respuesta válida");
                }
            
            }
            
        
        }while(Integer.parseInt(res) != 4);
        
        
        
    }
}
