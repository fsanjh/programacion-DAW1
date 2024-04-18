/**
 *
 * @author fsanj
 */

package com.mycompany.poo14_figurassuperheroes;

public class Dimension {
    private double alto;
    private double ancho;
    private double profundidad;
    
    public Dimension(){
        this.alto = 0;
        this.ancho = 0;
        this.profundidad = 0;
    }
    public Dimension(double _alto, double _ancho, double _profundidad){
        this.alto = _alto;
        this.ancho = _ancho;
        this.profundidad = _profundidad;
    }

    public double getAlto() {
        return alto;
    }
    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getProfundidad() {
        return profundidad;
    }
    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }
    
    public double getVolumen(double alto, double ancho, double profundidad){    
        return (alto * ancho * profundidad);
    }

    @Override
    public String toString() {
        return "\nAlto: "+ alto +"\nAncho: "+ ancho +"\nProfundidad: "+ profundidad +"\nVolumen máximo: "+ getVolumen(ancho, alto, profundidad);
    }
    
    
    
}
