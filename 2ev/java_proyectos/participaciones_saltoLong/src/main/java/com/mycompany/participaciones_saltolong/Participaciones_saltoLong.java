
/**
 *
 * @author fsanj
 */

package com.mycompany.participaciones_saltolong;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Participaciones_saltoLong {
    /*COMPRUEBA QUE LAS MARCAS SEAN INT*/  
    public static int introducirMarca(Scanner input, int res){
        do{
            try{
                res = input.nextInt();
                if(res < 0){
                    System.out.print("Por favor, ingrese un valor entero mayor que 0: ");
                }
            }catch(InputMismatchException e){
                // Capturar la excepción si el usuario no ingresa un entero
                System.out.print("Por favor, ingrese un valor entero válido: ");
                input.nextLine(); // Limpiar el buffer del scanner
                res = -1;
            }
        }while(res < 0);
        return res;
    }
    /*MENU*/
    public static void menu(final int CONT, int contP){
        System.out.println("-------------------------------------------------");
        System.out.println("Elija una opción");
        System.out.println("    1. Inscribir participantes ("+ (CONT - contP) +" restantes)");
        System.out.println("    2. Mostrar listado ordenado por dorsal");
        System.out.println("    3. Mostrar listado ordenado por marca 2023");
        System.out.println("    4. Salir");
        System.out.println("-------------------------------------------------");
    }
    /*INTRODUCIR DATOS*/
    public static int[][] introducir(int [][] participantes, int res, Scanner input, int contP){
        boolean existe;
        /*INTRODUCIR NUMERO DE DORSAL*/
        do{
            existe = false;
            //verifica que el dato introducido sea un entero
            try{
                System.out.print("Introduzca un número de dorsal: ");
                res = input.nextInt();
                for(int i = 0; i < participantes.length; i++){
                    if(res == participantes[i][0]){
                        existe = true;
                    }
                }
                if(res < 1){
                    System.out.println("El dorsal debe ser mayor o igual que 1");
                }else if(existe){
                    System.out.println("Ya existe un participante con ese número");
                }
            }catch(InputMismatchException e){
                // Capturar la excepción si el usuario no ingresa un entero
                System.out.println("Por favor, ingrese un valor entero válido.");
                input.nextLine(); // Limpiar el buffer del scanner
                res = -1;
            }
        }while(existe || res < 1);
        participantes[contP][0] = res;
        
        /*MARCA DEL 2021*/
        System.out.print("Introduzca marca 2021: ");
        participantes[contP][1] = introducirMarca(input, res);

        /*MARCA DEL 2022*/
        System.out.print("Introduzca marca 2022: ");
        participantes[contP][2] = introducirMarca(input, res);

        /*MARCA DEL 2023*/
        System.out.print("Introduzca marca 2023: ");
        participantes[contP][3] = introducirMarca(input, res);
        
        return participantes; //devuelvo el array
    }
    /*ORDENAR POR DORSAL*/
    public static void ordenarDorsal(int [][] participantes){
        for(int i = 0; i < participantes.length; i++){
            int index = i;
            for(int j = i+1; j < participantes.length; j++){
                if(participantes[j][0]<participantes[index][0]){
                    index = j;
                }
            }
            //DORSAL
            int aux = participantes[i][0];
            participantes[i][0] = participantes[index][0];
            participantes[index][0] = aux;
            //MARCA 2021
            aux = participantes[i][1];
            participantes[i][1] = participantes[index][1];
            participantes[index][1] = aux;
            //MARCA 2022
            aux = participantes[i][2];
            participantes[i][2] = participantes[index][2];
            participantes[index][2] = aux;
            //MARCA 2023
            aux = participantes[i][3];
            participantes[i][3] = participantes[index][3];
            participantes[index][3] = aux;
            
        }
        System.out.println("LISTADO DE DATOS SEGUN DORSAL:");
        System.out.println("dorsal - marcas...");
    
        for (int i = 0; i < participantes.length; i++) {
            // Verificar si al menos uno de los elementos de la fila no es cero
            boolean filaNoVacia = false;
            for (int j = 0; j < participantes[i].length; j++) {
                if (participantes[i][j] != 0) {
                    filaNoVacia = true;
                    break;
                }
            }
    
            if (filaNoVacia) {
                for (int j = 0; j < participantes[i].length; j++) {
                    System.out.print(participantes[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    
    /*ORDENAR POR MARCA 2023*/
    public static void ordenarMarca(int [][] participantes){
        for(int i = 0; i < participantes.length; i++){
            int index = i;
            for(int j = i+1; j < participantes.length; j++){
                if(participantes[j][3]<participantes[index][3]){
                    index = j;
                }
            }
            //DORSAL
            int aux = participantes[i][0];
            participantes[i][0] = participantes[index][0];
            participantes[index][0] = aux;
            //MARCA 2021
            aux = participantes[i][1];
            participantes[i][1] = participantes[index][1];
            participantes[index][1] = aux;
            //MARCA 2022
            aux = participantes[i][2];
            participantes[i][2] = participantes[index][2];
            participantes[index][2] = aux;
            //MARCA 2023
            aux = participantes[i][3];
            participantes[i][3] = participantes[index][3];
            participantes[index][3] = aux;
        }
        System.out.println("LISTADO DE DATOS SEGUN MARCA 2023:");
        System.out.println("dorsal - marcas...");
    
        for (int i = 0; i < participantes.length; i++) {
            // Verificar si al menos uno de los elementos de la fila no es cero
            boolean filaNoVacia = false;
            for (int j = 0; j < participantes[i].length; j++) {
                if (participantes[i][j] != 0) {
                    filaNoVacia = true;
                    break;
                }
            }
    
            if (filaNoVacia) {
                System.out.print((10 - i) + ". ");
                for (int j = 0; j < participantes[i].length; j++) {
                    System.out.print(participantes[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int CONT = 10;
        int contP = 0;
        int res;
        int [][] participantes = new int [CONT][4];
        System.out.println("Bienvenido");
        do{
            menu(CONT, contP);
            System.out.print("Respuesta: ");
            try{                
                res = input.nextInt();
            }catch(InputMismatchException e){ //Capturar la excepción si el usuario no ingresa un entero
                input.nextLine();
                res = -1; 
            }
            System.out.println();
            switch(res){
                case 1 -> {
                    if(contP == CONT){
                        System.out.println("Ya se ha alcanzado el número máximo de participantes");
                    }else{
                        participantes = introducir(participantes, res, input, contP);
                        contP ++;
                    }
                }
                
                case 2 -> ordenarDorsal(participantes);
                
                case 3 -> ordenarMarca(participantes);
                
                case 4 -> System.out.println("Gracias por usar el programa");
                
                default -> System.out.println("La respuesta introducida no es válida");
                
            }
            System.out.println();
        }while(res != 4);
    }
}