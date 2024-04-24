
package com.mycompany.tresenraya;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author fsanj
 */

public class TresEnRaya {
    //PROCEDIMIENTO PARA IMPRIMIR EL TABLERO MOSTRANDO NUMEROS DE FILA Y COLUMNA
    public static void imprimir(char [][] tablero){
        System.out.println("  1 2 3"); //Columnas
        for(int i = 0; i < tablero.length; i++){
            System.out.print((i + 1) +" "); //Filas
            for(int j = 0; j < tablero.length; j++){
                System.out.print(tablero[i][j] +" ");
            }
            System.out.println();
        }
    }
    //FUNCION QUE REALIZA LOS TURNOS
    public static char[][] turno(char[][] tablero, boolean turno){
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        int fila;
        int col;
        boolean correcto = false;
        do{ //Bucle que se repite hasta introducit una posicion correcta
            do{ //Bucle que se repita hasta introducir valores dentro del rango
                System.out.print("Fila: ");
                //Si se introduce una letra cambia el valor a uno fuera del rango
                try{
                    fila = input.nextInt();
                }catch(InputMismatchException e){ //En caso de introducir un valor invalido se ejecuta lo siguiente
                    input.nextLine(); //Limpia el buffer del escaner
                    fila = 4;
                }
                System.out.print("Columna: ");
                //Si se introduce una letra cambia el valor a uno fuera del rango
                try{
                    col = input.nextInt();
                }catch(InputMismatchException e){ //En caso de introducir un valor invalido se ejecuta lo siguiente
                    input.nextLine(); //Limpia el buffer del escaner
                    col = 4;
                }
                if((fila > 3 || fila < 1) || (col > 3 || col < 1)){
                    System.out.println("Posición inválida, vuelva a escribirla");
                    imprimir(tablero);
                }
            }while((fila > 3 || fila < 1) || (col > 3 || col < 1));
            //Para que las filas y columnas estén dentro del rango de la matriz (0-3)
            fila = fila - 1; 
            col = col - 1;
            
            char forma;
            if(!turno){ //Si turno= false es el turno del jugador 1 y el valor a introducir en el array sería una "x"
                forma = 'x';
            }else{ //Si es turnoÇ= false entonces es el otro jugador con el "o"
                forma = 'o';
            }
            //Si en esa posición hay un "-" entonces se introduce el valor ahí
            if(tablero[fila][col] == '-'){
                tablero[fila][col] = forma;
                correcto = true;
            }else{
                System.out.println("Esa posición no se puede utilizar, escoja otra");
                imprimir(tablero);
            }
        }while(!correcto);
        System.out.println("---------------------");
        return tablero;
    }
    //FUNCION QUE COMPRUEBA SI LA PARTIDA VA A TERMINAR DESPUÉS DE UN TURNO
    public static boolean comprobar(char[][] tablero, boolean fin){
        boolean gana1 = false;
        boolean gana2 = false;
        char char0;
        char char1;
        char char2;
        //FILAS
        for(int i = 0; i < tablero.length; i++){
            char0 = tablero[i][0];
            char1 = tablero[i][1];
            char2 = tablero[i][2];
            //Si toda una fila es igual
            if(char0 == char1 && char1 == char2){
                if(char0 == 'x'){
                    gana1 = true;
                }else if(char0 == 'o'){
                    gana2 = true;
                }
            }
        }
        //COLUMNAS
        for(int i = 0; i < tablero.length; i++){
            char0 = tablero[0][i];
            char1 = tablero[1][i];
            char2 = tablero[2][i];
            //Si toda una columna es igual
            if(char0 == char1 && char1 == char2){
                if(char0 == 'x'){
                    gana1 = true;
                }else if(char0 == 'o'){
                    gana2 = true;
                }
            }
        }
        //DIAGONALES
        char0 = tablero[0][0];
        char1 = tablero[1][1];
        char2 = tablero[2][2];
         //Si la diagonal principal es igual
        if(char0 == char1 && char1 == char2){
            if(char0 == 'x'){
                gana1 = true;
            }else if(char0 == 'o'){
                gana2 = true;
            }
        }
        char0 = tablero[0][2];
        char1 = tablero[1][1];
        char2 = tablero[2][0];
         //Si la diagonal inversa es igual
        if(char0 == char1 && char1 == char2){
            if(char0 == 'x'){
                gana1 = true;
            }else if(char0 == 'o'){
                gana2 = true;
            }
        }
        //Comprueba si se han rellenado todos los huecos
        int cont = 0;
        for(int i = 0; i < tablero.length; i++){
            for(int j = 0; j < tablero.length; j++){
                char1 = tablero[i][j];
                if(char1 != '-'){
                    cont++;
                }
            }
        }
        //COMPROBACIONES PARA EL FIN DEL JUEGO
        if(gana1){
            fin = true;
            System.out.println("Ha ganado el jugador 1");
        }else if(gana2){
            fin = true;
            System.out.println("Ha ganado el jugador 2");
        }else if(cont == 9){ //Si todos los huecos están llenos y gana1 y gana2 son false
            fin = true;
            System.out.println("Empate, no quedan huecos que rellenar");
        }
        return fin;
    }

    public static void main(String[] args) {
        //Tablero con los guiones ya introducidos
        char [][] tablero = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
        };
        boolean fin = false; //Booleano que determina si el juego termina o sigue
        boolean turno; //False = jugador1 y True= jugador2

        System.out.println("Bienvenidos al tres en raya");
        do{
            System.out.println("Tu turno jugador 1");
            turno = false;
            imprimir(tablero); //Muestra la matriz
            tablero = turno(tablero, turno); //Llama a la funcion para introducir datos y actualizar la matriz con los datos introducidos
            fin = comprobar(tablero, fin); //Comprueba si la partida ya termina
            if(fin){ //Si termina el jugador 1, hace un break del bucle do para no tener que seguir con el jugador 2
                break;
            }
            System.out.println("Tu turno jugador 2");
            turno = true;
            imprimir(tablero);
            tablero = turno(tablero, turno);
            fin = comprobar(tablero, fin);
        }while(!fin);
        imprimir(tablero); //Muestra como ha quedado el tablero final
    }
}