/**
 *
 * @author fsanj
 */

package com.mycompany.poo17_empleados;

public class Operario extends Empleado {

    public Operario(String _nombre) {
        super(_nombre);
    }
    
    @Override
    public String toString() {
        return super.toString() +" -> operario";
    }
    
}
