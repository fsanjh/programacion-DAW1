/**
 *
 * @author fsanj
 */

package com.mycompany.poo18_animales;

public class Caballo extends Mamifero{
    private String raza;
    private int ejercicio;

    public Caballo(String _nombre, String _dieta, int _edad, int _gestacion, String _raza, int _ejercicio ) {
        super(_nombre, _dieta, _edad, _gestacion);
        this.raza = _raza;
        this.ejercicio = _ejercicio;
    }

    @Override
    public String toString() {
        return super.toString() +", es un caballo de raza: "+ raza +", y entrena durante: "+ ejercicio +" horas";
    }

    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEjercicio() {
        return ejercicio;
    }
    public void setEjercicio(int ejercicio) {
        this.ejercicio = ejercicio;
    }

}
