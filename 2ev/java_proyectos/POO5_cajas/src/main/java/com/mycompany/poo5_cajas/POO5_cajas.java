/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo5_cajas;

/**
 *
 * @author Nocturno
 */
public class POO5_cajas {

    public static void main(String[] args) {
        Caja caja1 = new Caja(2.3, 2.3, 2.3); //Sería un cubo
        Caja caja2 = new Caja(2.3, 2.3, 2.5); //Debería dar error
        Caja caja3 = new Caja(5.3, 5.3); //Será un cubo
        Caja caja4 = new Caja(1.3, 5.3); //Será un cubo
        Caja caja5 = new Caja(7); //Siempre será un cubo
        
        //caja1.esCubo();
        caja1.toString();
        caja1.volumen();
        System.out.println("----------------");
        //caja2.esCubo();
        caja2.toString();
        caja2.volumen();
        System.out.println("----------------");
        //caja3.esCubo();
        caja3.toString();
        caja3.volumen();
        System.out.println("----------------");
        //caja4.esCubo();
        caja4.toString();
        caja4.volumen();
        System.out.println("----------------");
        //caja5.esCubo();
        caja5.toString();
        caja5.volumen();
        
    }
}
