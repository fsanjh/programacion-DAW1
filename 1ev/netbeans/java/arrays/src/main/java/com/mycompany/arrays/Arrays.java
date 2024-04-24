/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays;

import java.util.Scanner;

/**
 *
 * @author Nocturno
 */
public class Arrays {

    public static void main(String[] args) {
        //Prueba arrays propia
        /*
        Scanner input = new Scanner (System.in);
        int cant;
        int nota;
        int total = 0;
        
        System.out.print("Cuántos alumnos hay en clase: ");
        cant = input.nextInt();
        
        int notas[] = new int [cant];
        
        for(int i = 0; i < cant; i++){
            System.out.print("Nota del alumno "+ (i+1) +": ");
            nota = input.nextInt();
            notas[i] = nota;
        }
        System.out.println("---------NOTAS---------");
        for(int i = 0; i < cant; i++){
            System.out.println("Nota del alumno "+ (i+1) +": "+ notas[i]);
            total = total + notas[i];
        }
        System.out.print("Media total: "+ (total/cant));
        */
        /* ------------------------------- */
        //Matriz bidimensional Strings
        /*String[][] matrizNombres = {
            {"Daniel","Felix","Milagros"},
            {"Alan","Damian","Rafa"},
            {"Javier","Mateo","Ivanna"}
        };
        
        for(int i = 0; i < matrizNombres.length; i++){
            for(int j = 0; j < matrizNombres.length; j++){
                System.out.print(matrizNombres[i][j] + "    ");
            }
            System.out.println();
        }
        */
        
        /*---------------------------------*/
        //Arrays ejercicios
	/*
            int[] array = {10, 20, 30, 40, 50};
            int var = 0;

            //mostrar los elementos
            for(int i = 0; i < array.length; i++){
                System.out.println(array[i]);
            }
            //suma de los elementos
            for(int i = 0; i < array.length; i++){
                var = var + array[i];
            }
            System.out.println("Suma de los elementos: "+ var);
            //valor máximo
            var = 0;
            for(int i = 0; i < array.length; i++){
                if(var < array[i]){
                    var = array[i];
                }
            }
            System.out.println("El valor máximo del array es: "+ var);
            //encuentra un elemento dentro del array
            var = 0;
            for(int i = 0; i < array.length; i++){
                if(array[i] == 30){
                    System.out.println("Se ha encontrado el valor 30 en la posición "+ i +" del array");
                    var = 1;
                }
            }
            if (var == 0){
                System.out.println("No se ha encontrado el valor 30 en el array");
            }
                */

	    @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
	    double media1 = 0, media2 = 0, media3 = 0;
        double nota=0.0;
	    int num=0, numAlumnos=0;
	    
	    System.out.print("Alumnos que hay en el grupo: ");
	    numAlumnos = input.nextInt();
        double trim1[] = new double [numAlumnos];
        double trim2[] = new double [numAlumnos];
        double trim3[] = new double [numAlumnos];
        
       
        for (int t = 0; t < 3; t++) {
            System.out.println("Introduce las notas del trimestre " + (t + 1));
            for (int i = 0; i < numAlumnos; i++){
                do{
                    System.out.print("   Alumno/a " + (i + 1) + ": ");
                    nota = input.nextDouble();
                    if(nota > 10 || nota < 0){
                        System.out.println("ERROR: La nota no puede ser mayor a 10 ni menor a 0");
                    }else{
                        if(t == 0){
                            trim1[i] = nota;
                            media1 += trim1[i];
                        }else if(t == 1){
                            trim2[i] = nota;
                            media2 += trim2[i];
                        }else{
                            trim3[i] = nota;
                            media3 += trim3[i];
                        }
                    }
                }while(trim1[i] > 10 || trim1[i] < 0);
            }
        }
       
        System.out.println("Nota media de cada trimestre");
        System.out.println("     Primer trimestre: "+ String.format("%.2f", media1/numAlumnos));
        System.out.println("     Segundo trimestre: "+ String.format("%.2f", media2/numAlumnos));
        System.out.println("     Tercer trimestre: "+ String.format("%.2f", media3/numAlumnos));
       
       
        System.out.println("Introduzca el número del alumno del que quiere conocer su nota media");
        do{
            System.out.print("Número: " );
            num = input.nextInt();
            if(num < 1 || num > numAlumnos){
                System.out.println("Ese alumno no existe");
            }
        }while(num < 1 || num > numAlumnos);
       
        System.out.println("La nota media del alumno con el número "+ num +" es de "+ String.format("%.2f",(trim1[num-1] + trim2[num-1] + trim3[num-1])/3) );
                
                
                
                
                
                
                
                
    }
}
