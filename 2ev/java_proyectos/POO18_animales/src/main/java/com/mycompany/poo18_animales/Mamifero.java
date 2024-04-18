/**
 *
 * @author fsanj
 */

package com.mycompany.poo18_animales;

public class Mamifero extends Animal{
    private int gestacion;

    public Mamifero(String _nombre, String _dieta, int _edad, int _gestacion) {
        super(_nombre, _dieta, _edad);
        this.gestacion = _gestacion;
    }

    @Override
    public String toString() {
        return super.toString() +", tiempo de gestación: "+ gestacion;
    }

    public int getGestacion() {
        return gestacion;
    }
    public void setGestacion(int gestacion) {
        this.gestacion = gestacion;
    }
    
}
