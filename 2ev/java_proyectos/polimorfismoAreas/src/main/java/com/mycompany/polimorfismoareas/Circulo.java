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
public class Circulo extends Figura{
        Scanner input = new Scanner(System.in);
    private double r;

    public void area(){
        System.out.print("Radio: ");
        r = input.nextDouble();
        System.out.println("Area:" + Math.PI * Math.pow(r, 2));
    }
    
}
