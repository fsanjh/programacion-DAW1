/**
 *
 * @author fsanj
 */

package com.mycompany.poo17_empleados;

public class Directivo extends Empleado {

    public Directivo(String _nombre) {
        super(_nombre);
    }
    
    @Override
    public String toString() {
        return super.toString() +" -> directivo";
    }
    
}
