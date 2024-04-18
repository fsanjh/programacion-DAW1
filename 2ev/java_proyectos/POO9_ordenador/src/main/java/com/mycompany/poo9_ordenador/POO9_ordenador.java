/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo9_ordenador;

/**
 *
 * @author Nocturno
 */
public class POO9_ordenador {

    public static void main(String[] args) {
        Teclado tec1 = new Teclado ("Epomaker");
        Ordenador ord1 = new Ordenador (tec1, "Asus");
        Teclado tec2 = new Teclado ("Krom");
        Ordenador ord2 = new Ordenador (tec2, "MSI");
        
        /*No deja porque se necesita usar un objeto Teclado. no un String**/
        //Ordenador ord3 = new Ordenador ("Krom", "Asus"); 
        
        System.out.println("El ordenador "+ ord1.getModelo() + " tiene un teclado "+ ord1.getTeclado().getModelo());
        System.out.println("El ordenador "+ ord2.getModelo() + " tiene un teclado "+ ord2.getTeclado().getModelo());
        
        
        
        
        
    }
}
