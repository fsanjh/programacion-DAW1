/**
 *
 * @author fsanj
 */

package com.mycompany.poo17_empleados;

public class POO17_empleados {

    public static void main(String[] args) {
        Empleado E1 = new Empleado("Ivan");
        Directivo D1 = new Directivo("César");
        Operario O1 = new Operario("Alejandro");
        Oficial Of1 = new Oficial("Félix");
        Tecnico T1 = new Tecnico("Mario");
        
        System.out.println(E1);
        System.out.println(D1);
        System.out.println(O1);
        System.out.println(Of1);
        System.out.println(T1);
        
    }
}
