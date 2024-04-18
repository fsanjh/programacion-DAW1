
/**
 *
 * @author fsanj
 */

package com.mycompany.loteria;

import java.util.Random;
import java.util.Scanner;

public class Loteria {
    /*Ordena arrays*/
    public static int [] ordenar(int[]array){
        for(int i = 0; i < array.length; i++){
            int index = i;
            for(int j = i+1; j < array.length; j++){
                if(array[j]<array[index]){
                    index = j;
                }
            }
            int aux = array[i];
            array[i] = array[index];
            array[index] = aux;
        }
        return array;
    }
    /*Genera los números ganadores*/
    public static int [] numsGanadores(int [] loteria){
        Random rnd = new Random();
        for(int i = 0; i < loteria.length; i++){
            int nRand = rnd.nextInt(50); //numero aleatorio
            for(int j = 0; j < loteria.length; j++){
                if(loteria[j] != nRand){ //verifica que el numero no exista ya
                    loteria[i] = nRand;
                }
            }
        }
        loteria = ordenar(loteria); //ordena los numeros ganadores
        return loteria;
    }
    /*Comprobar que números han sido acertados*/
    public static int aciertos(int [] loteria, int [] lotUser){
        int aciertos = 0; //contador de aciertos
        String numsAcertados = ""; //string que almacenara los numeros acertados
        for(int i = 0; i < loteria.length; i++){
            for(int l = 0; l < lotUser.length; l++){
                if(loteria[i] == lotUser[l]){ //si coinciden los numeros
                    aciertos ++;
                    numsAcertados = numsAcertados + loteria[i] + " ";
                }
            }
        }
        //Muestra el array con los ganadores
        System.out.println("Números ganadores:");
        for(int j = 0; j < loteria.length; j++){
            System.out.print(loteria[j] +" ");
        }
        System.out.println();
        //Muestra los numeros del usuario
        System.out.println("Tus números:");
        for(int k = 0; k < lotUser.length; k++){
            System.out.print(lotUser[k] +" ");
        }
        //Solo lo muestra los numeros en caso de acertar
        if(aciertos > 0){
            System.out.println();
            System.out.print("Número/s acertado/s: "+ numsAcertados);
        }
        System.out.println();
        return aciertos;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Declaro el escaner
        int [] loteria = new int [6]; //Array de los numeros de la primitiva
        int [] lotUser = new int [6]; //Array de los numeros del usuario
        int nums; //Numeros que el usuario introducira
        boolean distinto; //Comprobar que el numero sea distinto a los ya introducidos
        System.out.println("Bienvenido a La Primitiva, introduzca los números que quiere jugar: ");
        for(int i = 0; i < lotUser.length; i++){ //Bucle para introducir numeros
            do{ //Para repetir en caso de que el numero no sea correcto
                distinto = true;
                System.out.print("  Número "+ (i+1) +": ");
                nums = input.nextInt();
                for(int j = 0; j < lotUser.length; j++){ //Comprueba que el numero no fue introducido ya
                    if(nums == lotUser[j]){
                        distinto = false;
                    }
                }
                if(nums > 49 || nums < 1 || !distinto){ //Comprueba si ocurrió algún error
                    System.out.println("El número debe ser distinto a los ya introducidos, mayor a 1 y menor que 49 incluidos");
                    System.out.println("-------------------------------------------------------");
                }
            }while(nums > 49 || nums < 1 || !distinto);
            lotUser[i] = nums; //Introduzco en el array el numero del usuario
        }
        lotUser = ordenar(lotUser); //Ordenar el array del usuarios
        loteria = numsGanadores(loteria); //Genera el array de los numeros ganadores
        System.out.println("Has acertado "+ aciertos(loteria, lotUser) +" número/s de la primitiva. "); //llama a la funcion aciertos para mostrar la cantidad
    }
}