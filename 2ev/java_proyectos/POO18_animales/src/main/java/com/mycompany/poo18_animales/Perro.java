/**
 *
 * @author fsanj
 */

package com.mycompany.poo18_animales;

public class Perro extends Mamifero{
    private String raza;

    public Perro(String _nombre, String _dieta, int _edad, int _gestacion, String _raza) {
        super(_nombre, _dieta, _edad, _gestacion);
        this.raza = _raza;
    }

    @Override
    public String toString() {
        return super.toString() + ", es un perro de raza: "+ raza;
    }

    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
     
}
