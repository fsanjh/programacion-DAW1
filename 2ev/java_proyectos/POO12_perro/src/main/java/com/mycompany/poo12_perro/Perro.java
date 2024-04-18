package com.mycompany.poo12_perro;

/**
 *
 * @author Nocturno
 */
public class Perro {
    private String nombre;
    private int edad;
    
    public Perro (String _nombre, int _edad){
        this.nombre = _nombre;
        this.edad = _edad;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void cambiar (String nombre){
        this.nombre = nombre;
    }
    public void cambiar (int edad){
        this.edad = edad;
    }
    public void cambiar (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    
    
}
