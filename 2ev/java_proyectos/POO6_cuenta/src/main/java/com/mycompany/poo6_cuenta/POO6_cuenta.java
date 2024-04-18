/**
 *
 * @author fsanj
 */
package com.mycompany.poo6_cuenta;


public class POO6_cuenta {

    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Felipe");
        System.out.println(cuenta1.toString());
        cuenta1.ingresar(50);
        cuenta1.retirar(25);
        
        System.out.println("---------------------------");
        
        Cuenta cuenta2 = new Cuenta("Manuel", 250);
        System.out.println(cuenta2.toString());
        cuenta2.ingresar(-50);
        cuenta2.retirar(300);
        
        
        
        
        
    }
}
