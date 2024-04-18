/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo4_punto;

/**
 *
 * @author Nocturno
 */
public class POO4_punto {

    public static void main(String[] args) {
        Punto punto1 = new Punto();
            punto1.setX(1);
            punto1.setY(3);
            
        Punto punto2 = new Punto(4, 5);
        
        System.out.println(punto1.distancia(punto2));
    
        
    
    }
    
        
}
