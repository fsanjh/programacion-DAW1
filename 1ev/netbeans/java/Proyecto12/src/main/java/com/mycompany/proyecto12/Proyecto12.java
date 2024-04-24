/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto12;

import java.util.Scanner;

/**
 *
 * @author Nocturno
 */
public class Proyecto12 {

    public static void main(String[] args) {
        /*Introducir 5 numeros y calcular media de posiyivos, negativos y ceros*/
        /* Scanner input = new Scanner(System.in); 
        int [] arraynum = new int [5]; //Inicia el array con 5 posiciones
        int num; //Número que introduce el usuario
        double cont1=0, cont2=0, positivo = 0, negativo = 0; //Contadores de números positivos y negativos y sumas de los valores positivos y negativos
        System.out.println("Introduce 5 números ENTEROS(0, -2, 3...) para calcular la media de los numeros positivos/negativos y contar el numero de Ceros");
        for (int i=0; i<5; i++){ //Bucle que pide valores al usuario y los introduce en el array
            num = input.nextInt();
            arraynum[i] = num;
        }
        for (int e=0; e<arraynum.length; e++){ //Suma que números son positivos y negativos en su respectiva variable y contadores
            if (arraynum[e]<0){
                negativo = arraynum[e]+negativo;
                cont1++;
            } else if(arraynum[e]>0){
                positivo = arraynum[e]+positivo;
                cont2++;
            } 
        }        
        if(positivo == 0){ //En caso de que no haya ninguno positivo...
            System.out.println("No hay números positivos");
        }else{
            positivo = positivo/cont2; //Si hay positivos
            System.out.println("La media de numeros positivos es "+positivo);
        }
        
        if(negativo == 0){  //Si no hay numeros negativos
            System.out.println("No hay números negativos");
        }else{
            negativo = negativo/cont1; //Si hay números negativos
            System.out.println("La media de numeros negativos es "+negativo);
        }
        
        if (cont1+cont2 == 5){ //Si no encuentra ninguno
            System.out.print("No hay ceros");
        }else{ //Si hay ceros
            System.out.println("Hay "+ (5-cont1-cont2) + " cero/s");        
        }*/
       
        /*Array de 10 números que ordena (primero, ultimo, segundo, penultimo...)*/
        /*Scanner input = new Scanner(System.in);
        int[] arraylarga= new int[10]; //Creo un array con 10 indices (0-9)
        int num; //Número que introduce el usuario
        for(int i=0; i<arraylarga.length; i++){ //Pide al usuario introducir los valores en el array
            System.out.println("Introduce un numero");
            num = input.nextInt();
            arraylarga[i] = num;
        }
        for (int j=0; j<=(arraylarga.length/2)-1; j++){ //Ordena los valores del array como se ha pedido
            System.out.print(arraylarga[j] +" "); //Valor del "lado izquierdo"
            System.out.print(arraylarga[arraylarga.length-j-1] +" "); //Valor del "lado derecho"
        }
        */


        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        //int [] arrayA , arrayB , arrayC;     //Declaro los tres arrays con sus tamaños
        int num, cont, contA = 0, contB = 0;    //num= numero que introduce el usuario, contA y contB= indices de los arrays A y B
        //Pido al usuario el número de valores que quiere introducir
        System.out.print("Cúantos valores quieres añadir a ambas tablas (debe ser múltiplo de 3): ");
        do{
            num = input.nextInt();
            if (num%3!=0){ //Si el valor no es múltiplo de 3 muestra el error
                System.out.print("El valor introducido no es válido, introduzca otro: ");
                
            }
        }while(num%3!=0);
        //Creo los arrays del tamaño que el usuario a introducido
        int arrayA[] = new int [num];
        int arrayB[] = new int [num];
        int arrayC[] = new int [num*2];
        num = 0;
        //Introducir valores al arrayA
        System.out.println("Valores de la primera tabla");
        for(int i = 0; i < arrayA.length; i++){
            System.out.print("Introduce un número entero: ");
            num = input.nextInt();
            arrayA[i] = num;        
        }
        System.out.println("------------------------------------");
        //Introducir valores al arrayB
        System.out.println("Valores de la segunda tabla");
        for(int j = 0; j < arrayB.length; j++){
            System.out.print("Introduce un número entero: ");
            num = input.nextInt();
            arrayB[j] = num;        
        }
        for(int k = 0; k < arrayC.length; k++){     //Bucle que añade los valores de los arrays anteriores al arrayC alternando entre ellos
            cont = 0;
            while(cont < 3){    //Añade 3 valores del arrayA al arrayC
                    arrayC[k] = arrayA[contA];  //asigno valores a arrayC
                    k++;    //Para aumentar el indice de arrayC los mismos valores que se introducen
                    cont++;     //Contador para que solo se introduzcan 3 valores
                    contA++;        //Contador que va a aumentar desde 0 hasta 12, indicando el indice para el arrayB
                }
            cont = 0;
            while(cont < 3){    //Añade 3 valores del arrayB al arrayC
                    arrayC[k] = arrayB[contB];  //asigno valores a arrayC
                    k++;    //Para aumentar el indice de arrayC los mismos valores que se introducen
                    cont++;     //Contador para que solo se introduzcan 3 valores
                    contB++;    //Contador que va a aumentar desde 0 hasta 11, indicando el indice para el arrayB
            }
            k--;    //Para que el k++ del for no se tenga en cuenta a la hora de aumentar su valor, solo los k++ de los while 
        }
        //Muestro los valores del arrayC
        System.out.println("------------------------------------");
        System.out.println("Array creado a partir de los otros dos");
        for(int l = 0; l < arrayC.length; l++){
            System.out.print(arrayC[l]+ " ");       
        }
        
	}
}