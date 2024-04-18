/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismoareas;

import java.util.Scanner;

/**
 *
 * @author Nocturno
 */
public class Rectangulo extends Figura{
    Scanner input = new Scanner(System.in);
    private double base;
    private double alt;
  
    public void area(){
        System.out.print("Base: ");
        base = input.nextDouble();
        System.out.print("Altura: ");
        alt = input.nextDouble();
        System.out.println("Area:" +base * alt);
    }
    
}
