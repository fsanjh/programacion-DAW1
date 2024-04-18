
package com.mycompany.principalcilindro;

/**
 *
 * @author Nocturno
 */
public class PrincipalCilindro {

    public static void main(String[] args) {
        Cilindro c1 = new Cilindro(2, 5);
        c1.mostrarDatos();
        System.out.println("Area: "+ c1.area() +"\nVolumen: "+ c1.volumen());
        System.out.println("----------------------------------------------------");
        Cilindro c2 = new Cilindro(6, 1);
        c2.mostrarDatos();
        System.out.println("Area: "+ c2.area() +"\nVolumen: "+ c2.volumen());
        System.out.println("----------------------------------------------------");
        Cilindro c3 = new Cilindro(10, 4);
        c3.mostrarDatos();
        System.out.println("Area: "+ c3.area() +"\nVolumen: "+ c3.volumen());
        System.out.println("Area Base: "+ c3.areaBase() +"\nArea Lateral: "+ c3.areaLateral());
        
        
        
        
    }
}
