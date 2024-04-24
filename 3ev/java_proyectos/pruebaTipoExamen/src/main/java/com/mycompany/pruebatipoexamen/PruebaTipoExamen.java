package com.mycompany.pruebatipoexamen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author fsanj
 */
public class PruebaTipoExamen{
    public static void menu(){
        System.out.println("\n****************MENU DE FICHEROS****************");
        System.out.println("1. Listar los ficheros de un directorio");
        System.out.println("2. Crear un fichero de números");
        System.out.println("3. Mostrar un fichero");
        System.out.println("4. Sumar un fichero de números ya existente");
        System.out.println("5. Borrar un fichero creado");
        System.out.println("6. Salir del programa");
        System.out.print("\nIntroduce una opción: ");
    }

    public static boolean encontrarFichero(String[] arrayFicheros, String nombre){
        boolean encontrado = false;
        for(int i = 0; i < (arrayFicheros.length); i ++){
            if(arrayFicheros[i].equals(nombre + ".txt")){
                encontrado = true;
                break;
            }
        }
        return encontrado;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String path = "C:\\Users\\Nocturno\\pruebasEscrituraFicheros\\pruebaTipoExamen\\"; //Directorio por defecto
        File fichero;
        String nombre;
        int nums;

        do{ //Bucle mientras no se introduzca 6
            try{ //Para evitar InputMismatchExceptions en todo el codigo
                fichero = new File(path + "."); //Fichero en el directorio por defecto
                menu(); //Muestro el menu
                nums = input.nextInt(); //Opcion introducida por el usuario
                switch(nums){
                    case 1 -> { //Muestro todos los ficheros del directorio
                        System.out.println("Ficheros del directorio " + path);
                        System.out.println(Arrays.toString(fichero.list()));
                    }
                    case 2 -> { //Crear un nuevo fichero
                        System.out.print("Indique el nombre del fichero de números que quiere crear (sin extensión y sin espacios): ");
                        nombre = input.next();
                        if(encontrarFichero(fichero.list(), nombre)){ //Si el fichero ya existe
                            System.out.println("El fichero ya existe en el directorio, ¿quiere sobreescribirlo?");
                            System.out.println("    1. Sí");
                            System.out.println("    2 o +. No");
                            System.out.print("Respuesta: ");
                            nums = input.nextInt();
                            if(nums != 1){
                                System.out.println("Fichero no creado");
                                break;
                            }
                        }
                        try{
                            FileWriter fw = new FileWriter(path + nombre + ".txt");
                            PrintWriter pw = new PrintWriter(fw);
                            do{
                                try{
                                    System.out.print("Introduzca un número positivo, escriba -1 para terminar: ");
                                    nums = input.nextInt();
                                    if(nums >= 0){
                                        pw.println(nums);
                                        System.out.println(nums +" introducido");
                                    }else if(nums == -1){
                                        System.out.println("Ha finalizado la ejecución");
                                    }else{
                                        System.out.println("Deben ser números positivos, vuelva a escribir");
                                    }
                                }catch(InputMismatchException ime2){
                                    System.out.println("ERROR - Valor introducido no válido");
                                    nums = 0;
                                    input.next();
                                }
                            }while(nums != -1);
                            pw.close();
                            fw.close();
                        }catch(IOException ioe1){
                            System.out.println(ioe1.getMessage());
                        }
                        nums = 0;
                    }
                    case 3 -> { //Para visualizar un fichero
                        System.out.print("Indique el nombre del fichero que quiera ver (sin extensión): ");
                        nombre = input.next();
                        if(encontrarFichero(fichero.list(), nombre)){
                            System.out.println("Fichero encontrado");
                            try{
                                FileReader fr = new FileReader(path + nombre + ".txt");
                                BufferedReader br = new BufferedReader(fr);
                                String i;
                                System.out.println("Contenido del fichero " + nombre + ".txt:");
                                while((i = br.readLine()) != null){
                                    System.out.println(i);
                                }
                                br.close();
                                fr.close();
                            }catch(IOException ioex2){
                                System.out.println(ioex2.getMessage());
                            }
                        }else{
                            System.out.println("ERROR - No se ha encontrado el fichero " + nombre + ".txt");
                        }
                    }
                    case 4 -> { //Para sumar los números de un fichero
                        System.out.print("Indique el nombre del fichero que quiera sumar (sin extensión): ");
                        nombre = input.next();
                        if(encontrarFichero(fichero.list(), nombre)){
                            System.out.println("Fichero encontrado");
                            try{
                                FileReader fr = new FileReader(path + nombre + ".txt");
                                BufferedReader br = new BufferedReader(fr);
                                String i;
                                int suma = 0;
                                System.out.print("Suma de los números de" + nombre + ".txt= ");
                                while((i = br.readLine()) != null){
                                    suma += Integer.parseInt(i);
                                }
                                System.out.print(suma);
                                br.close();
                                fr.close();
                            }catch(IOException ioex2){
                                System.out.println(ioex2.getMessage());
                            }
                        }else{
                            System.out.println("ERROR - No se ha encontrado el fichero " + nombre + ".txt");
                        }
                    }
                    case 5 -> { //Para eliminar ficheros
                        System.out.print("Indique el nombre del fichero que quiere borrar (sin extensión): ");
                        nombre = input.next();
                        if(encontrarFichero(fichero.list(), nombre)){
                            System.out.println("Fichero encontrado");
                            System.out.println("¿Está seguro de que quiere eliminar el fichero " + nombre + ".txt ? ");
                            System.out.println("    1. Sí");
                            System.out.println("    2 o +. No");
                            System.out.print("Respuesta: ");
                            nums = input.nextInt();
                            if(nums == 1){
                                fichero = new File(path + nombre + ".txt");
                                fichero.delete();
                                System.out.println("Fichero " + nombre + ".txt eliminado del directorio correctamente");
                            }else{
                                System.out.println("Fichero no eliminado");
                            }
                            nums = 0;
                        }else{
                            System.out.println("ERROR - No se ha encontrado el fichero " + nombre + ".txt");
                        }
                    }
                    case 6 ->
                        System.out.println("Gracias por usar el programa, hasta pronto.");
                    default -> {
                        System.out.println("Introduzca una opción válida");
                    }
                }
            }catch(InputMismatchException ime1){
                System.out.println("ERROR - Valor introducido no válido");
                nums = 0;
                input.next();
            }
        }while(nums != 6);
        input.close();
    }
}
