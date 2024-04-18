package com.mycompany.ejercicioproductos;

/**
 *
 * @author Nocturno
 */
public class Congelado extends Producto{
    private double tCongelacion;

    public Congelado(String  _nombre, String _fecha, int _num, double tCongelacion) {
        super( _nombre, _fecha, _num);
        this.tCongelacion = tCongelacion;
    }

    public double gettCongelacion() {
        return tCongelacion;
    }
    public void settCongelacion(double tCongelacion) {
        this.tCongelacion = tCongelacion;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", temperatura congelado: "+ tCongelacion;
    }
    
}
