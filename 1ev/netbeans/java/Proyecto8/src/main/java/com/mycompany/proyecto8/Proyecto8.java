/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto8;

import javax.swing.JOptionPane;

/**
 *
 * @author Nocturno
 */
public class Proyecto8 {

    public static void main(String[] args) {
       JOptionPane.showMessageDialog(null, "Programa que calcule el factorial de un numero");
       String texto= JOptionPane.showInputDialog("Introduce un numero:");
       int num1 = Integer.parseInt(texto);
       JOptionPane.showMessageDialog(null, "El factorial de "+num1+" es "+factorial(num1));
    }
   public static long factorial( int num1){
       long factorial =1;
       for (int cont =1; cont<=num1; cont++){
       factorial = factorial*cont;
       }
    return factorial;
    } 
   
   
   
}
