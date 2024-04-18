package com.mycompany.ejerciciolegislador;

/**
 *
 * @author Nocturno
 */
public class Persona{
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(){
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
    }

    public Persona(String _nombre, String _apellido, int _edad){
        this.nombre = _nombre;
        this.apellido = _apellido;
        this.edad = _edad;
    }
    

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    @Override
    public String toString(){
        return "Nombre: "+ nombre +" "+ apellido +", Edad: "+ edad;
    }
    
}
    