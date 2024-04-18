
package com.mycompany.pruebastacks;

import java.util.Stack;

/**
 *
 * @author fsanj
 */
public class PruebaStacks {

    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
        
        pila.add(1);
        pila.add(2);
        pila.add(3);
        pila.add(4);
        
        System.out.println("Pila actual: "+ pila.toString());
        System.out.println("Número más arriba: "+ pila.peek());
        System.out.println("------------------------");
        System.out.println("Número más arriba que sera eliminado: "+pila.pop());
        System.out.println("Pila actual: "+ pila.toString());
        System.out.println("------------------------");
        System.out.println("Añadp arriba el número: "+ pila.push(4));
        System.out.println("Pila actual: "+ pila.toString());
        System.out.println("Distancia entre la cima y el 2: "+ pila.search(2));
        System.out.println("------------------------");
        
    }
}
