/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto2;


/**
 *
 * @author Nocturno
 */
public class Proyecto2 {
    /**
     * @param args
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        //  System.out.println("Hello World!");

        //byte b = 'a';
        //System.out.println(b);

        /*byte b = 'a';
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;

        System.out.println(d);*/
        /*float x = 5.7F;
        int y = (int) x;
        System.out.println(y);*/
        /*long num1=123456789L;
        long num2=983223456L;
        int resultado = (int)(num1+num2);
        System.out.println(resultado);*/

        /* Integer num = 23654728;
        String pal = num.toString();

        System.out.print(pal + 10); */

       /*
        String pal1, pal2;
        pal1 = "mariiiiiiiiiamoliner";
        pal2 = "mariamoliner";   

        System.out.print(pal1.compareTo(pal2));
       */

       /*
        String pal1, pal2;
        pal1 = "mariamoliner";
        pal2 = "mariamoliner";   

        System.out.print(pal1.equals(pal2));
       */

       /*
       int x = 37;
       String cadena = Integer.toString(x) + 3;

       System.out.print(cadena);
       */

       //System.out.print("\"Buenas noches señorita, muy buenas noches por cierto\" \r-Jordi Wild ");


       /* 
         Bloque
       */
       // Linea
       /** 
        * Documentación 
        */

       /*Altura de un arbol*/
       /* Scanner input = new Scanner (System.in);
       double x, Ang;

       System.out.println("Escribeme la distancia y los grados, my friend");
       System.out.print("-Distancia (m): ");
       x = input.nextDouble();
       System.out.print("-Ángulo (º): ");
       Ang = Math.toRadians(input.nextDouble());

       System.out.println( "Altura= " + String.format("%.2f", x*Math.tan(Ang)) + "m");
       */


       //IF, ELSE, ELSE IF, SWITCH
       /*
       int a = 0;
       switch (a) {
           case 0 -> {
               System.out.print(a);}
           case 1 -> {
               System.out.print(a);}
           default -> {
               System.out.print(a);}
       }
       */

       /*--------------------------------------------------*/
       //WHILE
       /*
       int a = 0;

       while (a != 5){
       System.out.println(a);
           a = a + 1;
       }
          */ 

       //Contador 10 números positivos, negativos o nulos
       //Scanner input = new Scanner (System.in); //Añado el Scanner
      /* int num, cont, pos, neg; //Declaro variables
       cont = pos = neg = 0; //Inicio variables a 0

       while (cont < 10) { //Mientras el contador no sea 10 se repite, total de repeticiones = 10
           System.out.print("\nEscribe un número entero: "); //Muestro el mensaje
           num = input.nextInt(); //Leo el input del usuario
           if (num > 0){ //Si el input es mayor que 0, sumo 1 a la variable pos
               pos ++;
           }else if (num < 0){ //Si el input es mayor que 0, sumo 1 a la variable neg
               neg ++;
           }
           cont ++; //Aumento el contador en 1
       }
       //Muestro la cantidad de números positivos y negativos con las variables creadas y los nulos restando al total los positivos y negativos
       System.out.println("Había "+ pos +" números positivos, "+ neg +" negativos y "+ (cont - pos - neg) +" nulos" );
        */

       //Otro Scanner (hay que añdir dos librerias), quitar el otro Scanner para que funcione
       /*InputStreamReader input = new InputStreamReader(System.in);
       BufferedReader entrada = new BufferedReader(input);*/ 
      
       /*
       int num; //numero entero
        System.out.println("\n Numeros del 1 al 100"); //Le mostramos al usuario los numeros que se mostraran
       num=1;         //Asignamos 1 a la variable "num"
       do{ //Entramos en bucle, para que se imprima la variable num hasta que
        System.out.println(num);
        num ++;
        }while (num < 101); // la variable sea menor o igual de 100
       */
     /*  
       int num = 1;
       while (num <= 100){
           System.out.println(num);
           num ++;
       }
       */
     
     /* int n = 0;
     A: while (true){
         System.out.println("A");
         B: while (true){
             System.out.println("B");
             break A;
         }
     }
     C: while (true){
         System.out.println("C");
         D: while (true){
             System.out.println("D");
             n ++;
             if (n == 5){
                 break C;
             }
             continue C;
    */
 /*    System.out.println("Edad persona");
     System.out.println("Fecha Actual?");
        int dia, mes, año; 
        //dia = input.nextInt();
        mes = input.nextInt();
        año = input.nextInt();
        dia = input.nextInt();
    System.out.println("Fecha nacimiento?");
       int dia1, mes1, año1; 
      // dia1 = input.nextInt();
       mes1 = input.nextInt();
       año1 = input.nextInt();
       dia1 = input.nextInt();
    do{
       if (mes < mes1 && dia<dia1);
               System.out.println(año-año1-1 + "años");
      
           System.out.println(año-año1);

      }while (año<año1);
     System.out.print("Gracias por usar el programa");
     }*/
 //Break and continue
 /*
 for (int i=0; i<6; i++){
     
     for (int j=0; j<5; j++){
        if (j==3){ 
            continue;
        }else{
            System.out.println("*");
        }
     }
  } 
 */
 /*
 Scanner input = new Scanner (System.in);
 int filas;
 String piramide = "";
 System.out.print("Numero de filas de la pirámide: ");
 filas = input.nextInt();
 
 for(int i = 0; i<filas; i++){
     
    piramide = piramide + "*";
    System.out.println(piramide);
 }
 */
 /*Scanner input = new Scanner (System.in);
 int fil;
 System.out.println("Dime el numero de filas");
 fil = input.nextln();
 for (int x=0; x<9; x++){
    if (x==5){
     System.out.println("*");
     break;
     }
  //  for (){}
 
 }
    */ 
 /*  
 Scanner sc = new Scanner(System.in);
     System.out.println("Introduzca el numero de filas");
     int x = sc.nextInt();
     System.out.println();
     for (int altura=1; altura<=x; altura++){
         for(int blancos=1; blancos<=x-altura; blancos++){
             System.out.print(" ");
         }
            for(int aste=1; aste <=(altura*2)-1; aste++){
              System.out.print("*");  
            }
            System.out.println();
        }
   */
    /*
     Scanner sc = new Scanner(System.in);
     System.out.println("Introduzca el numero de filas");
     int x = sc.nextInt();
     System.out.println();
     for (int altura=1; altura<=x; altura++){
         for(int blancos=1; blancos<=x-altura; blancos++){
             System.out.print(" ");
         }
            for(int aste=1; aste <=(altura*2)-1; aste++){
              System.out.print("<");  
            }
            System.out.println();  
        }
    x--;
    for (int altura=1; altura<=x; altura++){
         for(int blancos=1;blancos<=altura; blancos++){
             System.out.print(" ");
         }
            for (int aste=1; aste<=(x-altura)*2 + 1; aste++){
                System.out.print(">");
                }
            System.out.println();
     }
    */
 
    //Primeros 50 números primos
    int prim, num, resul, divisores;
    prim = resul = num = divisores = 0;
    while(prim<51){
        for (int i=1; i<=num; i++){
            if(num % i == 0){
                divisores ++;
            }
        }
        if(divisores == 2){
            System.out.print(resul +" + "+ num +"= ");
            resul = resul + num;
            System.out.println(resul);
            prim++;
            }
        num++;
	divisores = 0;
        }
    System.out.println("La suma de los primeros 50 números primos es: "+ resul);
    }
}