/**
 *
 * @author fsanj
 */

package com.mycompany.poo17_empleados;

public class Empleado {
    private String nombre;
    
    public Empleado(String _nombre) {
        this.nombre = _nombre;
    }
    public Empleado(){}
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado "+ nombre;
    }
    
}
