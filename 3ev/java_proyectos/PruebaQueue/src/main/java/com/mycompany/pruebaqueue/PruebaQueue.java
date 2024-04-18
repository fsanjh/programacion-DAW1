
package com.mycompany.pruebaqueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author fsanj
 */
public class PruebaQueue {

    public static void main(String[] args) {
        Queue <String> cola = new LinkedList<>();
        
        cola.add("Nos");
        cola.add("fumigan");
        cola.add("con");
        cola.add("aviones");
        
        System.out.println(cola);
        
        cola.remove();
        System.out.println(cola);
        
        cola.add("chikibai");
        System.out.println(cola);
        
        System.out.println(cola.peek());
        System.out.println(cola.element());
    }
}
