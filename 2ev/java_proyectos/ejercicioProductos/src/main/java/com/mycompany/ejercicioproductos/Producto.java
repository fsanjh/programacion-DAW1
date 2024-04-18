package com.mycompany.ejercicioproductos;

/**
 *
 * @author Nocturno
 */
public class Producto {
    private String nombre;
    private String fechaCaducidad;
    private int numLote;
    
    public Producto(String _nombre, String _fecha, int _num){
        this.nombre = _nombre;
        this.fechaCaducidad = _fecha;
        this.numLote = _num;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getFechaCaducidad() {
        return fechaCaducidad;
    }
    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getNumLote() {
        return numLote;
    }
    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }
    
    
    
    @Override
    public String toString(){
        return "nombre: "+nombre+", fecha caducidad: "+ fechaCaducidad + ", numero lote: "+ numLote;
    }
    
    
}
