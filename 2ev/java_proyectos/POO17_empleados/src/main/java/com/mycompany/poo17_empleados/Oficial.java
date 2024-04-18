/**
 *
 * @author fsanj
 */

package com.mycompany.poo17_empleados;

public class Oficial extends Operario{

    public Oficial(String _nombre) {
        super(_nombre);
    }

    @Override
    public String toString() {
        return super.toString() +" oficial";
    }
    
}
