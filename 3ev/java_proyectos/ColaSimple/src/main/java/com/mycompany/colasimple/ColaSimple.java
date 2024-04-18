
package com.mycompany.colasimple;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author fsanj
 */
public class ColaSimple {

    public static void main(String[] args) {
        Queue <Integer> cola = new LinkedList<>();
        
        for(int i = 0; i <= 10; i++){
            cola.add(i);
        }
        System.out.println(cola);
        
        System.out.println("Muestro y elimino el puesto: "+ cola.poll());
        System.out.println(cola);
        System.out.println("------------------------------------------");
        System.out.println("Muestro y elimino el puesto: "+ cola.poll());
        System.out.println(cola);
    }
}
