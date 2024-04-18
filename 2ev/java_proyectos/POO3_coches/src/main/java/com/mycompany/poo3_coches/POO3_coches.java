
package com.mycompany.poo3_coches;

/**
 *
 * @author Nocturno
 */
public class POO3_coches {

    public static void main(String[] args) {
        Coche coche = new Coche("7894DFG", "Negro estampado", "Seat Ibiza", 145);
        System.out.println(coche.toString());
        /*
        for(int i = 0; i < 10; i++){
            System.out.println(coche.getVelocidad() +"Km/h");
            if(coche.acelerar(20)){
                break;
            }
        }
        if(coche.acelerar(0)){
            System.out.println("El motor ha reventado");
        }
            System.out.println("--------Frenar--------");
            for(int i = 15; i > 5; i--){
                coche.frenar(10);
                System.out.println(coche.getVelocidad() +"Km/h");
            
        }*/
        
        coche.conducir(25);
        
        
        
        
    }
}
