/**
 *
 * @author fsanj
 */
package com.mycompany.poo7_persona;

import java.util.Scanner;

public class POO7_persona {

    public static void main(String[] args) {
        //PRUEBAS
        /*
        Persona persona1 = new Persona();
        System.out.println(persona1.toString());
        
        Persona persona2 = new Persona("nombre", 20, 'H');
        System.out.println(persona2.toString());
        
        Persona persona3 = new Persona("nombre2", 23, "70368454F", 'M', 67.4, 1.70);
        System.out.println(persona3.toString());
        
        Persona persona4 = new Persona("nombre3", 12, "12542398H", 'J', 74, 1.5);
        System.out.println(persona4.toString());
        */
        
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
        String dni;
        char sexo;
        double peso;
        double altura;
        int prueba;
        
        System.out.println("Versión a probar:");
        System.out.println("    0. Todo por defecto");
        System.out.println("    1. Todo personalizado");
        System.out.println("    2. Solo nombre, edad y sexo");
        System.out.println("    3. Todo menos DNI");
        System.out.print("Respuesta: ");
        prueba = input.nextInt(); 
        
        if(prueba == 0){ //todo por defecto
            Persona cero = new Persona();
            System.out.println(cero.toString());
            if(cero.calcularIMC() == -1){
                System.out.println("Está por debajo de su peso ideal");
            }else if(cero.calcularIMC() == 0){
                System.out.println("Está en su peso ideal");
            }else{
                System.out.println("Está por encima de su peso ideal");
            }
            if(cero.esMayorDeEdad()){
                System.out.println(cero.getNombre() +" es mayor de edad");
            }else{
                System.out.println(cero.getNombre() +" es menor de edad");
            }
        }else if(prueba == 1){ //todos los valores
            System.out.print("Introduzca un nombre: ");
            nombre = input.next();
            System.out.print("Introduzca una edad: ");
            edad = input.nextInt();
            System.out.print("Introduzca un DNI: ");
            dni = input.next();
            System.out.print("Introduzca un sexo [H hombre, M mujer]: ");
            sexo = input.next().charAt(0);
            System.out.print("Introduzca un peso en kg [70,5]: ");
            peso = input.nextDouble();
            System.out.print("Introduzca una altura en metros [1,70]: ");
            altura = input.nextDouble();
            
            Persona uno = new Persona(nombre, edad, dni, sexo, peso, altura);
            System.out.println(uno.toString());
            if(uno.calcularIMC() == -1){
                System.out.println("Está por debajo de su peso ideal");
            }else if(uno.calcularIMC() == 0){
                System.out.println("Está en su peso ideal");
            }else{
                System.out.println("Está por encima de su peso ideal");
            }
            if(uno.esMayorDeEdad()){
                System.out.println(nombre +" es mayor de edad");
            }else{
                System.out.println(nombre +" es menor de edad");
            }
        }else if(prueba == 2){ //solo nombre, edad y sexo
            System.out.print("Introduzca un nombre: ");
            nombre = input.next();
            System.out.print("Introduzca una edad: ");
            edad = input.nextInt();
            System.out.print("Introduzca un sexo [H hombre, M mujer]: ");
            sexo = input.next().charAt(0);
            
            Persona dos = new Persona(nombre, edad, sexo);
            System.out.println(dos.toString());
            if(dos.esMayorDeEdad()){
                System.out.println(nombre +" es mayor de edad");
            }else{
                System.out.println(nombre +" es menor de edad");
            }
        }else if(prueba == 3){ //todo menos el dni
            System.out.print("Introduzca un nombre: ");
            nombre = input.next();
            System.out.print("Introduzca una edad: ");
            edad = input.nextInt();
            System.out.print("Introduzca un sexo [H hombre, M mujer]: ");
            sexo = input.next().charAt(0);
            System.out.print("Introduzca un peso en kg [70.5]: ");
            peso = input.nextDouble();
            System.out.print("Introduzca una altura en metros [1.70]: ");
            altura = input.nextDouble();
            
            Persona tres = new Persona();
                tres.setNombre(nombre);
                tres.setEdad(edad);
                tres.setSexo(sexo);
                tres.setPeso(peso);
                tres.setAltura(altura);
            System.out.println(tres.toString());
            if(tres.calcularIMC() < 0){
                System.out.println("Está por debajo de su peso ideal");
            }else if(tres.calcularIMC() > 0){
                System.out.println("Está en su peso ideal");
            }else{
                System.out.println("Está por encima de su peso ideal");
            }
            if(tres.esMayorDeEdad()){
                System.out.println(nombre +" es mayor de edad");
            }else{
                System.out.println(nombre +" es menor de edad");
            }
        }else{
            System.out.println("Adiós");
        }
        
        
        
        
        
        
        
        
        
        
    }
}
