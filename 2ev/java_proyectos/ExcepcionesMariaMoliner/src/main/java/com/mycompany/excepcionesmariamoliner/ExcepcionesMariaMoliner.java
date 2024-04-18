package com.mycompany.excepcionesmariamoliner;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author fsanj
 */
public class ExcepcionesMariaMoliner{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        double n;
        int posicion;
        String cadena;
        double[] valores = {9.83, 4.5,  - 3.06, 0.06, 2.52,  - 11.3, 7.60, 3.00,  - 30.4, 105.2};
        boolean repetir;
        
        do{
            repetir = false;
            System.out.println("Contenido del array antes de modificar:");
            for(int i = 0; i < valores.length; i ++){
                System.out.printf("%.2f ", valores[i]);
            }
            try{
                System.out.print("\n\nIntroduce la posición del array a modificar: ");
                cadena = sc.nextLine();
                posicion = Integer.parseInt(cadena);
                System.out.print("\nIntroduce el nuevo valor de la posición " + posicion + ": ");
                n = sc.nextDouble();

                valores[posicion] = n;
                System.out.println("\nPosición a modificar " + posicion);
                System.out.println("Nuevo valor: " + n);
                System.out.println("Contenido del array modificado:");
                for(int i = 0; i < valores.length; i ++){
                    System.out.printf("%.2f ", valores[i]);
                }
                System.out.println();
                sc.nextLine();
            }catch(NumberFormatException er1){
                System.out.println("No se permiten letras para indicar los valores, solo números enteros");
            }catch(InputMismatchException er2){
                System.out.println("No se permiten letras para indicar los valores, solo números enteros");
                sc.nextLine();
            }catch(ArrayIndexOutOfBoundsException er3){
                System.out.println("El índice indicado se encuentra fuera del rango del array (0-"+ (valores.length - 1) +")");
                sc.nextLine();
            }catch(StringIndexOutOfBoundsException er4){
                System.out.println("El índice indicado se encuentra fuera del rango del array (0-"+ (valores.length - 1) +")");
                sc.nextLine();
            }catch(Exception ex){
                System.err.println("Error desconocido - "+ ex.getMessage() +" en la clase "+ ex.getClass());
            }finally{
                do{
                    System.out.print("¿Quiere repetir? [S/n]: ");
                    cadena = sc.nextLine().toLowerCase();
                    if(cadena.charAt(0) != 's' && cadena.charAt(0) != 'n'){
                        System.out.println("Respuesta no válida");
                    }
                }while(cadena.charAt(0) != 's' && cadena.charAt(0) != 'n');
                if (cadena.charAt(0) == 's'){
                    repetir = true;
                    System.out.println("----------------------------------------------------------------------------------");
                }
            }
        }while(repetir);
    }
}
