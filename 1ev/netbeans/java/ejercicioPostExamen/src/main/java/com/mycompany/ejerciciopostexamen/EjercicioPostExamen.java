/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciopostexamen;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nocturno
 */
public class EjercicioPostExamen {

    public static void main(String[] args) {
        /*
        Scanner input = new Scanner(System.in); //Declaro escaner
        int [] nums = new int [10]; //Declaro el array de 10 indices
        boolean creciente = false; //Variable para orden creciente
        boolean decreciente = false; //Variable para orden decreciente
        boolean iguales = false; //Variable para todos iguales
        
        System.out.println("Introduzca 10 números enteros: ");
        for(int i = 0; i < nums.length; i++){ //Bucle para pedir numeros
            System.out.print("Número "+ (i+1) +": ");
            nums[i] = input.nextInt();        
        }
        for(int j = 0; j < nums.length - 1; j++){ //Bucle para saber si el orden es creciente
            if(nums[j] <= nums[j+1]){
                creciente = true;
            }else{
                creciente = false;
                break;
            }
        }
        for(int j = 0; j < nums.length - 1; j++){ //Bucle para saber si el orden es decreciente
            if(nums[j] >= nums[j+1]){
                decreciente = true;
            }else{
                decreciente = false;
                break;
            }
        }
        
        for(int j = 0; j < nums.length - 1; j++){ //Bucle para saber si el orden es decreciente
            if(nums[j] == nums[j+1]){
                iguales = true;
                decreciente = false;
                creciente = false;
            }else{
                iguales = false;
                break;
            }
        }
        
        if(creciente){
            System.out.println("Los números están ordenados de menor a mayor");
        }else if(decreciente){
            System.out.println("Los números están ordenados de mayor a menor");
        }else if (!decreciente && !creciente && !iguales){ //Si no es creciente ni decreciente
            System.out.println("Los números no están ordenados");
        }else if (iguales){ //Si no es creciente ni decreciente
            System.out.println("Los números son iguales");
        }
        */
        /*
        Scanner input = new Scanner(System.in);
        int [] nums = new int [10];
        int temp;
        
        System.out.println("Introduzca 10 números enteros: ");
        for(int i = 0; i < nums.length; i++){
            System.out.print("Número "+ (i+1) +": ");
            nums[i] = input.nextInt();        
        }
        
        temp = nums[nums.length - 1];
        for(int i = nums.length - 2; i >= 0; i--){
            nums[i+1] = nums[i];
        }
        nums[0] = temp;
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
        */
        /*
        Scanner input = new Scanner(System.in);
        int [][] matriz1 = new int [3][3];
        int [][] matriz2 = new int [3][3];
        
        System.out.println("Introduce valores para la primera matriz");
        for(int i = 0; i < matriz1.length; i++){
            System.out.println("Fila "+ (i));
            for(int j = 0; j < matriz1.length; j++){
                System.out.print("    Columna "+ (j));
                System.out.print(" -> Valor:  ");
                matriz1[i][j] = input.nextInt();
            }
        }
        System.out.println("PRIMERA MATRIZ");
        for(int i = 0; i < matriz1.length; i++){
            for(int j = 0; j < matriz1.length; j++){
                System.out.print(matriz1[i][j] +" ");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Introduce valores para la segunda matriz");
        for(int i = 0; i < matriz2.length; i++){
            System.out.println("Fila "+ (i));
            for(int j = 0; j < matriz2.length; j++){
                System.out.print("    Columna "+ (j));
                System.out.print(" -> Valor:  ");
                matriz2[i][j] = input.nextInt();
            }
        }
        System.out.println("SEGUNDA MATRIZ");
        for(int i = 0; i < matriz2.length; i++){
            for(int j = 0; j < matriz2.length; j++){
                System.out.print(matriz2[i][j] +" ");
            }
            System.out.println();
        }
        
        System.out.println("SUMA DE LAS MATRICES");
        for(int i = 0; i < matriz2.length; i++){
            for(int j = 0; j < matriz2.length; j++){
                matriz2[i][j] = matriz2[i][j] + matriz1[i][j];
            }
        }
        for(int i = 0; i < matriz2.length; i++){
            for(int j = 0; j < matriz2.length; j++){
                System.out.print(matriz2[i][j] +" ");
            }
            System.out.println();
        }
        */
        
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        final int MIN = 0;
        final int MAX = 10;
        final int FILAS = 5;
        System.out.print("Cuántas columnas quiere en el array de "+ FILAS +" filas: ");
        final int COL = input.nextInt();
        int [][] array = new int [FILAS][COL];
        funcion(array, MIN, MAX); 
    }
    public static int generarNumerosAleatorios(final int MIN, final int MAX){
        Random rnd = new Random();
        return rnd.nextInt(MAX)+MIN;
    }
    public static void funcion(int[][] array, final int MIN, final int MAX){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                array[i][j] = generarNumerosAleatorios(MIN, MAX);
                System.out.print(array[i][j] +" ");
            }
            System.out.println();
        }
    } 
}
