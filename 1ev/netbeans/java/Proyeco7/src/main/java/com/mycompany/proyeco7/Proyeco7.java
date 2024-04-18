/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyeco7;

import javax.swing.JOptionPane;

/**
 *
 * @author Nocturno
 */
public class Proyeco7 {

    public static void main(String[] args) {
       //Programa que calcule el area del circulo, triangulo, cuadrado
       //Variables
       double resultado =0;
       String texto="";
       String eleccion= JOptionPane.showInputDialog("Introduce la figura: Triangulo, Circulo, Cuadrado");
       switch (eleccion){
           case "circulo":
              texto = JOptionPane.showInputDialog("Dame el radio, por favor: ");
              int radio = Integer.parseInt(texto);
              resultado=areaCirculo(radio);
              break;
           case "triangulo":
               texto = JOptionPane.showInputDialog("Introduce la base: ");
               int base = Integer.parseInt(texto);
               texto = JOptionPane.showInputDialog("Introduce la altura: ");
               int altura = Integer.parseInt(texto);
               resultado=areaTriangulo(base, altura);
               break;
           case "cuadrado":
               texto = JOptionPane.showInputDialog("Introduce un lado del cuadrado: ");
               int lado = Integer.parseInt(texto);
               resultado=areaCuadrado(lado);
               break;
           default:
               System.out.println("No has introducido una figura correcta");
       }
       System.out.println("El area del "+eleccion+" es "+resultado);
       JOptionPane.showMessageDialog(null, "El area del "+eleccion+" es "+resultado);
    }
    public static double areaCirculo(double radio){
    return Math.PI*(Math.pow(radio, 2));
    }
    public static int areaTriangulo(int base, int altura){
    return base*altura;
    }
    public static int areaCuadrado(int lado){
    return lado*lado;
    }
    
}
