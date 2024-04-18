/**
 *
 * @author fsanj
 */

package com.mycompany.poo15_cuentav2;


public class POO15_cuentaV2 {

    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta();
        Cuenta cuenta2 = new Cuenta(534012, 200.75);
        
        System.out.println("Dinero en las cuentas: \nCuenta 1: "+ cuenta1.getCuenta() +" | "+ cuenta1.getDinero() +"€\nCuenta 2: " + cuenta2.getCuenta() +" | "+ cuenta2.getDinero()  +"€");
        System.out.println("-------------------------------------------");
        
        System.out.println("Ingreso de dinero en cuenta 1, resultado: "+ cuenta1.ingreso(50));
        System.out.println("Ingreso de dinero en cuenta 1, resultado: "+ cuenta1.ingreso(-25));
        System.out.println("Dinero en la cuenta 1: "+ cuenta1.getDinero() +"€");
        System.out.println("-------------------------------------------");
        
        System.out.println("Retiro de dinero en cuenta 2, resultado: "+ cuenta2.reintegro(50));
        System.out.println("Retiro de dinero en cuenta 2, resultado: "+ cuenta2.reintegro(400));
        System.out.println("Dinero en la cuenta 2: "+ cuenta2.getDinero() +"€");
        System.out.println("-------------------------------------------");
        
        System.out.println("Transferencia a favor de cuenta 1: "+ cuenta2.transferencia(cuenta1, 100.75));
        System.out.println("Transferencia a favor de cuenta 1: "+ cuenta2.transferencia(cuenta1, 400.75));
        System.out.println("Transferencia a favor de cuenta 1: "+ cuenta1.transferencia(cuenta1, 100.75));
        System.out.println("-------------------------------------------");
    
        System.out.println("Dinero en las cuentas: \nCuenta 1: "+ cuenta1.getCuenta() +" | "+ cuenta1.getDinero() +"€\nCuenta 2: " + cuenta2.getCuenta() +" | "+ cuenta2.getDinero()  +"€");
    }
}
