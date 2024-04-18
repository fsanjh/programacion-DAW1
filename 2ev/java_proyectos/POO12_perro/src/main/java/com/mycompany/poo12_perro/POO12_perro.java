package com.mycompany.poo12_perro;

/**
 *
 * @author Nocturno
 */
public class POO12_perro {

    public static void main(String[] args) {
        Perro perro1 = new Perro("Tyson", 9);
        Perro perro2 = new Perro("Ivan", 22);
        Perro perro3 = new Perro("Niebla", 10);
        System.out.println(perro1.getNombre() +" tiene "+ perro1.getEdad() +" años");
        System.out.println(perro2.getNombre() +" tiene "+ perro2.getEdad() +" años");
        System.out.println(perro3.getNombre() +" tiene "+ perro3.getEdad() +" años");
        
        System.out.println();
        perro1.cambiar("Tripas");
        perro2.cambiar(45);
        perro3.cambiar("Chop", 15);
        System.out.println(perro1.getNombre() +" tiene "+ perro1.getEdad() +" años");
        System.out.println(perro2.getNombre() +" tiene "+ perro2.getEdad() +" años");
        System.out.println(perro3.getNombre() +" tiene "+ perro3.getEdad() +" años");
    }
}
