/**
 *
 * @author fsanj
 */

package com.mycompany.poo17_empleados;

public class Tecnico extends Operario{

    public Tecnico(String _nombre) {
        super(_nombre);
    }

    @Override
    public String toString() {
        return super.toString() +" técnico";
    }
    
}
