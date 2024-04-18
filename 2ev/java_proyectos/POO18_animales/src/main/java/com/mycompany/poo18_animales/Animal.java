/**
 *
 * @author fsanj
 */

package com.mycompany.poo18_animales;

public class Animal {
    private String nombre;
    private String dieta;
    private int edad;

    public Animal(String _nombre, String _dieta, int _edad) {
        this.nombre = _nombre;
        this.dieta = _dieta;
        this.edad = _edad;
    }

    @Override
    public String toString() {
        return "Nombre: "+ nombre +", dieta: "+ dieta +", edad: "+ edad ;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDieta() {
        return dieta;
    }
    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
