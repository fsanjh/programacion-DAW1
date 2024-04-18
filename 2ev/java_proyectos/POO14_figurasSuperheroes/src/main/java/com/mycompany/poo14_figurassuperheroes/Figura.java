/**
 *
 * @author fsanj
 */

package com.mycompany.poo14_figurassuperheroes;

public class Figura {
    private String codigo;
    private double precio;
    private Dimension dimen;
    private Superheroe superh;
    
    
    public Figura(String _codigo, double _precio, Dimension _dimension, Superheroe _superheroe){
        this.codigo = _codigo;
        this.precio = _precio;
        dimen = _dimension;
        superh = _superheroe;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Superheroe getSuperh() {
        return superh;
    }
    public void setSuperh(Superheroe superh) {
        this.superh = superh;
    }

    public Dimension getDimen() {
        return dimen;
    }
    public void setDimen(Dimension dimen) {
        this.dimen = dimen;
    }

    @Override
    public String toString() {
        return superh.toString() + dimen.toString() +"\nPrecio: "+ this.precio +"\nCodigo: "+ codigo;
    }
    
    public void subirPrecio(double cant){
        this.precio += cant;
    }
    
}
