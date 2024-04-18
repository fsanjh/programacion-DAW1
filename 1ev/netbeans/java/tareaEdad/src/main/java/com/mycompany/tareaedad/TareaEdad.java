/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tareaedad;

import java.util.Scanner;
/**
 *
 * @author fsanj
 */
public class TareaEdad {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in); //Declaro el escaner
        int dia1, dia2, mes1, mes2, ano1, ano2; //Declaro variables
        //Inicializo variables
        dia1 = dia2 = mes1 = mes2 = 1;
        ano1 = ano2 = 0;
        //Comienza el programa
        System.out.println("Bienvenido al programa de cálculo de su edad actual");
        //Bucle for para pedir dos veces datos sin repetir el código
        for(int i=0; i<2; i++){
        //AÑOS
            //Bucle que no termina hasta ingresar datos de los años correctos, muestra errores
            do{
                if (i==0){ //Para la primera vuelta
                    System.out.println("Introduzca la fecha actual:");
                    System.out.println("-Año: ");
                    ano1 = input.nextInt();
                    if(ano1<0){
                        System.out.println("ERROR: El año no puede ser inferior a 0");
                    }
                }else{ //Para la segunda vuelta
                    System.out.println("-------------------------------");
                    System.out.println("Ingrese su fecha de nacimiento:");
                    System.out.println("-Año: ");
                    ano2 = input.nextInt();
                    if(ano2<0 || ano2>ano1){
                        System.out.println("ERROR: El año no puede ser inferior a 0 ni mayor que "+ ano1);
                    }
                }
            }while(ano1<0 || (ano2<0 || ano2>ano1));
        //MESES
            //Bucle que no termina hasta ingresar datos de los meses correctos, muestra errores
            do{
                System.out.println("-Mes[1-12]: ");
                if (i==0){ //Primera vuelta
                    mes1 = input.nextInt();
                }else{ //Segunda vuelta
                    mes2 = input.nextInt();
                }
                if ((mes1 < 1 || mes1 > 12) || (mes2 < 1 || mes2 > 12)){
                    System.out.println("ERROR: Mes no reconocido");
                }
            }while((mes1 < 1 || mes1 > 12) || (mes2 < 1 || mes2 > 12));
        //DÍAS
            //Dependiendo del mes, empezará un bucle pidiendo una cantidad de días u otra
            //MESES DE 31 DÍAS
            if ((mes1 == 1 || mes1 == 3 || mes1 == 5 || mes1 == 7 || mes1 == 8 || mes1 == 10 || mes1 == 12) ||
                (mes2 == 1 || mes2 == 3 || mes2 == 5 || mes2 == 7 || mes2 == 8 || mes2 == 10 || mes2 == 12)){
                //Repite hasta dar un valor correcto, mostrando error
                do{
                    System.out.println("-Día[1-31]: ");
                    if (i==0){
                        dia1 = input.nextInt();
                    }else{
                        dia2 = input.nextInt();
                    }
                    if ((dia1 < 1 || dia1 > 31) || (dia2 < 1 || dia2 > 31)){
                        System.out.println("ERROR: Día no reconocido");
                    }
                }while((dia1 < 1 || dia1 > 31) || (dia2 < 1 || dia2 > 31));
            //FEBRERO
            }else if(mes1 == 2 || mes2 == 2){
                //Repite hasta dar un valor correcto, mostrando error
                do{
                    System.out.println("-Día (en caso de ser 29, seleccionar 28)[1-28]: ");
                    if (i==0){
                        dia1 = input.nextInt();
                    }else{
                        dia2 = input.nextInt();
                    }
                    if ((dia1 < 1 || dia1 > 28) || (dia2 < 1 || dia2 > 28)){
                        System.out.println("ERROR: Día no reconocido");
                    }
                }while((dia1 < 1 || dia1 > 28) || (dia2 < 1 || dia2 > 28));
            //MESES DE 30 DÍAS
            }else{
                //Repite hasta dar un valor correcto, mostrando error
                do{
                    System.out.println("-Día[1-30]: ");
                    if (i==0){
                        dia1 = input.nextInt();
                    }else{
                        dia2 = input.nextInt();
                    }
                    if ((dia1 < 1 || dia1 > 30) || (dia2 < 1 || dia2 > 30)){
                        System.out.println("ERROR: Día no reconocido");
                    }
                }while((dia1 < 1 || dia1 > 30) || (dia2 < 1 || dia2 > 30));
            }
        }
        //RESULTADO FINAL
        //Muestra si el cumpleaños ya pasó, no pasó, es hoy y los años que tiene
        if((dia1>dia2 && mes1>=mes2 && ano1!=ano2) || (dia1>=dia2 && mes1>mes2 && ano1!=ano2)){ //Cumpleaños pasado
            System.out.println("Ya ha pasado tu cumpleaños este año");
            System.out.println("Tienes "+ (ano1-ano2) +" años");
        }else if((dia1>dia2 && mes1>=mes2 && ano1==ano2) || (dia1>=dia2 && mes1>mes2 && ano1==ano2) ){ //Nacido este año
            System.out.println("Has nacido este año, aún no tuviste tu primer cumpleaños");
        }else if (dia1<dia2 || mes1<mes2){
            System.out.println("Aún no ha sido tu cumpleaños este año"); //Cumpleaños pendiente
            System.out.println("Tienes "+ (ano1-ano2-1) +" años");
        }else if(dia1==dia2 && mes1==mes2 && ano1!=ano2){ //Hoy es el cumpleaños
            System.out.println("¡¡FELICIDADES!!");
            System.out.println("Tienes "+ (ano1-ano2) +" años");
        }else if(dia1==dia2 && mes1==mes2 && ano1==ano2){
            System.out.println("¡¡FELICIDADES POR NACER HOY!!"); //Recién nacido
        }
        System.out.println("Gracias por usar el programa");
    }
}