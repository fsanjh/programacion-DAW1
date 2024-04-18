/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo8_universidad;

/**
 *
 * @author Nocturno
 */
public class POO8_universidad {

    public static void main(String[] args) {
        Universidad uni1 = new Universidad("Mondongos");
        Alumno alum1 = new Alumno("Pablo");
        
        System.out.println(alum1.getNombre() +" estudia en "+ uni1.getNombre());
        
    }
}
